package com.olmo.Carreras;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import com.olmo.Corredores.Corredor;
import com.olmo.Corredores.Dorsal;

public class Carrera {
	
	private String Nombre;
	private Date fecha;
	private String lugar;
	private int maxPart;
	private Map<Corredor, Dorsal> corredores;
	
	
	public Carrera() {
		super();
	}

	public Carrera(String nombre, Date fecha, String lugar, int maxPart, Map<Corredor, Dorsal> corredores) {
		super();
		Nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.maxPart = maxPart;
		this.corredores = corredores;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public int getMaxPart() {
		return maxPart;
	}
	public void setMaxPart(int maxPart) {
		this.maxPart = maxPart;
	}
	public Map<Corredor, Dorsal> getCorredores() {
		return corredores;
	}
	public void setCorredores(Map<Corredor, Dorsal> corredores) {
		this.corredores = corredores;
	}

	@Override
	public String toString() {
		return "Carrera [Nombre=" + Nombre + ", fecha=" + fecha + ", lugar=" + lugar + ", maxPart=" + maxPart
				+ ", corredores=" + corredores + "]";
	}
	
	
	
	

}
