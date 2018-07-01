package com.devinspirare.accesscontrol.service;

public interface EmailService {

	void enviarMensaje(String to, String subject, String text);
}
