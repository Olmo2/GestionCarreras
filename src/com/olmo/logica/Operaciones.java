/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olmo.logica;

import com.olmo.negocio.Carreras.Carrera;
import com.olmo.negocio.Corredores.Corredor;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OLMO
 */
public class Operaciones {
 Corredor  corredor =new Corredor("Olmo","71729223C",new Date(99,05,28),"C/Falsa 123",608013779);
 Corredor  corredor2 =new Corredor("Anakin","71729223C",new Date(99,05,28),"C/Falsa 123",608013779);
    public void inicializarTabla(DefaultTableModel dtm, JTable table) {
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Nombre", "DNI", "Fecha de Nacimiento", "Direccion", "Teléfono de contacto"});
        table.setModel(dtm);
        //anadirCorredores(dtm, lista, jTableCorredores);
    }

    public void inicializarTablaBaja(DefaultTableModel dtm, JTable table) {
        dtm = new DefaultTableModel();
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
         System.out.println("Hoal");
        lista.set(index, corredor);
    }
     /*carreras*/
      public void inicializarTablaCarrera(DefaultTableModel dtm, JTable table) {
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Nombre", "Fecha de la carrera",
            "Lugar de la carrera", "Número máximo de participantes",
            "CorredoresLlegada", "Corredores"});
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
     
     public void llenarJList(DefaultListModel<Corredor> listModel){
         listModel.addElement(corredor);
         listModel.addElement(corredor2);
     }
}
