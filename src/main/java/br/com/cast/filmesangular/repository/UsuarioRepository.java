package br.com.cast.filmesangular.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cast.filmesangular.entidade.Usuario;

@Repository
public class UsuarioRepository {

	@PersistenceContext
	private EntityManager em;
	
	public Usuario buscarPorId(Integer id) {
		return (Usuario) em.find(Usuario.class, id);
	}
	
	public Usuario buscarPorUsuarioESenha(String usr, String senha) {
		try {
			Query query = em.createQuery("FROM " + Usuario.class.getName() + " WHERE usuario = :usr AND senha = :senha");
			query.setParameter("usr", usr);
			query.setParameter("senha", senha);
			return (Usuario) query.getSingleResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	@Transactional
	public void inserir(Usuario usuario) {
		em.persist(usuario);
	}
	
	@Transactional
	public void remover(Integer id) {
		em.remove(buscarPorId(id));
	}
}
