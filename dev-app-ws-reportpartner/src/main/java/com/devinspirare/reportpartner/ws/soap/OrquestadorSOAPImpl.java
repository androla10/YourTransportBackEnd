package com.devinspirare.reportpartner.ws.soap;

import javax.jws.WebService;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.devinspirare.reportpartner.bean.OrquestadorRequest;
import com.devinspirare.reportpartner.bean.OrquestadorResponse;
import com.devinspirare.reportpartner.ws.soap.service.OrquestadorSOAP;

/**
 * 
 * @author Zeler Benji Villarreal Marcelo
 *
 *         Implementacion del OrquestadorSOAP - Esta clase básicamente esta
 *         encargada de implementar los metodos que son del Orquestador
 *
 */
@WebService(serviceName = "OrquestadorSOAP", portName = "OrquestadorSOAPPort", endpointInterface = "com.devinspirare.orquestador.ws.soap.service.OrquestadorSOAP")
public class OrquestadorSOAPImpl implements OrquestadorSOAP {

	private static final Logger logger = LogManager.getLogger(OrquestadorSOAPImpl.class);

	@Override
	public String sayHello(String myname) {
		try {
			logger.debug("Debug information");
			logger.info("Info Informaction");
			logger.fatal("Fatal Information");
			logger.error("Error Information");
			logger.trace("Trace Information");
			logger.warn("Warn Information");
			return "Hello, Welcome to CXF Spring boot " + myname + "!!!";

		} catch (java.lang.Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException(ex);
		}
	}

	@Override
	public OrquestadorResponse procesar(OrquestadorRequest request) {

		logger.debug("Debug information");
		logger.info("Info Informaction");
		logger.fatal("Fatal Information");
		logger.error("Error Information");
		logger.trace("Trace Information");
		logger.warn("Warn Information");

		OrquestadorResponse hello = new OrquestadorResponse();
		return hello;
	}

}
