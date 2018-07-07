package com.devinspirare.internaldata.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.devinspirare.internaldata.dao.InventarioDAO;
import com.devinspirare.internaldata.model.Inventario;

@Repository
public class InventarioDAOImpl implements InventarioDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public List<Inventario> obtenerProductos() {
		String hql = "from Inventario inv";
		TypedQuery<Inventario> query = entityManager.createQuery(hql, Inventario.class);
		return query.getResultList();
	}

	@Override
	public void registrarInventarioWithProducto(Inventario inventario) {
		entityManager.persist(inventario);
	}

}
