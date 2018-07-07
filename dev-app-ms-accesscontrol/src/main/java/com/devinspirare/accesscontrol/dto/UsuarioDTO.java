package com.devinspirare.accesscontrol.dto;

import java.util.Date;

import com.devinspirare.accesscontrol.dto.mapping.interceptor.CustomDateDeserializer;
import com.devinspirare.accesscontrol.dto.mapping.interceptor.CustomDateSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * @author Zeler Benji Villarreal Marcelo
 * @version 1.0
 *
 */
@JsonInclude(Include.NON_NULL)
public class UsuarioDTO extends RespuestaGenerica {
	private String usuario;
	private String clave;
	private String codigo;
	private Integer idUsuario;

	@JsonSerialize(using = CustomDateSerializer.class)
	@JsonDeserialize(using = CustomDateDeserializer.class)
	private Date fechaNacimiento;

	private String celular;
	private String telefono;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String nombreCompleto;
	private String email;
	private String numeroDocumento;
	private Integer tipoDocumento;
	private Integer tipoUsuario;

	public UsuarioDTO(Integer idUsuario, String usuario, String codigo, Date fechaNacimiento, String celular,
			String telefono, String apellidoPaterno, String apellidoMaterno, String nombreCompleto, String email,
			String numeroDocumento, Integer tipoDocumento, Integer tipoUsuario) {
		this.usuario = usuario;
		this.idUsuario = idUsuario;
		this.codigo = codigo;
		this.fechaNacimiento = fechaNacimiento;
		this.celular = celular;
		this.telefono = telefono;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nombreCompleto = nombreCompleto;
		this.email = email;
		this.numeroDocumento = numeroDocumento;
		this.tipoDocumento = tipoDocumento;
		this.tipoUsuario = tipoUsuario;
	}

	public UsuarioDTO() {
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Integer getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(Integer tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(Integer tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}
