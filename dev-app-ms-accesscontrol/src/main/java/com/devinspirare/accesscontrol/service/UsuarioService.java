package com.devinspirare.accesscontrol.service;

import com.devinspirare.accesscontrol.dto.RecoveryDTO;
import com.devinspirare.accesscontrol.dto.UsuarioDTO;

public interface UsuarioService {

	void registrarUsuario(UsuarioDTO usuarioDTO);
	
	boolean recuperarClave(RecoveryDTO recoveryDTO);
	
	UsuarioDTO obtenerUsuarioPorCredenciales(UsuarioDTO usuarioDTO);
}
