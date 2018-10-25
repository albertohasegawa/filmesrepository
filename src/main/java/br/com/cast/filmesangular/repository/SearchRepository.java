package br.com.cast.filmesangular.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cast.filmesangular.entidade.Filme;
import br.com.cast.filmesangular.entidade.Search;

@Repository
public class SearchRepository {

	@PersistenceContext
	private EntityManager em;
	
	
	public List<Search> buscar20PorTitulo(String titulo) {
		titulo = titulo
			    .replace("!", "!!")
			    .replace("%", "!%")
			    .replace("_", "!_")
			    .replace("[", "![");
		titulo = titulo.toLowerCase();
		Query query = em.createQuery("FROM " + Search.class.getName() + " WHERE lower(title) like :titulo"); 
		query.setParameter("titulo", "%" + titulo + "%").setMaxResults(20);
		List<Search> lista = (List<Search>) query.getResultList();
		System.out.println(lista.size());
		if(lista.size() == 0)
			return null;
		else
			return lista;
	}
	
	public List<Search> buscarTodos(){
		return em.createQuery("FROM " + Search.class.getName()).getResultList();
	}
	
	@Transactional
	public void inserir(Search search) {
		em.merge(search);
	}
	
	@Transactional
	public void remover(String imdbId) {
		em.remove(buscarPorImdbID(imdbId));
	}
	public void buscarPorId(Integer id) {
		em.find(Search.class, id);
	}
	public Search buscarPorImdbID(String imdbId) {
		Query query = em.createQuery("FROM " + Search.class.getName() + " WHERE imdbid = :imdbid");
		query.setParameter("imdbid", imdbId);
		return (Search) query.getSingleResult();
	}
}
