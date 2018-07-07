package com.devinspirare.accesscontrol.ws.rest;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tomcat.util.bcel.classfile.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devinspirare.accesscontrol.dto.RecoveryDTO;
import com.devinspirare.accesscontrol.dto.RespuestaGenerica;
import com.devinspirare.accesscontrol.dto.UsuarioDTO;
import com.devinspirare.accesscontrol.enumeration.CodigoRespuesta;
import com.devinspirare.accesscontrol.model.Usuario;
import com.devinspirare.accesscontrol.service.UsuarioService;
import com.devinspirare.accesscontrol.utils.Constants;

@RestController
@RequestMapping("/api/usuario")
public class UserController {

	private static final Logger log = LogManager.getLogger(UserController.class);

	@Autowired
	private UsuarioService usuarioService;

	/**
	 * Servicio para realizar la validación si existe o no un usuario
	 * 
	 * @param usuarioDTO
	 * @return UsuarioDTO
	 */
	@RequestMapping(value = "/validar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	private UsuarioDTO validarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
		UsuarioDTO usuarioDTOResult = usuarioService.obtenerUsuarioPorCredenciales(usuarioDTO);
		if (usuarioDTOResult != null) {
			usuarioDTOResult.setCodigoRespuesta(CodigoRespuesta.SUCCESS.getCode());
		} else {
			usuarioDTOResult = new UsuarioDTO();
			usuarioDTOResult.setCodigoRespuesta(CodigoRespuesta.NOT_FOUND.getCode());
			usuarioDTOResult.setMessage(Constants.MESSAGE_NOT_FOUND_VALIDATE_USUARIO);
		}
		return usuarioDTOResult;
	}

	/**
	 * Servicio de creaciòn de usuario
	 * 
	 * @param usuario
	 */
	@RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public RespuestaGenerica crearUsuario(@RequestBody UsuarioDTO usuarioDTO) {
		RespuestaGenerica generica = new RespuestaGenerica();
		try {
			usuarioService.registrarUsuario(usuarioDTO);
			generica.setCodigoRespuesta(CodigoRespuesta.SUCCESS.getCode());
			generica.setMessage(Constants.MESSAGE_SUCCESS_CREACION_USUARIO);
			return generica;
		} catch (Exception e) {
			generica.setCodigoRespuesta(CodigoRespuesta.ERROR.getCode());
			generica.setMessage(Constants.MESSAGE_ERROR_CREACION_USUARIO);
			return generica;
		}
	}

	@RequestMapping(value = "/recovery", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public RespuestaGenerica recuperarClave(@RequestBody RecoveryDTO recoveryDTO) {
		RespuestaGenerica generica = new RespuestaGenerica();
		try {
			boolean heRecovered = usuarioService.recuperarClave(recoveryDTO);
			if (heRecovered) {
				generica.setCodigoRespuesta(CodigoRespuesta.SUCCESS.getCode());
				generica.setMessage(Constants.MESSAGE_SUCCESS_RECOVERY_USUARIO);
			} else {
				generica.setCodigoRespuesta(CodigoRespuesta.NOT_FOUND.getCode());
				generica.setMessage(Constants.MESSAGE_NOT_FOUND_RECOVERY_USUARIO);
			}
			return generica;
		} catch (Exception e) {
			generica.setCodigoRespuesta(CodigoRespuesta.ERROR.getCode());
			generica.setMessage(Constants.MESSAGE_ERROR_RECOVERY_USUARIO);
			return generica;
		}
	}

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<UsuarioDTO> obtenerListadoUsuario() {
		return usuarioService.allUsuarios();
	}
}
