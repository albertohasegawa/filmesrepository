package br.com.cast.filmesangular.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import br.com.cast.filmesangular.entidade.Search;

@Repository
public class SearchRepository {

	@PersistenceContext
	private EntityManager em;
	
	
	public List<Search> buscar20() {
		return em.createQuery("FROM " + Search.class.getName()).setMaxResults(20).getResultList();
	}
	
	public List<Search> buscarTodos(){
		return em.createQuery("FROM " + Search.class.getName()).getResultList();
	}
	
	public void inserir(Search search) {
		em.merge(search);
	}
	
	public void remover(String imdbid) {
		em.remove(buscarPorImdbID(imdbid));
	}
	public void buscarPorId(Integer id) {
		em.find(Search.class, id);
	}
	public Search buscarPorImdbID(String imdbid) {
		Query query = em.createQuery("FROM " + Search.class.getName() + " WHERE imdbid = :imdbid");
		query.setParameter("imdbid", imdbid);
		return (Search) query.getSingleResult();
	}
}
