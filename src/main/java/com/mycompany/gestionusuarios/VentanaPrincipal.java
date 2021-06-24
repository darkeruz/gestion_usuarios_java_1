package com.mycompany.gestionusuarios;

import gui.Alta;
import gui.Baja;
import gui.Modificar;

public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_titulo = new javax.swing.JLabel();
        jButton_bajaAlumno = new javax.swing.JButton();
        jButton_altaAlumno = new javax.swing.JButton();
        jButton_modificar = new javax.swing.JButton();
        jButton_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_titulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_titulo.setText("Elige una opción");

        jButton_bajaAlumno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton_bajaAlumno.setText("Baja de alumno");
        jButton_bajaAlumno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_bajaAlumno.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton_bajaAlumno.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton_bajaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_bajaAlumnoActionPerformed(evt);
            }
        });

        jButton_altaAlumno.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton_altaAlumno.setText("Alta de alumno");
        jButton_altaAlumno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_altaAlumno.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton_altaAlumno.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton_altaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_altaAlumnoActionPerformed(evt);
            }
        });

        jButton_modificar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton_modificar.setText("Modificar alumno");
        jButton_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_modificar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton_modificar.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modificarActionPerformed(evt);
            }
        });

        jButton_salir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton_salir.setText("Salir");
        jButton_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_salir.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton_salir.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jButton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel_titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_altaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_bajaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel_titulo)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_bajaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_altaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_bajaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_bajaAlumnoActionPerformed
        // TODO add your handling code here:
        Baja ventanaBaja = new Baja();
        ventanaBaja.setVisible(true);
    }//GEN-LAST:event_jButton_bajaAlumnoActionPerformed

    private void jButton_altaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_altaAlumnoActionPerformed
        // TODO add your handling code here:
        Alta alta = new Alta();
        alta.setVisible(true);
    }//GEN-LAST:event_jButton_altaAlumnoActionPerformed

    private void jButton_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modificarActionPerformed
        // TODO add your handling code here:
        Modificar ventanaModificar = new Modificar();
        ventanaModificar.setVisible(true);
    }//GEN-LAST:event_jButton_modificarActionPerformed

    private void jButton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_salirActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_altaAlumno;
    private javax.swing.JButton jButton_bajaAlumno;
    private javax.swing.JButton jButton_modificar;
    private javax.swing.JButton jButton_salir;
    private javax.swing.JLabel jLabel_titulo;
    // End of variables declaration//GEN-END:variables
}
