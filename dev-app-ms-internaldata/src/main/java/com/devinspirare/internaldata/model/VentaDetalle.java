package com.devinspirare.internaldata.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "venta_detalle")
@Entity
public class VentaDetalle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Venta venta;
	private BigDecimal total;
	private Integer cantidad;
	
}
