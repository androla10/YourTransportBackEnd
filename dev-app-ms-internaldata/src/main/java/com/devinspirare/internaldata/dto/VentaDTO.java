package com.devinspirare.internaldata.dto;

import java.math.BigDecimal;
import java.util.List;

public class VentaDTO {
	private String codigoUsuario;
	private String nombreUsuario;
	private BigDecimal precioTotal;
	private BigDecimal descuentoTotal;

	private List<VentaDetalleDTO> ventaDetalleDTO;

	public String getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public BigDecimal getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(BigDecimal precioTotal) {
		this.precioTotal = precioTotal;
	}

	public BigDecimal getDescuentoTotal() {
		return descuentoTotal;
	}

	public void setDescuentoTotal(BigDecimal descuentoTotal) {
		this.descuentoTotal = descuentoTotal;
	}

	public List<VentaDetalleDTO> getVentaDetalleDTO() {
		return ventaDetalleDTO;
	}

	public void setVentaDetalleDTO(List<VentaDetalleDTO> ventaDetalleDTO) {
		this.ventaDetalleDTO = ventaDetalleDTO;
	}

}
