package com.devinspirare.internaldata.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "Socio")
@Entity
public class Socio implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idSocio;
	private String descripcion;
	private TipoDocumentoIdentidad idTipoDocumento;
	private String numeroDocumento;
	
	public Socio() {}
	
	public Integer getIdSocio() {
		return idSocio;
	}
	public void setIdSocio(Integer idSocio) {
		this.idSocio = idSocio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public TipoDocumentoIdentidad getIdTipoDocumento() {
		return idTipoDocumento;
	}
	public void setIdTipoDocumento(TipoDocumentoIdentidad idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	
}
