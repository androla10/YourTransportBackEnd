package com.devinspirare.internaldata.dao;

import java.util.List;

import com.devinspirare.internaldata.model.Inventario;

public interface InventarioDAO {
	
	public List<Inventario> obtenerProductos();
	
	public void registrarInventarioWithProducto(Inventario inventario);
}
