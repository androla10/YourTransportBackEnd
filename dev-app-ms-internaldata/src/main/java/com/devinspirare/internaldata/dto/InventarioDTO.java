package com.devinspirare.internaldata.dto;

import java.math.BigDecimal;

public class InventarioDTO {

	private BigDecimal precio;
	private Integer cantidadStock;
	private String urlImage;
	private String nombreSocio;
	private String nombreProducto;
	private Integer idProducto;
	private Integer idSocio;

	public InventarioDTO(BigDecimal precio, Integer cantidadStock, String nombreProducto, String urlImage,
			String nombreSocio, Integer idProducto, Integer idSocio) {
		this.precio = precio;
		this.cantidadStock = cantidadStock;
		this.urlImage = urlImage;
		this.nombreSocio = nombreSocio;
		this.idProducto = idProducto;
		this.idSocio = idSocio;
		this.nombreProducto = nombreProducto;
	}

	public InventarioDTO() {
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Integer getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(Integer idSocio) {
		this.idSocio = idSocio;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public Integer getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(Integer cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public String getNombreSocio() {
		return nombreSocio;
	}

	public void setNombreSocio(String nombreSocio) {
		this.nombreSocio = nombreSocio;
	}

}
