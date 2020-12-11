/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olmo.GUI.Alta;

import com.olmo.GUI.Corredores;
import com.olmo.GUI.Principal;
import com.olmo.logica.Operaciones;
import com.olmo.negocio.Carreras.Carrera;
import com.olmo.negocio.Corredores.Corredor;
import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;

/**
 *
 * @author OLMO
 */
public class AltaCarreras extends javax.swing.JDialog {

    /**
     * Creates new form AltaCarreras
     */
    Principal principal;
     Pattern pattern;
    Matcher m;
    Boolean validNombre, validDni, validFecha, validDir, validTlf;
    Operaciones op;
    DefaultListModel<Corredor> listModel ;
    public AltaCarreras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        principal = (Principal)parent;
        op=new Operaciones();
        initComponents();
        jListParticipantes.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        int[] s= {0,1};
        jListParticipantes.setSelectedIndices(s);
         setLocationRelativeTo(null);
         listModel = new DefaultListModel();
         op.llenarJList(listModel);
         jListParticipantes.setModel(listModel);
         jLabelErrorDir.setVisible(false);
         jLabelErrorFecha.setVisible(false);
         jLabelErrorNombre.setVisible(false);
         jLabelErrores.setVisible(false);
         jLabelErrorLista.setVisible(false);
         jLabelErrorMax.setVisible(false);
         
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        corredor1 = new com.olmo.negocio.Corredores.Corredor();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabelFecha = new javax.swing.JLabel();
        jLabelDir = new javax.swing.JLabel();
        jLabelTlf = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldLugar = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonAlta = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jLabelErrorNombre = new javax.swing.JLabel();
        jLabelErrorFecha = new javax.swing.JLabel();
        jLabelErrorDir = new javax.swing.JLabel();
        jLabelErrores = new javax.swing.JLabel();
        jButtonVolver = new javax.swing.JButton();
        jTextFieldMax = new javax.swing.JTextField();
        jLabelErrorMax = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListParticipantes = new javax.swing.JList<>();
        jLabelErrorLista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelFecha.setText("Fecha de la carrera:");

        jLabelDir.setText("Lugar de la carrera:");

        jLabelTlf.setText("Maximo de participantes: ");

        jTextFieldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNombreFocusLost(evt);
            }
        });

        jTextFieldFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFechaFocusLost(evt);
            }
        });

        jTextFieldLugar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldLugarFocusLost(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Alta Carrera");

        jButtonAlta.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonAlta.setText("Alta");
        jButtonAlta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAltaMouseClicked(evt);
            }
        });

        jLabelNombre.setText("Nombre: ");

        jLabelErrorNombre.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabelErrorNombre.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorNombre.setText("Rellena el nombre");

        jLabelErrorFecha.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabelErrorFecha.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorFecha.setText("Comprueba el formato 'YYYY-MM-DD'");

        jLabelErrorDir.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabelErrorDir.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorDir.setText("Rellena la dirección ");

        jLabelErrores.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrores.setText("Revisa tus datos, hay errores");

        jButtonVolver.setText("Volver");
        jButtonVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVolverMouseClicked(evt);
            }
        });
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jTextFieldMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaxActionPerformed(evt);
            }
        });

        jLabelErrorMax.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabelErrorMax.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorMax.setText("Escribe un número entre 1 y 20");

        jLabel2.setText("Lista de participantes:");

        jListParticipantes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListParticipantesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListParticipantes);

        jLabelErrorLista.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabelErrorLista.setForeground(new java.awt.Color(255, 0, 51));
        jLabelErrorLista.setText("Selecciona almenos un corredor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelNombre)
                                        .addGap(123, 123, 123)
                                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextFieldMax, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextFieldLugar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButtonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabelErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabelErrorLista))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDir)
                                    .addComponent(jLabelTlf)
                                    .addComponent(jLabelFecha))
                                .addGap(206, 206, 206)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelErrorDir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelErrorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelErrorMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabelErrores)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVolver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelNombre)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelErrorNombre)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFecha)
                    .addComponent(jLabelErrorFecha))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelErrorDir))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTlf)
                            .addComponent(jTextFieldMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelErrorMax)))
                    .addComponent(jLabelDir))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(158, 158, 158))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabelErrorLista)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButtonAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelErrores)
                .addGap(102, 102, 102))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNombreFocusLost
        if (jTextFieldNombre.getText().isEmpty()) {
            validNombre = false;
            jLabelErrorNombre.setVisible(true);
        } else {
            validNombre = true;
            jLabelErrorNombre.setVisible(false);
        }
    }//GEN-LAST:event_jTextFieldNombreFocusLost

    private void jTextFieldFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFechaFocusLost
        pattern = Pattern.compile("([0-9]{4}-[0-9]{2}-[0-9]{2})");
        m = pattern.matcher(jTextFieldFecha.getText());
        String[] attr = jTextFieldFecha.getText().split("-");

        if (!m.matches() || ((Integer.parseInt(attr[0]) < 0 || Integer.parseInt(attr[0]) > 2020)
            || (Integer.parseInt(attr[1]) < 1 || Integer.parseInt(attr[1]) > 12)
            || (Integer.parseInt(attr[2]) < 1 || Integer.parseInt(attr[2]) > 31))) {
        validFecha = false;
        jLabelErrorFecha.setVisible(true);
        } else {
            validFecha = true;
            jLabelErrorFecha.setVisible(false);
        }
    }//GEN-LAST:event_jTextFieldFechaFocusLost

    private void jTextFieldLugarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldLugarFocusLost
        if (jTextFieldLugar.getText().isEmpty()) {
            validDir = false;
            jLabelErrorDir.setVisible(true);
        } else {
            validDir = true;
            jLabelErrorDir.setVisible(false);
        }
    }//GEN-LAST:event_jTextFieldLugarFocusLost

    private void jButtonAltaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAltaMouseClicked
        if (validNombre && validDni && validFecha && validDir && validTlf) {

            String raw = jTextFieldFecha.getText();
            String[] arr = raw.split("-");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            /*                          Año                  mes                         dia        */
            Date date = new Date(Integer.parseInt(arr[0]) - 1900, Integer.parseInt(arr[1]) - 1, Integer.parseInt(arr[2]));
          //  Corredor corredor = new Corredor(jTextFieldNombre.getText(), jTextFieldDni.getText(), date,
           //     jTextFieldDir.getText(), Integer.parseInt(jTextFieldTlf.getText()));
         /*TODO añadir mapa */
            Carrera carrera = new Carrera(jTextFieldNombre.getText(),date,jTextFieldLugar.getText(),
                    Integer.parseInt(jTextFieldMax.getText()),null, null);
            op.anadirCarrera(carrera, principal.getLista());
            op.anadirCarreras(principal.getDtm(), principal.getLista(), principal.getjTableCarreras());
            this.dispose();
        } else {
            jLabelErrores.setVisible(true);
        }
    }//GEN-LAST:event_jButtonAltaMouseClicked

    private void jButtonVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVolverMouseClicked
        op.anadirCarreras(principal.getDtm(), principal.getLista(), principal.getjTableCarreras());
        this.dispose();
    }//GEN-LAST:event_jButtonVolverMouseClicked

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jTextFieldMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMaxActionPerformed

    private void jListParticipantesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListParticipantesValueChanged
        if(jListParticipantes.getSelectedIndex()==-1){
            jLabelErrorLista.setVisible(true);
        }else{
             jLabelErrorLista.setVisible(false);
        }
    }//GEN-LAST:event_jListParticipantesValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AltaCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaCarreras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AltaCarreras dialog = new AltaCarreras(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.olmo.negocio.Corredores.Corredor corredor1;
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDir;
    private javax.swing.JLabel jLabelErrorDir;
    private javax.swing.JLabel jLabelErrorFecha;
    private javax.swing.JLabel jLabelErrorLista;
    private javax.swing.JLabel jLabelErrorMax;
    private javax.swing.JLabel jLabelErrorNombre;
    private javax.swing.JLabel jLabelErrores;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTlf;
    private javax.swing.JList<Corredor> jListParticipantes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldLugar;
    private javax.swing.JTextField jTextFieldMax;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

}
