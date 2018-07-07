package com.devinspirare.internaldata.service;

import java.util.List;

import com.devinspirare.internaldata.dto.InventarioDTO;

public interface InventarioService {

	List<InventarioDTO> obtenerProductos();

	void registrarInventario(InventarioDTO inventarioDTO);
}
