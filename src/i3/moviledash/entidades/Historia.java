/**
 * 
 */
package i3.moviledash.entidades;

import java.util.ArrayList;

import android.R.string;

/**
 * @author inis I3
 * 
 *         ES2
 * 
 */
public class Historia {

	/**
	 * 
	 */

	private int id;// ID de la historia
	private String nombre;// Nombre de la Historia
	private String detalle;// Descripcion de la Historia
	private int numero;// Numero de Historia
	private int prioridad;// valoracion de priorizacion el el product backlog
	private int riesgo;// valoracion de la dificultad de historia
	private String observaciones;// observaciones generales y comentarios
	private int estado;// Estados de una historia 0 = Creada; 1 = En curso; 3 =
						// Detenida; 4 = Terminada; 5 = Aceptada
	private ArrayList<Tarea> tareas;// Lista de tareas de una historia
	private int icono;// Iconos visuales indicadoresdel estado actual de una
						// tarea
	private double costo;// Costo estimado de la historia

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public Historia() {
		tareas = new ArrayList<Tarea>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public int getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(int riesgo) {
		this.riesgo = riesgo;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public ArrayList<Tarea> getTareas() {
		return tareas;
	}

	public void setTareas(ArrayList<Tarea> tareas) {
		this.tareas = tareas;
	}

	public int getIcono() {
		return icono;
	}

	public void setIcono(int icono) {
		this.icono = icono;
	}

}
