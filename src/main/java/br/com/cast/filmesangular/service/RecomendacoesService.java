package br.com.cast.filmesangular.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cast.filmesangular.dto.RecomendacoesDTO;
import br.com.cast.filmesangular.entidade.Recomendacoes;
import br.com.cast.filmesangular.repository.FilmeRepository;
import br.com.cast.filmesangular.repository.RecomendacoesRepository;
import br.com.cast.filmesangular.repository.UsuarioRepository;

@Service
public class RecomendacoesService {

	@Autowired
	private RecomendacoesRepository rRepo;
	@Autowired
	private UsuarioRepository uRepo;
	@Autowired
	private FilmeRepository fRepo;

	public List<RecomendacoesDTO> buscarTodos() {
		List<Recomendacoes> recs = rRepo.buscarTodos();
		List<RecomendacoesDTO> recsdto = new ArrayList<>();
		for (Recomendacoes recomendacoes : recs) {
			RecomendacoesDTO rdto = new RecomendacoesDTO();
			rdto.setId(recomendacoes.getId());
			rdto.setTexto(recomendacoes.getTexto());
			rdto.setId_usuario(recomendacoes.getUsuario().getId());
			rdto.setImdbid_filme(recomendacoes.getFilme().getImdbID());
			recsdto.add(rdto);
		}
		return recsdto;
	}

	public List<RecomendacoesDTO> buscarCincoDoUsuario(Integer id) {
		List<Recomendacoes> recs = rRepo.buscarCincoDoUsuario(id);
		List<RecomendacoesDTO> recsdto = new ArrayList<>();
		for (Recomendacoes recomendacoes : recs) {
			RecomendacoesDTO rdto = new RecomendacoesDTO();
			rdto.setId(recomendacoes.getId());
			rdto.setTexto(recomendacoes.getTexto());
			rdto.setId_usuario(recomendacoes.getUsuario().getId());
			rdto.setImdbid_filme(recomendacoes.getFilme().getImdbID());
			recsdto.add(rdto);
		}
		return recsdto;
	}

	public List<RecomendacoesDTO> buscarTodosDoUsuario(Integer id) {
		List<Recomendacoes> recs = rRepo.buscarTodosDoUsuario(id);
		List<RecomendacoesDTO> recsdto = new ArrayList<>();
		for (Recomendacoes recomendacoes : recs) {
			RecomendacoesDTO rdto = new RecomendacoesDTO();
			rdto.setId(recomendacoes.getId());
			rdto.setTexto(recomendacoes.getTexto());
			rdto.setId_usuario(recomendacoes.getUsuario().getId());
			rdto.setImdbid_filme(recomendacoes.getFilme().getImdbID());
			recsdto.add(rdto);
		}
		return recsdto;
	}

	public RecomendacoesDTO buscarPorId(Integer id) {
		Recomendacoes rec = rRepo.buscarPorId(id);
		RecomendacoesDTO rdto = new RecomendacoesDTO();
		
		rdto.setId(rec.getId());
		rdto.setTexto(rec.getTexto());
		rdto.setId_usuario(rec.getUsuario().getId());
		rdto.setImdbid_filme(rec.getFilme().getImdbID());
		return rdto;
	}
	
	@Transactional
	public void inserir(RecomendacoesDTO rdto) {
		Recomendacoes rec = new Recomendacoes();
		rec.setId(rdto.getId());
		rec.setTexto(rdto.getTexto());
		rec.setUsuario(uRepo.buscarPorId(rdto.getId_usuario()));
		rec.setFilme(fRepo.buscarPorId(rdto.getImdbid_filme()));
		rRepo.inserir(rec);
		
	}
	
	@Transactional
	public void remover(Integer id) {
		rRepo.remover(id);
	}

}
