package br.com.cast.filmesangular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.filmesangular.client.FilmeClient;
import br.com.cast.filmesangular.dto.FilmeDTO;
import br.com.cast.filmesangular.dto.SearchDTO;
import br.com.cast.filmesangular.service.FilmeService;

@RestController
@RequestMapping("/")
public class FilmeController {

	@Autowired
	private FilmeService fs;
	@Autowired
	private FilmeClient fc;
	
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
	
	@RequestMapping(path="filme/buscaT", method=RequestMethod.GET)
	public List<FilmeDTO> buscarPorTitulo(@RequestParam("t") String titulo) {
		List<FilmeDTO> filmes;
		try {
			filmes = fs.buscarDezPorTitulo(titulo);
			System.out.println("BUSCOU NO MEU BANCO" + filmes);
			return filmes;
		} catch (Exception e) {
			e.printStackTrace();
			FilmeDTO fdto = fc.buscarPorTitulo(titulo);
			for (SearchDTO search: fdto.getSearch()) {
				FilmeDTO newfdto = buscarPorId(search.getImdbID());
				System.out.println("BUSCOU NO OMDB" + newfdto);
				fs.inserir(newfdto);
			}
			filmes = fs.buscarDezPorTitulo(titulo);
			System.out.println(filmes);
			return filmes;

		}	
	}
	
	
}
