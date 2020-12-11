package com.olmo.negocio.Corredores;

import java.sql.Date;

public class Corredor {
	
	private String nombre;
	private String DNI;
	private Date fecha;
	private String dir;
	private Integer tlf;
	
	
	public Corredor() {
		super();
	}
	public Corredor(String nombre, String dNI, Date fecha, String dir, Integer tlf) {
		super();
		this.nombre = nombre;
		this.DNI = dNI;
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
	public Integer getTlf() {
		return tlf;
	}
	public void setTlf(Integer tlf) {
		this.tlf = tlf;
	}
          public String[] toArrayString(){
         String[] values = new String[5];
         values[0]=nombre;
         values[1]=DNI;
         values[2]=fecha.toString();
         values[3]=dir;
         values[4]=tlf.toString();
        
        return values;
    }
           public String[] toArrayString(Integer id){
         String[] values = new String[6];
         values[0]=id.toString();
         values[1]=nombre;
         values[2]=DNI;
         values[3]=fecha.toString();
         values[4]=dir;
         values[5]=tlf.toString();
        
        return values;
    }
	@Override
	public String toString() {
		return nombre;
	}
	
	

}
