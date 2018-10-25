package br.com.cast.filmesangular.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.filmesangular.dto.ComentarioDTO;
import br.com.cast.filmesangular.entidade.Comentario;
import br.com.cast.filmesangular.repository.ComentarioRepository;
import br.com.cast.filmesangular.repository.FilmeRepository;
import br.com.cast.filmesangular.repository.UsuarioRepository;

@Service
public class ComentarioService {

	@Autowired
	private ComentarioRepository cr;
	@Autowired
	private UsuarioRepository ur;
	@Autowired
	private FilmeRepository fr;
	
	public List<ComentarioDTO> buscarTodosDoUsuario(Integer id) {
		List<Comentario> coms = cr.buscarTodosDoUsuario(id); 
		List<ComentarioDTO> cdtos = new ArrayList<>();
		for (Comentario com : coms) {
			ComentarioDTO cdto = new ComentarioDTO();
			cdto.setId(com.getId());
			cdto.setTexto(com.getTexto());
			cdto.setHora(com.getHora());
			cdto.setId_usuario(com.getUsuario().getId());
			cdto.setImdbid_filme(com.getFilme().getImdbID());
			cdto.setNomeUsuario(com.getUsuario().getNome());
			cdtos.add(cdto);
		}
		return cdtos;
				
	}
	
	public List<ComentarioDTO> buscarTodosDoFilme(String imdbId) {
		List<Comentario> coms = cr.buscarTodosDoFilme(imdbId); 
		List<ComentarioDTO> cdtos = new ArrayList<>();
		for (Comentario com : coms) {
			ComentarioDTO cdto = new ComentarioDTO();
			cdto.setId(com.getId());
			cdto.setTexto(com.getTexto());
			cdto.setHora(com.getHora());
			cdto.setId_usuario(com.getUsuario().getId());
			cdto.setImdbid_filme(com.getFilme().getImdbID());
			cdto.setNomeUsuario(com.getUsuario().getNome());
			cdtos.add(cdto);
		}
		System.out.println("BUSCOU MEUS COMENTARIOS DO FILME" + cdtos);
		return cdtos;
	}
	
	public void inserir(ComentarioDTO cdto) {
		Comentario com = new Comentario();
		com.setTexto(cdto.getTexto());
		com.setHora(cdto.getHora());
		com.setUsuario(ur.buscarPorId(cdto.getId_usuario()));
		com.setFilme(fr.buscarPorId(cdto.getImdbid_filme()));
		cr.inserir(com);
	}
	public void remover(Integer id) {
		cr.remover(id);
	}
	public ComentarioDTO buscarPorId(Integer id) {
		Comentario com = cr.buscarPorId(id);
		ComentarioDTO cdto = new ComentarioDTO();
		cdto.setId(com.getId());
		cdto.setTexto(com.getTexto());
		cdto.setHora(com.getHora());
		cdto.setId_usuario(com.getUsuario().getId());
		cdto.setImdbid_filme(com.getFilme().getImdbID());
		cdto.setNomeUsuario(com.getUsuario().getNome());
		return cdto;
	}
}
