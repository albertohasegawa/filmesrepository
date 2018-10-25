package br.com.cast.filmesangular.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.filmesangular.dto.FilmeDTO;
import br.com.cast.filmesangular.dto.OmdbSearchDTO;
import br.com.cast.filmesangular.dto.SearchDTO;
import br.com.cast.filmesangular.entidade.Search;
import br.com.cast.filmesangular.repository.SearchRepository;

@Service
public class SearchService {

	@Autowired
	private SearchRepository sr;
	@Autowired
	private FilmeService fs;
	
	public List<SearchDTO> buscar20PorTitulo(String titulo) {
		List<Search> search = sr.buscar20PorTitulo(titulo);
		List<SearchDTO> sdtos = new ArrayList<>();
		for (Search sch : search) {
			SearchDTO sdto = new SearchDTO();
			sdto.setImdbID(sch.getImdbid());
			sdto.setTitle(sch.getTitle());
			sdto.setYear(sch.getYear());
			sdto.setType(sch.getType());
			sdto.setPoster(sch.getPoster());
			sdtos.add(sdto);
		}
		return sdtos;
	}
	
	public List<SearchDTO> buscarTodos() {
		List<Search> search = sr.buscarTodos();
		List<SearchDTO> sdtos = new ArrayList<>();
		for (Search sch : search) {
			SearchDTO sdto = new SearchDTO();
			sdto.setImdbID(sch.getImdbid());
			sdto.setTitle(sch.getTitle());
			sdto.setYear(sch.getYear());
			sdto.setType(sch.getType());
			sdto.setPoster(sch.getPoster());
			sdtos.add(sdto);
		}
		return sdtos;
		
	}
	public FilmeDTO buscarDetalhes(String imdbId) {
		try {
			FilmeDTO fdto = fs.buscarPorId(imdbId);
			return fdto;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void inserirTodos(OmdbSearchDTO busca) {
		List<SearchDTO> searchs = busca.getSearch();
		for (SearchDTO sdto : searchs) {
			Search sch = new Search();
			sch.setImdbid(sdto.getImdbID());
			sch.setTitle(sdto.getTitle());
			sch.setYear(sdto.getYear());
			sch.setType(sdto.getType());
			sch.setPoster(sdto.getPoster());
			sr.inserir(sch);
		}
	}
 }
