/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olmo.logica;

import com.olmo.GUI.Principal;
import com.olmo.negocio.Carreras.Carrera;
import com.olmo.negocio.Corredores.Corredor;
import com.olmo.negocio.Corredores.Dorsal;
import java.awt.event.MouseEvent;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OLMO
 */
public class Operaciones {

    Corredor c1 = new Corredor("Olmo", "71729223C", new Date(99, 05, 28), "C/Falsa 123", 608013779);
    Corredor c2 = new Corredor("Anakin", "71729223C", new Date(99, 05, 28), "C/Falsa 123", 608013779);
    Corredor c3 = new Corredor("SEBULBA", "71729223C", new Date(99, 05, 28), "C/Falsa 123", 608013779);
    Corredor c4 = new Corredor("BEN QUADINAROS", "71729223C", new Date(99, 05, 28), "C/Falsa 123", 608013779);
    Corredor c5 = new Corredor("RATTS TYERELL", "71729223C", new Date(99, 05, 28), "C/Falsa 123", 608013779);
    Corredor c6 = new Corredor("Qui-Gon Jinn", "71729223C", new Date(99, 05, 28), "C/Falsa 123", 608013779);
    Corredor c7 = new Corredor("Obi-Wan Kenobi", "71729223C", new Date(99, 05, 28), "C/Falsa 123", 608013779);
    List<Corredor> list = new ArrayList<Corredor>();
    
    public void llenarLista(List<Corredor> list){
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        list.add(c6);
        list.add(c7);
    }
    
    

    public void inicializarTabla(DefaultTableModel dtm, JTable table) {
        dtm = new DefaultTableModel() {

    @Override
    public boolean isCellEditable(int row, int column) {
       //all cells false
       return false;
    }
};
        dtm.setColumnIdentifiers(new String[]{"Nombre", "DNI", "Fecha de Nacimiento", "Direccion", "Teléfono de contacto"});
        table.setModel(dtm);
        //anadirCorredores(dtm, lista, jTableCorredores);
    }

    public void inicializarTablaBaja(DefaultTableModel dtm, JTable table) {
        dtm =new DefaultTableModel() {

    @Override
    public boolean isCellEditable(int row, int column) {
       //all cells false
       return false;
    }
};
        dtm.setColumnIdentifiers(new String[]{"ID", "Nombre", "DNI", "Fecha de Nacimiento", "Direccion", "Teléfono de contacto"});
        table.setModel(dtm);
        //anadirCorredores(dtm, lista, jTableCorredores);
    }

    public void anadirCorredor(Corredor corredor, ArrayList<Corredor> lista) {

        lista.add(corredor);
    }

    public void anadirCorredores(DefaultTableModel dtm, ArrayList<Corredor> lista, JTable table) {
        dtm = (DefaultTableModel) table.getModel();

        if (dtm.getRowCount() > 0) {
            for (int i = dtm.getRowCount() - 1; i > -1; i--) {
                dtm.removeRow(i);
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            dtm.addRow(lista.get(i).toArrayString());
        }
    }

    public void anadirCorredoresId(DefaultTableModel dtm, ArrayList<Corredor> lista, JTable table) {

        dtm = (DefaultTableModel) table.getModel();

        if (dtm.getRowCount() > 0) {
            for (int i = dtm.getRowCount() - 1; i > -1; i--) {
                dtm.removeRow(i);
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            dtm.addRow(lista.get(i).toArrayString(i + 1));
        }
        System.out.println(dtm.getRowCount());
    }

    public void modificarCorredor(Corredor corredor, ArrayList<Corredor> lista, Integer index) {

        lista.set(index, corredor);
    }

    /*CARRERAS*/
    public void inicializarTablaCarrera(DefaultTableModel dtm, JTable table) {
        dtm = new DefaultTableModel() {

    @Override
    public boolean isCellEditable(int row, int column) {
       //all cells false
       return false;
    }
};
        dtm.setColumnIdentifiers(new String[]{"Nombre", "Fecha de la carrera",
            "Lugar de la carrera", "Número máximo de participantes",
            "Corredores"});
        table.setModel(dtm);
        //anadirCorredores(dtm, lista, jTableCorredores);
    }

    public void inicializarTablaBajaCarrera(DefaultTableModel dtm, JTable table) {
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"ID", "Nombre", "Fecha de la carrera",
            "Lugar de la carrera", "Número máximo de participantes",
            "Corredores"});
        table.setModel(dtm);
        //anadirCorredores(dtm, lista, jTableCorredores);
    }

    public void anadirCarrera(Carrera carrera, ArrayList<Carrera> lista) {
        lista.add(carrera);
    }

    public void anadirCarreras(DefaultTableModel dtm, ArrayList<Carrera> lista, JTable table) {
        dtm = (DefaultTableModel) table.getModel();

        if (dtm.getRowCount() > 0) {
            for (int i = dtm.getRowCount() - 1; i > -1; i--) {
                dtm.removeRow(i);
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            dtm.addRow(lista.get(i).toArrayString());
        }
    }

    public void anadirCarrerasId(DefaultTableModel dtm, ArrayList<Carrera> lista, JTable table) {

        dtm = (DefaultTableModel) table.getModel();

        if (dtm.getRowCount() > 0) {
            for (int i = dtm.getRowCount() - 1; i > -1; i--) {
                dtm.removeRow(i);
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            dtm.addRow(lista.get(i).toArrayString(i + 1));
        }
        System.out.println(dtm.getRowCount());
    }

    public void modificarCarrera(Carrera carrera, ArrayList<Carrera> lista, Integer index) {

        lista.set(index, carrera);
    }

    public String corredoresToString(Map<Corredor, Dorsal> map) {
        String str = "";
        int i = 0;
        for (Map.Entry<Corredor, Dorsal> entry : map.entrySet()) {

            str = str.concat(entry.getKey().getNombre() + ",");

        }
        str = str.substring(0, str.length() - 1);
        System.out.println(str);
        return str;

    }

    public void llenarJList(DefaultListModel<Corredor> listModel, List<Corredor> lista) {
        for(Corredor c : lista){
            listModel.addElement(c);
            
        }
        /*listModel.addElement(c1);
        listModel.addElement(c2);
        listModel.addElement(c3);
        listModel.addElement(c4);
        listModel.addElement(c5);
        listModel.addElement(c6);
        listModel.addElement(c7);*/

    }

    /* public void toolTip(JTable table, MouseEvent e){
         for(int i=0;i<table.getRowCount();i++){
             
         }
     }*/
}
