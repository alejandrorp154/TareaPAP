package manejadores;

import java.util.ArrayList;
import java.util.List;

import clases.Usuario;

public class ManejadorUsuario {
	private static ManejadorUsuario instancia = null;
	private List<Usuario> usuarios = new ArrayList<>();
	
	private ManejadorUsuario(){}
	
	public static ManejadorUsuario getInstancia() {
		if (instancia == null)
			instancia = new ManejadorUsuario();
		return instancia;
	}
	public void agregarUsuario(Usuario u) {
		usuarios.add(u);
	}
	public Usuario buscarUsuario(String nick){
		int i = 0;
		Usuario ret=null,usuario;
		boolean encontre=false;
		while ((i < usuarios.size()) && (!encontre)) {
		    usuario=usuarios.get(i);
		    System.out.println(usuario.getNickname());
		    if (usuario.getNickname().equals(nick)) {
		    	System.out.println("Encontre Usuario");
		    	ret=usuario;
		    	encontre=true;
		    }	
		    i++;
		}
		return ret;
	}
}
