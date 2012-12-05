package i3.moviledash.entidades;

import java.util.ArrayList;
import java.util.Date;

public class Sprint {

	private int id; // id del sprint
	private int numero; // numero de sprint de un proyecto
	private Date fechaInicio; // fecha de inicio de un sprint
	private Date fechaFin; // Fecha final de un sprint
	private ArrayList<Comentario> retrospectivas; // Notas retrospectivas para
													// el siguiente sprint
	private ArrayList<Comentario> notasPlaneacion;// notas de la planeacion del
													// sprint actual
	private Comentario revision; // Resultados de la revicion final del sprint
	private int estado; // estado actual del sprint

	public Sprint() {
		retrospectivas = new ArrayList<Comentario>();
		notasPlaneacion = new ArrayList<Comentario>();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public ArrayList<Comentario> getRetrospectivas() {
		return retrospectivas;
	}

	public void setRetrospectivas(ArrayList<Comentario> retrospectivas) {
		this.retrospectivas = retrospectivas;
	}

	public ArrayList<Comentario> getNotasPlaneacion() {
		return notasPlaneacion;
	}

	public void setNotasPlaneacion(ArrayList<Comentario> notasPlaneacion) {
		this.notasPlaneacion = notasPlaneacion;
	}

	public Comentario getRevision() {
		return revision;
	}

	public void setRevision(Comentario revision) {
		this.revision = revision;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

}
