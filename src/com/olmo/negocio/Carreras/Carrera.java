package com.olmo.negocio.Carreras;

import com.olmo.logica.Operaciones;
import java.sql.Date;
import java.util.List;
import java.util.Map;

import com.olmo.negocio.Corredores.Corredor;
import com.olmo.negocio.Corredores.Dorsal;

public class Carrera {

    Operaciones op = new Operaciones();
    private String nombre;
    private Date fecha;
    private String lugar;
    private Integer maxPart;
    private Map<Corredor, Dorsal> corredores;
    private Map<Corredor, Dorsal> corredoresLlegada;

    public Carrera() {
        super();
    }

    public Carrera(String Nombre, Date fecha, String lugar, Integer maxPart, Map<Corredor, Dorsal> corredoresLlegada, Map<Corredor, Dorsal> corredores) {
        this.nombre = Nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.maxPart = maxPart;
        this.corredores = corredores;
        this.corredoresLlegada = corredoresLlegada;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Integer getMaxPart() {
        return maxPart;
    }

    public void setMaxPart(Integer maxPart) {
        this.maxPart = maxPart;
    }

    public Map<Corredor, Dorsal> getCorredoresLlegada() {
        return corredoresLlegada;
    }

    public void setCorredoresLlegada(Map<Corredor, Dorsal> corredoresLlegada) {
        this.corredoresLlegada = corredoresLlegada;
    }

    public Map<Corredor, Dorsal> getCorredores() {
        return corredores;
    }

    public void setCorredores(Map<Corredor, Dorsal> corredores) {
        this.corredores = corredores;
    }

    public String[] toArrayString() {
        String[] values = new String[6];
        values[0] = nombre;
        values[1] = fecha.toString();
        values[2] = lugar;
        values[3] = maxPart.toString();
        values[4] = op.corredoresToString(corredores);
        values[5] = op.corredoresToString(corredoresLlegada);

        return values;
    }

    @Override
    public String toString() {
        return "Carrera [Nombre=" + nombre + ", fecha=" + fecha + ", lugar=" + lugar + ", maxPart=" + maxPart
                + ", corredoresLlegada=" + corredoresLlegada + ", corredores=" + corredores + "]";
    }

}
