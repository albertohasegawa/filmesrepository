package br.com.cast.filmesangular.client;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.cast.filmesangular.dto.FilmeDTO;

@Component
public class FilmeClient {

	private static final String OMDB_URL = "http://www.omdbapi.com/?";
	private static final String API_KEY = "&apikey=cffeece6";
	
	private final RestTemplate rt;
	
	public FilmeClient(RestTemplateBuilder rtb) {
		this.rt = rtb.build();
	}
	
	public FilmeDTO buscarPorId(String id) {
		String idBusca = "i=" + id;
		System.out.println(idBusca);
		System.out.println(OMDB_URL + idBusca + API_KEY);
		FilmeDTO resultado = this.rt.getForObject((OMDB_URL + idBusca + API_KEY), FilmeDTO.class);
		System.out.println(resultado);
		System.out.println(resultado.getTitle());
		return resultado;
	}
	
	public FilmeDTO buscarPorTitulo(String titulo) {
		String tBusca = "t=" + titulo;
		FilmeDTO resultado = this.rt.getForObject(OMDB_URL + tBusca + API_KEY, FilmeDTO.class);
		System.out.println(resultado);
		return resultado;
	}
	
}
