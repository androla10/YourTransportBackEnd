package com.devinspirare.internaldata.service;

public interface EmailService {

	void enviarMensaje(String to, String subject, String text);
}
