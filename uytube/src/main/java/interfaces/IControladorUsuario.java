package interfaces;

import java.util.Date;

public interface IControladorUsuario {

	void agregarUsuario(String nickname, String nombre, String apellido, String email, Date fechaNac, String imagen);
	
}
