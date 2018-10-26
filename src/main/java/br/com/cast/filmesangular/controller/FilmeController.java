package br.com.cast.filmesangular.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.filmesangular.client.FilmeClient;
import br.com.cast.filmesangular.dto.ComentarioDTO;
import br.com.cast.filmesangular.dto.FilmeDTO;
import br.com.cast.filmesangular.dto.OmdbSearchDTO;
import br.com.cast.filmesangular.dto.SearchDTO;
import br.com.cast.filmesangular.service.ComentarioService;
import br.com.cast.filmesangular.service.FilmeService;
import br.com.cast.filmesangular.service.SearchService;

@RestController
@RequestMapping("/")
public class FilmeController {

	@Autowired
	private FilmeService fs;
	@Autowired
	private FilmeClient fc;
	@Autowired
	private SearchService ss;
	@Autowired
	private ComentarioService cs;
	
	@RequestMapping(path="filme/buscaId", method=RequestMethod.GET)
	public FilmeDTO buscarPorId(@RequestParam("id") String id) {
		try {
			System.out.println("BUSCOU NO MEU BANCO" + fs.buscarPorId(id));
			return fs.buscarPorId(id);
		} catch (Exception e) {
			FilmeDTO fdto = fc.buscarPorId(id);
			fs.inserir(fdto);
			System.out.println("BUSCOU NO OMDB" + fdto);
			return fdto;

		}	
	}
	
	@RequestMapping(path="filme/buscar20", method=RequestMethod.GET)
	public List<FilmeDTO> buscarTodos() {
		try {
			System.out.println("BUSCOU NO MEU BANCO");
			return fs.buscar20();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	@RequestMapping(path="filme/buscaT", method=RequestMethod.GET)
	public List<SearchDTO> buscarPorTitulo(@RequestParam("t") String titulo) {
		List<SearchDTO> busca = new ArrayList<>();
		try {
			busca = ss.buscar20PorTitulo(titulo);
			System.out.println("BUSCOU NO MEU BANCO" + busca);
			return busca;
		} catch (Exception e) {
			e.printStackTrace();
			OmdbSearchDTO omdb = fc.buscarPorTitulo(titulo);
			ss.inserirTodos(omdb);
			busca = ss.buscar20PorTitulo(titulo);
			System.out.println(busca);
			return busca;

		}	
	}
	
	@RequestMapping(path="filme/buscarDetalhes", method=RequestMethod.GET)
	public FilmeDTO buscarDetalhes(@RequestParam("id") String imdbId) {
		FilmeDTO fdto = new FilmeDTO();
		try {
			fdto = ss.buscarDetalhes(imdbId);
			System.out.println("BUSCOU NO MEU BANCO " + fdto);
			return fdto;
		} catch (Exception e) {
			e.printStackTrace();
			fdto = fc.buscarPorId(imdbId);
			System.out.println("BUSCOU NO OMDB " + fdto);
			return fdto;
			
		}
		
	}
	
	@RequestMapping(path="comentario/postar", method=RequestMethod.POST)
	public void postarComentario(@RequestBody ComentarioDTO cdto) {
		cs.inserir(cdto);
	}
	@RequestMapping(path="comentario/comdofilme", method=RequestMethod.GET)
	public List<ComentarioDTO> buscarComentariosDoFilme(@RequestParam("imdbid") String imdbId) {
		System.out.println("IMDB QUE EU PSASEEI DO SITE" + imdbId);
		return cs.buscarTodosDoFilme(imdbId);
	}
	
	@RequestMapping(path="comentario/comdousr", method=RequestMethod.GET)
	public List<ComentarioDTO> buscarComentariosDoUsuario(@RequestParam("usr") Integer id) {
		return cs.buscarTodosDoUsuario(id);
	}
	
	@RequestMapping(path="comentario/top20", method=RequestMethod.GET)
	public List<FilmeDTO> buscarTop20() {
		return fs.top20();
	}
}
