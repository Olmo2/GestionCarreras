/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olmo.GUI;

/**
 *
 * @author OLMO
 */
public class Principal extends javax.swing.JFrame {
 Corredores corredores;
 AltaCorredores altaCorredores;
 BajaCorredores bajaCorredores;
  ModificarCorredores  modificarCorredores;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        corredores = new Corredores(this,true);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCorredores = new javax.swing.JMenu();
        jMenuAltaCorredor = new javax.swing.JMenu();
        jMenuBajaCorredor = new javax.swing.JMenu();
        jMenuModificarCorredor = new javax.swing.JMenu();
        jMenuVerCorredores = new javax.swing.JMenu();
        jMenuCarrerasNo = new javax.swing.JMenu();
        jMenuAltaCarreras = new javax.swing.JMenu();
        jMenuBajaCarreras = new javax.swing.JMenu();
        jMenuModificarCarrera = new javax.swing.JMenu();
        jMenuCarreras = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuCorredores.setText("Corredores");
        jMenuCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCorredoresActionPerformed(evt);
            }
        });

        jMenuAltaCorredor.setText("Alta");
        jMenuAltaCorredor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAltaCorredorMouseClicked(evt);
            }
        });
        jMenuCorredores.add(jMenuAltaCorredor);

        jMenuBajaCorredor.setText("Baja");
        jMenuBajaCorredor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBajaCorredorMouseClicked(evt);
            }
        });
        jMenuCorredores.add(jMenuBajaCorredor);

        jMenuModificarCorredor.setText("Modificar");
        jMenuModificarCorredor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuModificarCorredorMouseClicked(evt);
            }
        });
        jMenuCorredores.add(jMenuModificarCorredor);

        jMenuVerCorredores.setText("Ver Corredores");
        jMenuVerCorredores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuVerCorredoresMouseClicked(evt);
            }
        });
        jMenuCorredores.add(jMenuVerCorredores);

        jMenuBar1.add(jMenuCorredores);

        jMenuCarrerasNo.setText("Carreras no realizadas");

        jMenuAltaCarreras.setText("Alta");
        jMenuCarrerasNo.add(jMenuAltaCarreras);

        jMenuBajaCarreras.setText("Baja");
        jMenuCarrerasNo.add(jMenuBajaCarreras);

        jMenuModificarCarrera.setText("Modificar");
        jMenuCarrerasNo.add(jMenuModificarCarrera);

        jMenuBar1.add(jMenuCarrerasNo);

        jMenuCarreras.setText("Carreras realizadas");
        jMenuBar1.add(jMenuCarreras);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCorredoresActionPerformed
      
    }//GEN-LAST:event_jMenuCorredoresActionPerformed

    private void jMenuVerCorredoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVerCorredoresMouseClicked
        
       corredores.setVisible(true);
    }//GEN-LAST:event_jMenuVerCorredoresMouseClicked

    private void jMenuAltaCorredorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAltaCorredorMouseClicked
      
        altaCorredores = new AltaCorredores(this,corredores,true);
       altaCorredores.setVisible(true);
    }//GEN-LAST:event_jMenuAltaCorredorMouseClicked

    private void jMenuBajaCorredorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBajaCorredorMouseClicked
        bajaCorredores = new BajaCorredores(this,corredores,true);
       bajaCorredores.setVisible(true);
    }//GEN-LAST:event_jMenuBajaCorredorMouseClicked

    private void jMenuModificarCorredorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuModificarCorredorMouseClicked
         modificarCorredores = new ModificarCorredores(this,corredores,true);
       modificarCorredores.setVisible(true);
    }//GEN-LAST:event_jMenuModificarCorredorMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAltaCarreras;
    private javax.swing.JMenu jMenuAltaCorredor;
    private javax.swing.JMenu jMenuBajaCarreras;
    private javax.swing.JMenu jMenuBajaCorredor;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCarreras;
    private javax.swing.JMenu jMenuCarrerasNo;
    private javax.swing.JMenu jMenuCorredores;
    private javax.swing.JMenu jMenuModificarCarrera;
    private javax.swing.JMenu jMenuModificarCorredor;
    private javax.swing.JMenu jMenuVerCorredores;
    // End of variables declaration//GEN-END:variables
}
