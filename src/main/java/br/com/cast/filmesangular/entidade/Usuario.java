package br.com.cast.filmesangular.entidade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema="filmeangular", name="usuario")
public class Usuario {

	@Id
	@SequenceGenerator(name="usuario_generator", sequenceName="", allocationSize=1)
	@GeneratedValue(generator="usuario_generator")
	private Integer id;
	private String nome;
	private String usuario;
	private String email;
	private String senha;
	@OneToMany(orphanRemoval=true, cascade=CascadeType.ALL, mappedBy="usuario")
	private List<Recomendacoes> recomendacoes = new ArrayList<>();
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
	public List<Recomendacoes> getRecomendacoes() {
		return recomendacoes;
	}
	public void setRecomendacoes(List<Recomendacoes> recomendacoes) {
		this.recomendacoes = recomendacoes;
	}
	
}
