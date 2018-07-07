package com.devinspirare.internaldata.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.devinspirare.internaldata.dao.ProductoDAO;
import com.devinspirare.internaldata.model.Producto;

@Repository
@Transactional
public class ProductoDAOImpl implements ProductoDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void registrar(Producto producto) {
		entityManager.persist(producto);
	}

	@Override
	public Producto modificar(Producto producto) {
		return entityManager.merge(producto);
	}

	@Override
	public Producto buscar(Integer id) {
		return entityManager.find(Producto.class, id);
	}

}
