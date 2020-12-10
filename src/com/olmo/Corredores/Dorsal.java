package com.olmo.Corredores;

public class Dorsal {
	
	private Integer tiempo;
	private Integer numero;
	
	public Dorsal() {
		super();
	}
	public Dorsal(Integer tiempo, Integer numero) {
		super();
		this.tiempo = tiempo;
		this.numero = numero;
	}
	public Integer getTiempo() {
		return tiempo;
	}
	public void setTiempo(Integer tiempo) {
		this.tiempo = tiempo;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Dorsal [tiempo=" + tiempo + ", numero=" + numero + "]";
	}
	
	

}
