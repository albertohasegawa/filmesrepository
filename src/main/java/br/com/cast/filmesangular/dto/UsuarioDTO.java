package br.com.cast.filmesangular.dto;

import java.util.List;

public class UsuarioDTO {

	private Integer id;
	private String nome;
	private String usuario;
	private String email;
	private String senha;
	private List<RecomendacoesDTO> recsDTO;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<RecomendacoesDTO> getRecsDTO() {
		return recsDTO;
	}
	public void setRecsDTO(List<RecomendacoesDTO> recsDTO) {
		this.recsDTO = recsDTO;
	}

	
	
}
