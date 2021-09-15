package clases;

import java.util.Date;
import java.util.List;

public class Usuario {
	//Atributos
	
	private String nickname;
	private String nombre;
	private String apellido;
	private String email;
	private Date fechaNac;
	private String imagen;
	
	//Links
	private Canal canal;
	private List<Usuario> listaSeguidores = new ArrayList<>();
	private List<Usuario> listaSeguidos = new ArrayList<>();
	
	public Usuario(){
		super();
	}
	public Usuario(String nickname, String nombre, String apellido, String email, Date fechaNac, String imagen){
		super();
		this.setNickname(nickname);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEmail(email);
		this.setFechaNac(fechaNac);
		this.setImagen(imagen);
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public void agregarUsuarioSeguidor(Usuario u) {
		listaSeguidores.add(u);
	}
	public void agregarUsuarioSeguido(Usuario u) {
		listaSeguidores.add(u);
	}
	public Usuario buscarSeguidor(String nickname) {
		for(Usuario u: listaSeguidores) {
			if(u.getNickname().equals(nickname)) {
				return u;
			}
		}
		return null;
	}
	public Usuario buscarSeguido(String nickname) {
		for(Usuario u: listaSeguidos) {
			if(u.getNickname().equals(nickname)) {
				return u;
			}
		}
		return null;
	}
	public void eliminarSeguidor(String nickname) {
		for(Usuario u: listaSeguidores) {
			if(u.getNickname().equals(nickname)) {
				listaSeguidores.remove(u);
			}
		}
	}
	public void eliminarSeguido(String nickname) {
		for(Usuario u: listaSeguidos) {
			if(u.getNickname().equals(nickname)) {
				listaSeguidores.remove(u);
			}
		}
	}
}
