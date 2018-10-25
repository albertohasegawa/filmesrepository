package br.com.cast.filmesangular.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cast.filmesangular.entidade.Comentario;

@Repository
public class ComentarioRepository {

	@PersistenceContext
	private EntityManager em;
	
	public List<Comentario> buscarTodosDoFilme(String imdbId) {
		Query query = em.createQuery("FROM " + Comentario.class.getName() + " WHERE imdbid_filme = :imdbid");
		query.setParameter("imdbid", imdbId);
		return query.getResultList();
	}
	
	public List<Comentario> buscarTodosDoUsuario(Integer id) {
		Query query = em.createQuery("FROM " + Comentario.class.getName() + " WHERE id_usuario = :id");
		query.setParameter("id_usuario", id);
		return query.getResultList();
	}
	@Transactional
	public void inserir(Comentario com) {
		em.merge(com);
	}
	@Transactional
	public void remover(Integer id) {
		em.remove(buscarPorId(id));
	}
	public Comentario buscarPorId(Integer id) {
		return em.find(Comentario.class, id);
	}
	
	
	
}
