package com.devinspirare.internaldata.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devinspirare.internaldata.dao.SocioDAO;
import com.devinspirare.internaldata.dao.TipoDocumentoIdentidadDAO;
import com.devinspirare.internaldata.dto.SocioDTO;
import com.devinspirare.internaldata.model.Socio;
import com.devinspirare.internaldata.model.TipoDocumentoIdentidad;
import com.devinspirare.internaldata.service.SocioService;

@Service
@Transactional
public class SocioServiceImpl implements SocioService{
	
	@Autowired
	private SocioDAO socioDAO;
	
	@Autowired
	private TipoDocumentoIdentidadDAO tipoDocumentoIdentidadDAO;
	
	@Override
	public void registrar(SocioDTO socioDTO) {
		Socio socio = new Socio();
		socio.setDescripcion(socioDTO.getRazonSocial());
		//Agregamdo tipo de documento identidad al producto
		TipoDocumentoIdentidad tipoDocumentoIdentidad =tipoDocumentoIdentidadDAO.obtenerTipoDocumento(socioDTO.getTipoDocumento().toString());
		socio.setIdTipoDocumento(tipoDocumentoIdentidad);
		
		socio.setDescripcion(socioDTO.getRazonSocial());
		socio.setNumeroDocumento(socioDTO.getNumeroDocumento());
		socioDAO.registrar(socio);
	}

}
