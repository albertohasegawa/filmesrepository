package br.com.cast.filmesangular.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cast.filmesangular.entidade.Recomendacoes;

@Repository
public class RecomendacoesRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Recomendacoes buscarPorId(Integer id) {
		return (Recomendacoes) em.find(Recomendacoes.class, id);
	}
	
	public List<Recomendacoes> buscarTodos() {
		Query query = em.createNamedQuery("FROM " + Recomendacoes.class.getName());
		return query.getResultList();
	}
	
	public List<Recomendacoes> buscarTodosDoUsuario(Integer id) {
		Query query = em.createNamedQuery("FROM " + Recomendacoes.class.getName() + " WHERE id_usuario = :id");
		query.setParameter("id", id);
		return query.getResultList();
	}
	
	public List<Recomendacoes> buscarCincoDoUsuario(Integer id) {
		Query query = em.createNamedQuery("FROM " + Recomendacoes.class.getName() + " WHERE id_usuario = :id");
		query.setParameter("id", id);
		query.setMaxResults(5);
		return query.getResultList();
	}
	
	@Transactional
	public void inserir(Recomendacoes rec) {
		em.merge(rec);
	}
	
	@Transactional
	public void remover(Integer id) {
		em.remove(buscarPorId(id));
	}
	
}


