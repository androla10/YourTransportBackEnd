package com.devinspirare.internaldata.utils;

/**
 * 
 * @author Zeler Benji Villarreal Marcelo
 *
 *@see Clase encargada de mapear todos los mensaje de la aplicacion y constantes.
 *
 *@version 1.0
 *
 */
public final class Constants {
	/**
	 * Register Usuario
	 */
	public static final String MESSAGE_SUCCESS_USUARIO = "Sé encontró usuario";
	public static final String MESSAGE_NOT_FOUND_USUARIO = "No se ha encontrado el usuario";
	public static final String MESSAGE_PARAMS_INCORRECT = "Parametros incorrectos";
	public static final String MESSAGE_SUCCESS_CREACION_USUARIO = "Se ha registrado correctamente el usuario.";
	public static final String MESSAGE_ERROR_CREACION_USUARIO = "Ha ocurrido un error al guardar el usuario.";
	
	/**
	 * Recovery
	 */
	public static final String MESSAGE_ERROR_RECOVERY_USUARIO = "Ha ocurrido un error al realizar la accion de recuperar tu password.";
	public static final String MESSAGE_SUCCESS_RECOVERY_USUARIO = "Se ha enviado su clave al correo proporcionado";
	public static final String MESSAGE_NOT_FOUND_RECOVERY_USUARIO = "No se ha encontrado un usuario asociado al correo proporcionado";
	
	/**
	 * Validate
	 */
	public static final String MESSAGE_NOT_FOUND_VALIDATE_USUARIO = "El usuario no existe en nuestra base de datos.";
	
	/**
	 * Email Recovery
	 * 
	 */
	public static final String MESSAGE_SUBJECT_RECOVERY = "Recuperación de contraseña Your Transport";
	public static final String MESSAGE_TEXT_RECOVERY = "Su clave secreta es : ";
}
