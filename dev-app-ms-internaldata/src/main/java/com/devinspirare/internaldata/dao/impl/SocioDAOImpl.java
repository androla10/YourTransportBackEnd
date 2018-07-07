package com.devinspirare.internaldata.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.devinspirare.internaldata.dao.SocioDAO;
import com.devinspirare.internaldata.model.Socio;

@Repository
@Transactional
public class SocioDAOImpl implements SocioDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Socio buscar(Integer id) {
		return entityManager.find(Socio.class, id);
	}

	@Override
	public void registrar(Socio socio) {
		entityManager.persist(socio);
	}

}
