package br.com.cast.filmesangular.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.filmesangular.dto.FilmeDTO;
import br.com.cast.filmesangular.entidade.Filme;
import br.com.cast.filmesangular.repository.FilmeRepository;

@Service
public class FilmeService {

	@Autowired
	private FilmeRepository fRepo;
	
	public List<FilmeDTO> buscarDezPorTitulo(String titulo) {
		List<Filme> filmes = fRepo.buscarDezPorTitulo(titulo);
		List<FilmeDTO> fdtos = new ArrayList<>();
		for (Filme filme : filmes) {
			FilmeDTO fdto = new FilmeDTO();
			fdto.setImdbID(filme.getImdbID());
			fdto.setTitle(filme.getTitle());
			fdto.setYear(filme.getYear());
			fdto.setRated(filme.getRated());
			fdto.setReleased(filme.getReleased());
			fdto.setRuntime(filme.getRuntime());
			fdto.setGenre(filme.getGenre());
			fdto.setDirector(filme.getDirector());
			fdto.setWriter(filme.getWriter());
			fdto.setActors(filme.getActors());
			fdto.setPlot(filme.getPlot());
			fdto.setLanguage(filme.getLanguage());
			fdto.setCountry(filme.getCountry());
			fdto.setAwards(filme.getAwards());
			fdto.setPoster(filme.getPoster());
			fdto.setMetascore(filme.getMetascore());
			fdto.setImdbRating(filme.getImdbRating());
			fdto.setImdbVotes(filme.getImdbVotes());
			fdto.setType(filme.getType());
			fdto.setDVD(filme.getDVD());
			fdto.setBoxOffice(filme.getBoxOffice());
			fdto.setProduction(filme.getProduction());
			fdto.setWebsite(filme.getWebsite());
			fdto.setResponse(filme.getResponse());
			fdtos.add(fdto);
		}
		return fdtos;
		
	}
	
	public void inserir(FilmeDTO fdto) {
		Filme filme = new Filme();
		
		filme.setImdbID(fdto.getImdbID());
		filme.setTitle(fdto.getTitle());
		filme.setYear(fdto.getYear());
		filme.setRated(fdto.getRated());
		filme.setReleased(fdto.getReleased());
		filme.setRuntime(fdto.getRuntime());
		filme.setGenre(fdto.getGenre());
		filme.setDirector(fdto.getDirector());
		filme.setWriter(fdto.getWriter());
		filme.setActors(fdto.getActors());
		filme.setPlot(fdto.getPlot());
		filme.setLanguage(fdto.getLanguage());
		filme.setCountry(fdto.getCountry());
		filme.setAwards(fdto.getAwards());
		filme.setPoster(fdto.getPoster());
		filme.setMetascore(fdto.getMetascore());
		filme.setImdbRating(fdto.getImdbRating());
		filme.setImdbVotes(fdto.getImdbVotes());
		filme.setType(fdto.getType());
		filme.setDVD(fdto.getDVD());
		filme.setBoxOffice(fdto.getBoxOffice());
		filme.setProduction(fdto.getProduction());
		filme.setWebsite(fdto.getWebsite());
		filme.setResponse(fdto.getResponse());
		filme.setResponse(fdto.getResponse());
		fRepo.inserir(filme);
	}
	
	public FilmeDTO buscarPorId(String id) {
		Filme filme = fRepo.buscarPorId(id);
		FilmeDTO fdto = new FilmeDTO();
		fdto.setImdbID(id);
		fdto.setTitle(filme.getTitle());
		fdto.setYear(filme.getYear());
		fdto.setRated(filme.getRated());
		fdto.setReleased(filme.getReleased());
		fdto.setRuntime(filme.getRuntime());
		fdto.setGenre(filme.getGenre());
		fdto.setDirector(filme.getDirector());
		fdto.setWriter(filme.getWriter());
		fdto.setActors(filme.getActors());
		fdto.setPlot(filme.getPlot());
		fdto.setLanguage(filme.getLanguage());
		fdto.setCountry(filme.getCountry());
		fdto.setAwards(filme.getAwards());
		fdto.setPoster(filme.getPoster());
		fdto.setMetascore(filme.getMetascore());
		fdto.setImdbRating(filme.getImdbRating());
		fdto.setImdbVotes(filme.getImdbVotes());
		fdto.setType(filme.getType());
		fdto.setDVD(filme.getDVD());
		fdto.setBoxOffice(filme.getBoxOffice());
		fdto.setProduction(filme.getProduction());
		fdto.setWebsite(filme.getWebsite());
		fdto.setResponse(filme.getResponse());
		return fdto;
	}
	public List<FilmeDTO> buscar20() {
		List<Filme> filmes = fRepo.buscar20();
		List<FilmeDTO> fdtos = new ArrayList<>();
		for (Filme filme : filmes) {
			FilmeDTO fdto = new FilmeDTO();
			fdto.setImdbID(filme.getImdbID());
			fdto.setTitle(filme.getTitle());
			fdto.setYear(filme.getYear());
			fdto.setRated(filme.getRated());
			fdto.setReleased(filme.getReleased());
			fdto.setRuntime(filme.getRuntime());
			fdto.setGenre(filme.getGenre());
			fdto.setDirector(filme.getDirector());
			fdto.setWriter(filme.getWriter());
			fdto.setActors(filme.getActors());
			fdto.setPlot(filme.getPlot());
			fdto.setLanguage(filme.getLanguage());
			fdto.setCountry(filme.getCountry());
			fdto.setAwards(filme.getAwards());
			fdto.setPoster(filme.getPoster());
			fdto.setMetascore(filme.getMetascore());
			fdto.setImdbRating(filme.getImdbRating());
			fdto.setImdbVotes(filme.getImdbVotes());
			fdto.setType(filme.getType());
			fdto.setDVD(filme.getDVD());
			fdto.setBoxOffice(filme.getBoxOffice());
			fdto.setProduction(filme.getProduction());
			fdto.setWebsite(filme.getWebsite());
			fdto.setResponse(filme.getResponse());
			fdtos.add(fdto);
		}
		return fdtos;
		
	}
}
