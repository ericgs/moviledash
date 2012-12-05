package i3.moviledash.entidades;

import java.util.ArrayList;

import android.R.string;

public class Proyecto {

	private int id;
	private string nombre;
	private string detalle;
	private ArrayList<Historia> historias;
	private ArrayList<Persona> desarolladores;
	private Persona scrumMaster;
	private Persona productOwner;

	public Proyecto() {
		historias = new ArrayList<Historia>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public string getNombre() {
		return nombre;
	}

	public void setNombre(string nombre) {
		this.nombre = nombre;
	}

	public string getDetalle() {
		return detalle;
	}

	public void setDetalle(string detalle) {
		this.detalle = detalle;
	}

	public ArrayList<Historia> getHistorias() {
		return historias;
	}

	public void setHistorias(ArrayList<Historia> historias) {
		this.historias = historias;
	}

	public ArrayList<Persona> getDesarolladores() {
		return desarolladores;
	}

	public void setDesarolladores(ArrayList<Persona> desarolladores) {
		this.desarolladores = desarolladores;
	}

	public Persona getScrumMaster() {
		return scrumMaster;
	}

	public void setScrumMaster(Persona scrumMaster) {
		this.scrumMaster = scrumMaster;
	}

	public Persona getProductOwner() {
		return productOwner;
	}

	public void setProductOwner(Persona productOwner) {
		this.productOwner = productOwner;
	}

}
