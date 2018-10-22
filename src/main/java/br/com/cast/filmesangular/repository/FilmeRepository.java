package br.com.cast.filmesangular.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cast.filmesangular.entidade.Filme;

@Repository
public class FilmeRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	public List<Filme> buscarDezPorTitulo(String titulo) {
		titulo = titulo
			    .replace("!", "!!")
			    .replace("%", "!%")
			    .replace("_", "!_")
			    .replace("[", "![");
		Query query = em.createQuery("FROM " + Filme.class.getName() + " WHERE title like :titulo");
		query.setParameter("titulo", "%" + titulo + "%");
		query.setMaxResults(10);
		List<Filme> lista =	(List<Filme>) query.getResultList();
		System.out.println(lista.size());
		if(lista.size() == 0)
			return null;
		else
			return lista;
	}
	
	public Filme buscarPorId(String imdbID) {
		
		Query query = em.createQuery("FROM " + Filme.class.getName() + " WHERE imdbid = :id ");
		query.setParameter("id", imdbID);
		return (Filme) query.getSingleResult();

	}
	
	@SuppressWarnings("unchecked")
	public List<Filme> buscarTodos() {
		return em.createQuery("FROM " + Filme.class.getName()).getResultList();
	}
	
	@Transactional
	public void inserir(Filme filme) {
		em.merge(filme);
	}
	
	
}
