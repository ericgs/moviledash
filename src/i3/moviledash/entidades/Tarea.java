package i3.moviledash.entidades;

import java.util.ArrayList;

public class Tarea {
		
		private int id; //id de la tarea
		private String nombre; //nombre de la tarea
		private int estado;// estado actual de la tarea, completa/ en proceso, sin reclamar, detenida
		private int duenio;// persona encargada de la realizacion de la tarea
		private String descripcion; //detalle de la tarea
		private double trabajo; // trabajo dedicado a la tarea, medida de trabajo
		private int icono; //icono grafico informativo sobre la tarea
		private ArrayList<Suceso> suscesos; //acontecimientos importantes en una tarea
		
		
	public Tarea() {
		// TODO Auto-generated constructor stub
		suscesos = new ArrayList<Suceso>();
		
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


	public int getEstado() {
		return estado;
	}


	public void setEstado(int estado) {
		this.estado = estado;
	}


	public int getDuenio() {
		return duenio;
	}


	public void setDuenio(int duenio) {
		this.duenio = duenio;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getTrabajo() {
		return trabajo;
	}


	public void setTrabajo(double trabajo) {
		this.trabajo = trabajo;
	}


	public int getIcono() {
		return icono;
	}


	public void setIcono(int icono) {
		this.icono = icono;
	}


	public ArrayList<Suceso> getSuscesos() {
		return suscesos;
	}


	public void setSuscesos(ArrayList<Suceso> suscesos) {
		this.suscesos = suscesos;
	}

}
