package com.devinspirare.internaldata.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RespuestaGenerica {
	private int codigoRespuesta;
	private String message;

	public RespuestaGenerica(int codigoRespuesta, String message) {
		this.codigoRespuesta = codigoRespuesta;
		this.message = message;
	}

	public RespuestaGenerica() {
	}


	public int getCodigoRespuesta() {
		return codigoRespuesta;
	}

	public void setCodigoRespuesta(int codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
