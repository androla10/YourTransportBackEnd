package com.devinspirare.internaldata.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.devinspirare.internaldata.dao.TipoDocumentoIdentidadDAO;
import com.devinspirare.internaldata.model.TipoDocumentoIdentidad;

@Repository
public class TipoDocumentoIdentidadDAOImpl implements TipoDocumentoIdentidadDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public TipoDocumentoIdentidad obtenerTipoDocumento(String id) {
		return entityManager.find(TipoDocumentoIdentidad.class, id);
	}

	@Transactional
	public void registrarTipoDocumento(TipoDocumentoIdentidad tipoDocumentoIdentidad) {
		entityManager.persist(tipoDocumentoIdentidad);
	}

}
