package br.com.cast.filmesangular.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.filmesangular.dto.RecomendacoesDTO;
import br.com.cast.filmesangular.dto.UsuarioDTO;
import br.com.cast.filmesangular.entidade.Recomendacoes;
import br.com.cast.filmesangular.entidade.Usuario;
import br.com.cast.filmesangular.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository uRepo;
	
	public UsuarioDTO buscarPorId(Integer id) {
		
		Usuario usuario = new Usuario();
		try {
			usuario = uRepo.buscarPorId(id);
		} catch (Exception e) {
			return null;
		}
		UsuarioDTO udto = new UsuarioDTO();
		udto.setId(usuario.getId());
		udto.setNome(usuario.getNome());
		udto.setUsuario(usuario.getUsuario());
		udto.setEmail(usuario.getEmail());
		List<Recomendacoes> recs = usuario.getRecomendacoes();
		List<RecomendacoesDTO> recsdto = new ArrayList<>();
		for (Recomendacoes recomendacoes : recs) {
			RecomendacoesDTO rdto = new RecomendacoesDTO();
			rdto.setId(recomendacoes.getId());
			rdto.setTexto(recomendacoes.getTexto());
			rdto.setId_usuario((recomendacoes.getUsuario().getId()));
			rdto.setImdbid_filme(recomendacoes.getFilme().getImdbID());
			recsdto.add(rdto);
		}
		udto.setRecsDTO(recsdto);
		return udto;
	}
	
	public UsuarioDTO logar(String usr, String senha) {
		Usuario usuario = uRepo.buscarPorUsuarioESenha(usr, senha);
		if(usuario == null)
			return null;
		UsuarioDTO udto = new UsuarioDTO();
		udto.setId(usuario.getId());
		udto.setNome(usuario.getNome());
		udto.setUsuario(usuario.getUsuario());
		udto.setEmail(usuario.getEmail());
		List<Recomendacoes> recs = usuario.getRecomendacoes();
		List<RecomendacoesDTO> recsdto = new ArrayList<>();
		for (Recomendacoes recomendacoes : recs) {
			RecomendacoesDTO rdto = new RecomendacoesDTO();
			rdto.setId(recomendacoes.getId());
			rdto.setTexto(recomendacoes.getTexto());
			rdto.setId_usuario((recomendacoes.getUsuario().getId()));
			rdto.setImdbid_filme(recomendacoes.getFilme().getImdbID());
			recsdto.add(rdto);
		}
		udto.setRecsDTO(recsdto);
		return udto;
		
		
	}
	
	public void inserir(UsuarioDTO udto) {
		Usuario usr = new Usuario();
		usr.setId(udto.getId());
		usr.setNome(udto.getNome());
		usr.setUsuario(udto.getUsuario());
		usr.setEmail(udto.getEmail());
		usr.setSenha(udto.getSenha());
		usr.setRecomendacoes(new ArrayList<Recomendacoes>());
		uRepo.inserir(usr);
		
	}
	
	public void remover(Integer id) {
		uRepo.remover(id);
	}
	
}
