package clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Video extends Elemento {
	//atributos
	private String descripcion;
	private String duracion;
	private Date fechaPublic;
	private String URL;
	
	//links
	List<Comentario> listaComentarios= new ArrayList<>();
	
	public Video(){
		super();
	}
	
	public Video (String nombre, String privado, String descripcion, String duracion, Date fechaPublic, String URL) {
		super(nombre,privado);
		this.descripcion=descripcion;
		this.duracion=duracion;
		this.fechaPublic=fechaPublic;
		this.URL=URL;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public Date getFechaPublic() {
		return fechaPublic;
	}
	public void setFechaPublic(Date fechaPublic) {
		this.fechaPublic = fechaPublic;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public void agregarComentario(Comentario c) {
		listaComentarios.add(c);
	}
	
	public Comentario eliminarComentario(int idComentario) {
		for (Comentario c : listaComentarios) {
		    if (c.getIdComentario()==idComentario) {
		            listaComentarios.remove(c);
		        }
		    }
		return null; 
	}
	
	public Comentario buscarComentario(int idComentario) {
		for (Comentario c : listaComentarios) {
		    if (c.getIdComentario()==idComentario) {
		            return c;
		        }
		    }
		return null; 
	}
}
