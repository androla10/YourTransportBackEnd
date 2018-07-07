package com.devinspirare.accesscontrol.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.devinspirare.accesscontrol.dao.UsuarioDAO;
import com.devinspirare.accesscontrol.model.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * @return UsuarioBean -> Usuario validado
	 * 
	 * @since
	 */
	public Usuario validarExistenciaPorCredenciales(String usuario, String clave) {
		String hql = "from Usuario us where us.usuario = ? and us.clave = ?";
		TypedQuery<Usuario> query = entityManager.createQuery(hql, Usuario.class);
		query.setParameter(1, usuario);
		query.setParameter(2, clave);
		return query.getResultList().size() > 0 ? query.getResultList().get(0) : null;
	}

	public List<Usuario> listadoUsuario() {
		String hql = "from Usuario";
		TypedQuery<Usuario> query = entityManager.createQuery(hql, Usuario.class);
		return query.getResultList().size() > 0 ? query.getResultList() : null;
	}

	/**
	 * Metodo encargado de crear un usuario
	 */
	@Transactional
	public void crearUsuario(Usuario usuario) {
		entityManager.persist(usuario);
		usuario.setCodigo("AAAAAAA00000");
		entityManager.merge(usuario);
	}

	public int updateUser(Usuario usuario) {
		entityManager.merge(usuario);
		return 1;
	}

	public int deleteUser(Usuario usuario) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * Metodo encargado de obtener un usuario por el email brindado
	 */
	public Usuario validarExistenciaPorEmail(String email) {
		String hql = "from Usuario us where us.email = ?";
		TypedQuery<Usuario> query = entityManager.createQuery(hql, Usuario.class);
		query.setParameter(1, email);
		return query.getResultList().size() > 0 ? query.getResultList().get(0) : null;
	}

}
