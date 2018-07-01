package com.devinspirare.accesscontrol;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.devinspirare.accesscontrol.dao.TipoDocumentoIdentidadDAO;
import com.devinspirare.accesscontrol.dao.UsuarioDAO;
import com.devinspirare.accesscontrol.model.TipoDocumentoIdentidad;
import com.devinspirare.accesscontrol.model.Usuario;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = { DpeAppWsAccessControllApplication.class })
public class DpeAppWsAccessControllApplicationTests {

	@Autowired
	private UsuarioDAO usuarioDAO;

	@Autowired
	private TipoDocumentoIdentidadDAO TipoDocumentoIdentidadDAO;

	@Test
	@Ignore
	public void cargarUsuarios() {
		Usuario usuario = new Usuario();
		usuario.setDocumentoIdentidad("07147748");
		usuario.setUsuario("Charo Marcelo");
		usuario.setClave("123");

		usuarioDAO.crearUsuario(usuario);

	}

	@Test
	public void cargarTipoDocumento() {
		TipoDocumentoIdentidad documentoDni = new TipoDocumentoIdentidad();
		documentoDni.setCodigo("1");
		documentoDni.setDescripcion("Documento de Identidad Nacional");
		documentoDni.setAbrev("DNI");
		TipoDocumentoIdentidadDAO.registrarTipoDocumento(documentoDni);
	}

}
