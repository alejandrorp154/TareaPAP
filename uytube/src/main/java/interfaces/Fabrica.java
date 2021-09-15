package interfaces;

import controladores.ControladorCategoria;
import controladores.ControladorElemento;
import controladores.ControladorUsuario;

public class Fabrica {
	private static Fabrica instancia = null;
	private Fabrica(){}
	
	public static Fabrica getInstancia() {
		if(instancia==null)
			instancia = new Fabrica();
		return instancia;
	}
	
	public IControladorUsuario getIControladorUsuario() {
		return new ControladorUsuario();
	}
	public IControladorCategoria getIControladorCategoria() {
		return new ControladorCategoria();
	}
	public IControladorElemento getIControladorElemento() {
		return new ControladorElemento();
	}
	
}
