package clases;

public class Elemento {
	private String nombre;
	private String privado;
	
	
	public Elemento() {
		super();
	}
	public Elemento(String nombre, String privado) {
		super();
		this.setNombre(nombre);
		this.setPrivado(privado);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrivado() {
		return privado;
	}
	public void setPrivado(String privado) {
		this.privado = privado;
	}
	
}
