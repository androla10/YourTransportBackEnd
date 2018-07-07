package com.devinspirare.internaldata.ws.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devinspirare.internaldata.dto.InventarioDTO;
import com.devinspirare.internaldata.dto.RespuestaGenerica;
import com.devinspirare.internaldata.enumeration.CodigoRespuesta;
import com.devinspirare.internaldata.service.InventarioService;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

	@Autowired
	private InventarioService inventarioService;

	/*
	 * Metodo encargado de obtener la lista de productos asociados a los socios
	 */
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.GET, value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<InventarioDTO> obtenerTodosProductos() {
		return inventarioService.obtenerProductos();
	}

	@RequestMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.POST, value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public RespuestaGenerica registrarInventarioProducto(@RequestBody InventarioDTO inventarioDTO) {
		try {
			inventarioService.registrarInventario(inventarioDTO);
			return new RespuestaGenerica(CodigoRespuesta.SUCCESS.getCode(),
					"Se ha registrado correctamente el servicio");
		} catch (Exception e) {
			return new RespuestaGenerica(CodigoRespuesta.ERROR.getCode(),
					"No se ha podido realizar la grabación del inventario.");
		}
	}
}
