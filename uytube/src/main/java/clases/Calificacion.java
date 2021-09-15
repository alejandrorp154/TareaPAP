package clases;

import datatypes.Like;

public class Calificacion {
	
	private Like valoracion;
	
	public Calificacion() {
		super();
	}
	
	public Calificacion(Like valoracion) {
		super();
		this.valoracion=valoracion;
	}

	public Like getValoracion() {
		return valoracion;
	}

	public void setValoracion(Like valoracion) {
		this.valoracion = valoracion;
	}
	

}
