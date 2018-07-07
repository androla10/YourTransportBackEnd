package com.devinspirare.internaldata.ws.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devinspirare.internaldata.dao.ProductoDAO;
import com.devinspirare.internaldata.dto.ProductoDTO;
import com.devinspirare.internaldata.dto.RespuestaGenerica;
import com.devinspirare.internaldata.enumeration.CodigoRespuesta;
import com.devinspirare.internaldata.model.Producto;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
	
	private static final Logger log = LogManager.getLogger(ProductoController.class);

	@Autowired
	private ProductoDAO productoDAO;
	
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.POST, value = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public RespuestaGenerica registrarInventarioProducto(@RequestBody ProductoDTO productoDTO) {
		try {
			
			Producto product = new Producto();
			product.setNombreProducto(productoDTO.getDescripcion());
			
			productoDAO.registrar(product);
			return new RespuestaGenerica(CodigoRespuesta.SUCCESS.getCode(),
					"Se ha registrado correctamente el servicio");
		} catch (Exception e) {
			log.error("Ha ocurrido un error : " + e.getMessage());
			return new RespuestaGenerica(CodigoRespuesta.ERROR.getCode(),
					"No se ha podido realizar la grabación del producto.");
		}
	}
}
