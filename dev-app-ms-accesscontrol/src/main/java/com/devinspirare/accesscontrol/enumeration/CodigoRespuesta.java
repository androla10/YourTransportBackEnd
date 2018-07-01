package com.devinspirare.accesscontrol.enumeration;

public enum CodigoRespuesta {
	SUCCESS(200),
	NOT_FOUND(400),
	ERROR(504);
	
	int code;
	
	CodigoRespuesta(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
}
