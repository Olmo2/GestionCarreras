package com.olmo.negocio.Corredores;

import java.sql.Date;

public class Corredor {
	
	private String nombre;
	private String DNI;
	private Date fecha;
	private String dir;
	private int tlf;
	
	
	public Corredor() {
		super();
	}
	public Corredor(String nombre, String dNI, Date fecha, String dir, int tlf) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.fecha = fecha;
		this.dir = dir;
		this.tlf = tlf;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public int getTlf() {
		return tlf;
	}
	public void setTlf(int tlf) {
		this.tlf = tlf;
	}
	@Override
	public String toString() {
		return "Corredor [nombre=" + nombre + ", DNI=" + DNI + ", fecha=" + fecha + ", dir=" + dir + ", tlf=" + tlf
				+ "]";
	}
	
	

}
