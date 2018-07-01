package com.devinspirare.accesscontrol.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devinspirare.accesscontrol.dao.TipoDocumentoIdentidadDAO;
import com.devinspirare.accesscontrol.dao.UsuarioDAO;
import com.devinspirare.accesscontrol.dto.RecoveryDTO;
import com.devinspirare.accesscontrol.dto.UsuarioDTO;
import com.devinspirare.accesscontrol.model.TipoDocumentoIdentidad;
import com.devinspirare.accesscontrol.model.Usuario;
import com.devinspirare.accesscontrol.service.EmailService;
import com.devinspirare.accesscontrol.service.UsuarioService;
import com.devinspirare.accesscontrol.utils.Constants;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioDAO usuarioDAO;

	@Autowired
	private EmailService emailService;

	@Autowired
	private TipoDocumentoIdentidadDAO tipoDocumentoIdentidadDAO;

	public void registrarUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuarioBean = new Usuario();
		usuarioBean.setCelular(usuarioDTO.getCelular());
		usuarioBean.setDocumentoIdentidad(usuarioDTO.getNumeroDocumento());

		// Obtenemos el tipo de documento
		TipoDocumentoIdentidad tipoDocumentoIdentidad = tipoDocumentoIdentidadDAO
				.obtenerTipoDocumento(String.valueOf(usuarioDTO.getTipoDocumento()));

		usuarioBean.setTipoDocumentoIdentidad(tipoDocumentoIdentidad);
		usuarioBean.setClave(usuarioDTO.getClave());
		usuarioBean.setEmail(usuarioDTO.getEmail());
		usuarioBean.setFechaNacimiento(usuarioDTO.getFechaNacimiento());
		usuarioBean.setTelefono(usuarioDTO.getTelefono());
		usuarioBean.setUsuario(usuarioDTO.getUsuario());
		usuarioBean.setNombreCompleto(usuarioDTO.getNombreCompleto());
		usuarioBean.setApellidoPaterno(usuarioDTO.getApellidoPaterno());
		usuarioBean.setApellidoMaterno(usuarioDTO.getApellidoMaterno());
		usuarioDAO.crearUsuario(usuarioBean);
	}

	public boolean recuperarClave(RecoveryDTO recoveryDTO) {
		Usuario usuarioObtenido = usuarioDAO.validarExistenciaPorEmail(recoveryDTO.getEmail());
		if (usuarioObtenido != null) {
			// Mandaremos la clave al correo de la persona
			emailService.enviarMensaje(usuarioObtenido.getEmail(), Constants.MESSAGE_SUBJECT_RECOVERY,
					Constants.MESSAGE_TEXT_RECOVERY + usuarioObtenido.getClave());
			return true;
		} else {
			return false;
		}
	}

	public UsuarioDTO obtenerUsuarioPorCredenciales(UsuarioDTO usuarioDTO) {
		String usuario = usuarioDTO.getUsuario();
		String clave = usuarioDTO.getClave();
		Usuario usuarioObtenido = usuarioDAO.validarExistenciaPorCredenciales(usuario, clave);
		if (usuarioObtenido != null) {
			return fromUsuarioBeanToUsuarioDTO(usuarioObtenido);
		} else {
			return null;
		}
	}

	private UsuarioDTO fromUsuarioBeanToUsuarioDTO(Usuario usuarioBean) {
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		usuarioDTO.setUsuario(usuarioBean.getUsuario());
		usuarioDTO.setClave(usuarioBean.getClave());
		usuarioDTO.setApellidoPaterno(usuarioBean.getApellidoPaterno());
		usuarioDTO.setApellidoMaterno(usuarioBean.getApellidoMaterno());
		usuarioDTO.setCelular(usuarioBean.getCelular());
		usuarioDTO.setCodigo(usuarioBean.getCodigo());
		usuarioDTO.setEmail(usuarioBean.getEmail());
		usuarioDTO.setFechaNacimiento(usuarioBean.getFechaNacimiento());
		usuarioDTO.setNombreCompleto(usuarioBean.getNombreCompleto());
		usuarioDTO.setNumeroDocumento(usuarioBean.getDocumentoIdentidad());
		usuarioDTO.setTelefono(usuarioBean.getTelefono());
		usuarioDTO.setTipoDocumento(Integer.valueOf(usuarioBean.getTipoDocumentoIdentidad().getCodigo()));
		return usuarioDTO;
	}
}
