package br.com.cast.filmesangular.dto;

public class RecomendacoesDTO {

	private Integer id;
	private String texto;
	private Integer id_usuario;
	private String imdbid_filme;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getImdbid_filme() {
		return imdbid_filme;
	}
	public void setImdbid_filme(String imdbid_filme) {
		this.imdbid_filme = imdbid_filme;
	}

	
	
}
