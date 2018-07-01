package com.devinspirare.reportpartner.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OrquestadorRequest {

	private String codEntity;
	private String productId;

	public String getCodEntity() {
		return codEntity;
	}
	public void setCodEntity(String codEntity) {
		this.codEntity = codEntity;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	
}
