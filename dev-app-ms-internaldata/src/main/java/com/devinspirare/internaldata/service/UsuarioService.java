package com.devinspirare.internaldata.service;

import com.devinspirare.internaldata.dto.RecoveryDTO;
import com.devinspirare.internaldata.dto.UsuarioDTO;

public interface UsuarioService {

	void registrarUsuario(UsuarioDTO usuarioDTO);
	
	boolean recuperarClave(RecoveryDTO recoveryDTO);
	
	UsuarioDTO obtenerUsuarioPorCredenciales(UsuarioDTO usuarioDTO);
}
