package com.devinspirare.reportpartner;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.devinspirare.reportpartner.ws.soap.OrquestadorSOAPImpl;

@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
public class DpeAppWsOrquestadorApplication {

	@Autowired
	private Bus bus;

	public static void main(String[] args) {
		SpringApplication.run(DpeAppWsOrquestadorApplication.class, args);
	}

	@Bean
	public Endpoint endpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, new OrquestadorSOAPImpl());
		endpoint.publish("/Orquestador");
		return endpoint;
	}
}
