package com.devinspirare.accesscontrol.dao;

import com.devinspirare.accesscontrol.model.TipoDocumentoIdentidad;

public interface TipoDocumentoIdentidadDAO {

	/**
	 * Metodo para obtener el tipo de documento
	 * @param id
	 * @return TipoDocumentoIdentidad
	 */
	public TipoDocumentoIdentidad obtenerTipoDocumento(String id);
	
	public void registrarTipoDocumento(TipoDocumentoIdentidad tipoDocumentoIdentidad);
}
