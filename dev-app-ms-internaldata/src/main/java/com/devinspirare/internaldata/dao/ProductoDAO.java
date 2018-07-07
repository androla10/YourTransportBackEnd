package com.devinspirare.internaldata.dao;

import com.devinspirare.internaldata.model.Producto;

public interface ProductoDAO {
	
	public Producto buscar(Integer id);
	
	public void registrar(Producto producto);
	
	public Producto modificar(Producto producto);
	
}
