package com.devinspirare.internaldata.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "encomienda")
@Entity
public class Encomienda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1298460167639219853L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idEncomienda;

	@Column
	private String codigoEncomienda;

	@Column
	private BigDecimal ancho;

	@Column
	private BigDecimal largo;

	@Column
	private BigDecimal alto;

	@Column
	private BigDecimal peso;

	@Column
	private String nombreApeEmisor;

	@Column
	private String telefonoEmisor;

	@Column
	private String ubicacionEmisor;

	@Column
	private String nombreApeReceptor;

	@Column
	private String telefonoReceptor;

	@Column
	private String ubicacionRecepctor;

	@Column
	private String tipoDePago;

	@Column
	private BigDecimal precio;

	@Column
	private Integer tiempoEstimado;

	public Integer getIdEncomienda() {
		return idEncomienda;
	}

	public void setIdEncomienda(Integer idEncomienda) {
		this.idEncomienda = idEncomienda;
	}

	public String getCodigoEncomienda() {
		return codigoEncomienda;
	}

	public void setCodigoEncomienda(String codigoEncomienda) {
		this.codigoEncomienda = codigoEncomienda;
	}

	public BigDecimal getAncho() {
		return ancho;
	}

	public void setAncho(BigDecimal ancho) {
		this.ancho = ancho;
	}

	public BigDecimal getLargo() {
		return largo;
	}

	public void setLargo(BigDecimal largo) {
		this.largo = largo;
	}

	public BigDecimal getAlto() {
		return alto;
	}

	public void setAlto(BigDecimal alto) {
		this.alto = alto;
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

	public String getNombreApeEmisor() {
		return nombreApeEmisor;
	}

	public void setNombreApeEmisor(String nombreApeEmisor) {
		this.nombreApeEmisor = nombreApeEmisor;
	}

	public String getTelefonoEmisor() {
		return telefonoEmisor;
	}

	public void setTelefonoEmisor(String telefonoEmisor) {
		this.telefonoEmisor = telefonoEmisor;
	}

	public String getUbicacionEmisor() {
		return ubicacionEmisor;
	}

	public void setUbicacionEmisor(String ubicacionEmisor) {
		this.ubicacionEmisor = ubicacionEmisor;
	}

	public String getNombreApeReceptor() {
		return nombreApeReceptor;
	}

	public void setNombreApeReceptor(String nombreApeReceptor) {
		this.nombreApeReceptor = nombreApeReceptor;
	}

	public String getTelefonoReceptor() {
		return telefonoReceptor;
	}

	public void setTelefonoReceptor(String telefonoReceptor) {
		this.telefonoReceptor = telefonoReceptor;
	}

	public String getUbicacionRecepctor() {
		return ubicacionRecepctor;
	}

	public void setUbicacionRecepctor(String ubicacionRecepctor) {
		this.ubicacionRecepctor = ubicacionRecepctor;
	}

	public String getTipoDePago() {
		return tipoDePago;
	}

	public void setTipoDePago(String tipoDePago) {
		this.tipoDePago = tipoDePago;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getTiempoEstimado() {
		return tiempoEstimado;
	}

	public void setTiempoEstimado(Integer tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}

}
