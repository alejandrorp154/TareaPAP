package controladores;

import java.util.Date;

import clases.Usuario;
import manejadores.ManejadorUsuario;
import interfaces.IControladorUsuario;

public class ControladorUsuario implements IControladorUsuario{
	
	public ControladorUsuario(){
		super();
	}
	
	@Override
	public void agregarUsuario(String nickname, String nombre, String apellido, String email, Date fechaNac, String imagen) {
		ManejadorUsuario mu = ManejadorUsuario.getInstancia();
		Usuario u = new Usuario(nickname, nombre, apellido, email, null, imagen);
		mu.agregarUsuario(u);
	}
	
	

}
