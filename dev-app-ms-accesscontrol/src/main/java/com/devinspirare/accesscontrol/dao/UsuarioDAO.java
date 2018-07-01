package com.devinspirare.accesscontrol.dao;

import java.util.List;

import com.devinspirare.accesscontrol.model.Usuario;

/**
 * 
 * @author Zeler Benji Villarreal Marcelo
 *
 */
public interface UsuarioDAO {
	public Usuario validarExistenciaPorCredenciales(String usuario, String clave);
	public List<Usuario> listadoUsuario();
	public void crearUsuario(Usuario usuario);
	public int updateUser(Usuario usuario);
	public int deleteUser(Usuario usuario);
	public Usuario validarExistenciaPorEmail(String email);
}
