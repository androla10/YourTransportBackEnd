package com.devinspirare.internaldata.ws.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devinspirare.internaldata.dto.RespuestaGenerica;
import com.devinspirare.internaldata.dto.VentaDTO;
import com.devinspirare.internaldata.enumeration.CodigoRespuesta;
import com.devinspirare.internaldata.service.VentaService;

@RestController
@RequestMapping("/api/venta")
public class VentaController {

	@Autowired
	private VentaService ventaService;

	/**
	 * Metodo encargado de registrar la venta
	 * 
	 * @param ventaDTO
	 * @return RespuestaGenerica
	 */
	@RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public RespuestaGenerica registrarVenta(@RequestBody VentaDTO ventaDTO) {
		try {
			ventaService.registrarVenta(ventaDTO);
			return new RespuestaGenerica(CodigoRespuesta.SUCCESS.getCode(), "Se ha registrado correctamente la venta");
		} catch (Exception e) {
			return new RespuestaGenerica(CodigoRespuesta.ERROR.getCode(), "No se ha podido registrar la venta");
		}
	}

}