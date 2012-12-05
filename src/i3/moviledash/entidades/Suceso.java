package i3.moviledash.entidades;

import java.sql.Timestamp;

import i3.moviledash.R.string;

/**
 * 
 * @author inis I3
 * 
 *         ES2 Acontecimineto de importancia que afecta al desarollo de una
 *         historia, tales como los impedimentos
 * 
 */

public class Suceso {

	private int id; // id del succeso
	private int tipo;// tipo de suceso, errores, problemas, trabas, etc
	private string detalle;// explicacion del suceso
	private int idPersona; // persona que detecto el suceso
	private Timestamp fecha; // fecha del succeso

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public string getDetalle() {
		return detalle;
	}

	public void setDetalle(string detalle) {
		this.detalle = detalle;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

	public Suceso() {
		// TODO Auto-generated constructor stub
	}

}
