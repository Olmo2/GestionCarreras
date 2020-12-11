/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olmo.logica;

import com.olmo.negocio.Corredores.Corredor;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author OLMO
 */
public class Operaciones {

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
        /*for (int i = 0; i < dtm.getRowCount(); i++) {
            dtm.removeRow(i);
        }
        

        for (int i = 0; i < lista.size(); i++) {
            dtm.addRow(lista.get(i).toArrayString());
        }*/
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
       /* for (int i = 0; i < dtm.getRowCount(); i++) {
            dtm.removeRow(i);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i) + "" + i);

            dtm.addRow(lista.get(i).toArrayString(i + 1));
        }*/
       
       if (dtm.getRowCount() > 0) {
            for (int i = dtm.getRowCount() - 1; i > -1; i--) {
                dtm.removeRow(i);
            }
        }
        
        for (int i = 0; i < lista.size(); i++) {
            dtm.addRow(lista.get(i).toArrayString(i+1));
        }
        System.out.println(dtm.getRowCount());
    }

}
