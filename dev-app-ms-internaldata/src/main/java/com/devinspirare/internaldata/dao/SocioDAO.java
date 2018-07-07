package com.devinspirare.internaldata.dao;

import com.devinspirare.internaldata.model.Socio;

public interface SocioDAO {
	
	Socio buscar(Integer id);
	
	public void registrar(Socio socio);
}
