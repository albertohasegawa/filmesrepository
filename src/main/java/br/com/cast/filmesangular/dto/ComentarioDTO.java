package br.com.cast.filmesangular.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ComentarioDTO {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("texto")
	private String texto;
	@JsonProperty("hora")
	private Date hora;
	@JsonProperty("nomeUsuario")
	private String nomeUsuario;
	@JsonProperty("id_usuario")
	private Integer id_usuario;
	@JsonProperty("imdbId")
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
	public Date getHora() {
		return hora;
	}
	public void setHora(Date hora) {
		this.hora = hora;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
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
	@Override
	public String toString() {
		return "ComentarioDTO [id=" + id + ", texto=" + texto + ", hora=" + hora + ", nomeUsuario=" + nomeUsuario
				+ ", id_usuario=" + id_usuario + ", imdbid_filme=" + imdbid_filme + "]";
	}
	
}
