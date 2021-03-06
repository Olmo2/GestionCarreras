/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olmo.GUI.Modificar;

import com.olmo.GUI.Corredores;
import com.olmo.GUI.Principal;
import com.olmo.logica.Operaciones;
import com.olmo.negocio.Corredores.Corredor;
import java.sql.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JDialog;

/**
 *
 * @author OLMO
 */
public class ModificarCorredor extends javax.swing.JDialog {

    /**
     * Creates new form ModificarCorredor
     */
    Principal principal;
      Corredores corredores;
      Corredor corredor;
      ModificarCorredores modificarCorredores;
      Integer index;
    Pattern pattern;
    Matcher m;
    Boolean validNombre, validDni, validFecha, validDir, validTlf;
    Operaciones op;
    public ModificarCorredor(java.awt.Frame parent,JDialog dialog, JDialog dialog2,Integer index, boolean modal) {
        super(parent, modal);
                this.index=index;
            corredores = (Corredores)dialog;
            principal = (Principal)parent;
            modificarCorredores = (ModificarCorredores)dialog2;
         corredor =  principal.getListaCorredores().get(index);
         op = new Operaciones();
        initComponents();
         setLocationRelativeTo(null);
        jTextFieldNombre.setText(corredor.getNombre());
        jTextFieldDni.setText(corredor.getDNI());
        jTextFieldFecha.setText(corredor.getFecha().toString());
        jTextFieldDir.setText(corredor.getDir());
        jTextFieldTlf.setText(corredor.getTlf().toString());
        validNombre= validDni= validFecha= validDir= validTlf=true;
         jLabelErrorNombre.setVisible(false);
        jLabelErrorDni.setVisible(false);
        jLabelErrorFecha.setVisible(false);
        jLabelErrorDir.setVisible(false);
        jLabelErrorTlf.setVisible(false);
        jLabelErrores.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelErrorDir = new javax.swing.JLabel();
        jLabelErrorTlf = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelErrores = new javax.swing.JLabel();
        jTextFieldDni = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldDir = new javax.swing.JTextField();
        jTextFieldTlf = new javax.swing.JTextField();
        jLabelTitulo = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jLabelErrorNombre = new javax.swing.JLabel();
        jLabelErrorDni = new javax.swing.JLabel();
        jLabelErrorFecha = new javax.swing.JLabel();
        jLabelDir = new javax.swing.JLabel();
        jLabelTlf = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jButtonVovler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelErrorDir.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabelErrorDir.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorDir.setText("Rellena la dirección ");

        jLabelErrorTlf.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabelErrorTlf.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorTlf.setText("Comprueba el formato '000000000'");

        jTextFieldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNombreFocusLost(evt);
            }
        });

        jLabelErrores.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrores.setText("Revisa tus datos, hay errores");

        jTextFieldDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDniFocusLost(evt);
            }
        });
        jTextFieldDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDniActionPerformed(evt);
            }
        });

        jTextFieldFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFechaFocusLost(evt);
            }
        });

        jTextFieldDir.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldDirFocusLost(evt);
            }
        });

        jTextFieldTlf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldTlfFocusLost(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("Modificar Corredor");

        jButtonModificar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButtonModificar.setText("Modificar");
        jButtonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonModificarMouseClicked(evt);
            }
        });

        jLabelErrorNombre.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabelErrorNombre.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorNombre.setText("Rellena el nombre");

        jLabelErrorDni.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabelErrorDni.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorDni.setText("Comprueba el formato '00000000A'");

        jLabelErrorFecha.setFont(new java.awt.Font("Dialog", 1, 8)); // NOI18N
        jLabelErrorFecha.setForeground(new java.awt.Color(255, 0, 0));
        jLabelErrorFecha.setText("Comprueba el formato 'YYYY-MM-DD'");

        jLabelDir.setText("Dirección:  ");

        jLabelTlf.setText("Teléfono de contacto: ");

        jLabelNombre.setText("Nombre: ");

        jLabelDni.setText("DNI: ");

        jLabelFecha.setText("Fecha de nacimiento: ");

        jButtonVovler.setText("Volver");
        jButtonVovler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVovlerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelNombre)
                                    .addComponent(jLabelDni)
                                    .addComponent(jLabelDir)
                                    .addComponent(jLabelTlf)
                                    .addComponent(jLabelFecha))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNombre)
                                            .addComponent(jTextFieldDni)
                                            .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextFieldDir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTlf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelErrorFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelErrorTlf)
                                        .addComponent(jLabelErrorDir, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelErrorDni, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelErrorNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabelErrores))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVovler, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButtonVovler)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelErrorNombre))
                    .addComponent(jLabelNombre))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDni)
                            .addComponent(jLabelErrorDni))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelErrorFecha))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelErrorDir))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldTlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelErrorTlf)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabelFecha)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabelTlf))
                            .addComponent(jLabelDir))))
                .addGap(34, 34, 34)
                .addComponent(jButtonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelErrores)
                .addContainerGap(72, Short.MAX_VALUE))
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

    private void jTextFieldDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDniFocusLost
        pattern = Pattern.compile("([0-9]{8}[A-Z]{1})");
        m = pattern.matcher(jTextFieldDni.getText());
        if (!m.matches()) {
            validDni = false;
            jLabelErrorDni.setVisible(true);
        } else {
            validDni = true;
            jLabelErrorDni.setVisible(false);
        }
    }//GEN-LAST:event_jTextFieldDniFocusLost

    private void jTextFieldDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDniActionPerformed

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

    private void jTextFieldDirFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldDirFocusLost
        if (jTextFieldDir.getText().isEmpty()) {
            validDir = false;
            jLabelErrorDir.setVisible(true);
        } else {
            validDir = true;
            jLabelErrorDir.setVisible(false);
        }
    }//GEN-LAST:event_jTextFieldDirFocusLost

    private void jTextFieldTlfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldTlfFocusLost
        pattern = Pattern.compile("([0-9]{9})");
        m = pattern.matcher(jTextFieldTlf.getText());
        if (!m.matches()) {
            validTlf = false;
            jLabelErrorTlf.setVisible(true);
        } else {
            validTlf = true;
            jLabelErrorTlf.setVisible(false);
        }
    }//GEN-LAST:event_jTextFieldTlfFocusLost

    private void jButtonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModificarMouseClicked
        if (validNombre && validDni && validFecha && validDir && validTlf) {

            String raw = jTextFieldFecha.getText();
            String[] arr = raw.split("-");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            /*                          Año                  mes                         dia        */
            Date date = new Date(Integer.parseInt(arr[0]) - 1900, Integer.parseInt(arr[1]) - 1, Integer.parseInt(arr[2]));
            Corredor corredor = new Corredor(jTextFieldNombre.getText(), jTextFieldDni.getText(), date,
                jTextFieldDir.getText(), Integer.parseInt(jTextFieldTlf.getText()));
            System.out.println(corredor);
             System.out.println( principal.getListaCorredores());
            op.modificarCorredor(corredor,  principal.getListaCorredores(), index);
            op.anadirCorredores(corredores.getDtm(),  principal.getListaCorredores(), modificarCorredores.getjTableCorredores());
            
            this.dispose();
        } else {
            jLabelErrores.setVisible(true);
        }
    }//GEN-LAST:event_jButtonModificarMouseClicked

    private void jButtonVovlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVovlerMouseClicked
        op.anadirCarreras(principal.getDtm(), principal.getListaCarreras(), principal.getjTableCarreras());
        this.dispose();
    }//GEN-LAST:event_jButtonVovlerMouseClicked

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
            java.util.logging.Logger.getLogger(ModificarCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarCorredor dialog = new ModificarCorredor(new javax.swing.JFrame(),new javax.swing.JDialog(),new javax.swing.JDialog(), 0, true);
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
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonVovler;
    private javax.swing.JLabel jLabelDir;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelErrorDir;
    private javax.swing.JLabel jLabelErrorDni;
    private javax.swing.JLabel jLabelErrorFecha;
    private javax.swing.JLabel jLabelErrorNombre;
    private javax.swing.JLabel jLabelErrorTlf;
    private javax.swing.JLabel jLabelErrores;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelTlf;
    private javax.swing.JTextField jTextFieldDir;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTlf;
    // End of variables declaration//GEN-END:variables
}
