package clases;

import java.util.Date;

public class Comentario {
	//atributos
	private static int idComentarioEstatico =1;
	private int idComentario;
	private String texto;
	private Date fecha;
	
	//link
	private Usuario emisor; 
	
	public Comentario() {
		super();
	}
	public Comentario(String texto, Date fecha) {
		super();
		this.idComentario=idComentarioEstatico;
		this.idComentarioEstatico++;
		this.texto=texto;
		this.fecha=fecha;
	}
	
	public int getIdComentario() {
		return idComentario;
	}
	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Usuario getEmisor() {
		return emisor;
	}
	public void setEmisor(Usuario emisor) {
		this.emisor = emisor;
	}
	
}
