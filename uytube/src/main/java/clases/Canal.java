package clases;

import java.util.List;
import java.util.ArrayList;

public class Canal {
	
	private String nombre;
	private boolean privado;
	private String descripcion;
	
	private List<Elemento> listaElementos = new ArrayList<>();
	
	public Canal() {
		super();
	}
	public Canal(String nombre, boolean privado, String descripcion){
		super();
		this.nombre=nombre;
		this.privado=privado;
		this.descripcion=descripcion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isPrivado() {
		return privado;
	}
	public void setPrivado(boolean privado) {
		this.privado = privado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<Elemento> getlistaElementos() {
		return listaElementos;
	}
	public void agregarElemento(Elemento e) {
		listaElementos.add(e);
	}
	
	public Elemento eliminarElemento(String nombre) {
		for (Elemento e : listaElementos) {
		    if (e.getNombre().equals(nombre)) {
		            listaElementos.remove(e);
		        }
		    }
		return null; 
	}
	
	public Elemento buscarElemento(String nombre) {
		for (Elemento e : listaElementos) {
		    if (e.getNombre().equals(nombre)) {
		            return e;
		        }
		    }
		return null; 
	}
}
