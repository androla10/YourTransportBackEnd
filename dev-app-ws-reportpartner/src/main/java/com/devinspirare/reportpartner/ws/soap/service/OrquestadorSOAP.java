package com.devinspirare.reportpartner.ws.soap.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.devinspirare.reportpartner.bean.OrquestadorRequest;
import com.devinspirare.reportpartner.bean.OrquestadorResponse;
/**
 * 
 * @author Zeler Benji Villarreal Marcelo
 *
 *Interface OrquestadorSOAP
 *
 */
@WebService(name = "OrquestadorSOAP")
public interface OrquestadorSOAP {

	public String sayHello(@WebParam(name = "myname", targetNamespace = "") String name);

	public OrquestadorResponse procesar(OrquestadorRequest request);
}
