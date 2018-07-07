package com.devinspirare.internaldata.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devinspirare.internaldata.dao.InventarioDAO;
import com.devinspirare.internaldata.dao.ProductoDAO;
import com.devinspirare.internaldata.dao.SocioDAO;
import com.devinspirare.internaldata.dto.InventarioDTO;
import com.devinspirare.internaldata.model.Inventario;
import com.devinspirare.internaldata.model.Producto;
import com.devinspirare.internaldata.model.Socio;
import com.devinspirare.internaldata.service.InventarioService;

@Service
public class InventarioServiceImpl implements InventarioService {

	@Autowired
	private InventarioDAO inventarioDAO;

	@Autowired
	private ProductoDAO productoDAO;

	@Autowired
	private SocioDAO socioDAO;

	public List<InventarioDTO> obtenerProductos() {
		List<Inventario> listadoProductos = inventarioDAO.obtenerProductos();
		List<InventarioDTO> listadoProductosDTO = new ArrayList<InventarioDTO>();
		listadoProductos.forEach(h -> {
			listadoProductosDTO
					.add(new InventarioDTO(h.getPrecio(), h.getCantidadStock(), h.getProducto().getNombreProducto(), "",
							h.getSocio().getDescripcion(), h.getProducto().getId(), h.getSocio().getIdSocio()));
		});
		return listadoProductosDTO;
	}

	@Override
	@Transactional
	public void registrarInventario(InventarioDTO inventarioDTO) {
		// Buscamos el producto
		Producto productoBuscado = productoDAO.buscar(inventarioDTO.getIdProducto());

		// Buscamos al socio
		Socio socioBuscado = socioDAO.buscar(inventarioDTO.getIdSocio());

		// Comenzamos a registrarlo en la clase Inventario
		Inventario inventario = new Inventario();
		inventario.setProducto(productoBuscado);
		inventario.setSocio(socioBuscado);
		inventario.setUrlImage(inventarioDTO.getUrlImage());
		inventario.setPrecio(inventarioDTO.getPrecio());
		inventario.setCantidadStock(inventarioDTO.getCantidadStock());

		inventarioDAO.registrarInventarioWithProducto(inventario);
	}

}
