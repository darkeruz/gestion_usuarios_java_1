package gui;

import alumno.Alumno;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.Metodos;

public class Alta extends javax.swing.JFrame {
    
    Alumno alumno = new Alumno();
    Metodos metodos = new Metodos();
    DefaultTableModel modeloTabla;
    Vector vCabeceras = new Vector();

    public Alta() {
        initComponents();
        
        vCabeceras.addElement("Nombre");
        vCabeceras.addElement("Apellido");
        vCabeceras.addElement("DNI");
        vCabeceras.addElement("Carrera");
        modeloTabla = new DefaultTableModel(vCabeceras,0);
        jTable_tablaAltaAlumno.setModel(modeloTabla);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_nombre = new javax.swing.JLabel();
        jLabel_apellido = new javax.swing.JLabel();
        jLabel_dni = new javax.swing.JLabel();
        jLabel_carrera = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();
        jTextField_apellido = new javax.swing.JTextField();
        jTextField_dni = new javax.swing.JTextField();
        jTextField_carrera = new javax.swing.JTextField();
        jLabel_Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_tablaAltaAlumno = new javax.swing.JTable();
        jButton_regresar = new javax.swing.JButton();
        jButton_guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_nombre.setText("Nombre:");

        jLabel_apellido.setText("Apellido:");

        jLabel_dni.setText("DNI:");

        jLabel_carrera.setText("Carrera:");

        jTextField_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombreActionPerformed(evt);
            }
        });

        jTextField_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_apellidoActionPerformed(evt);
            }
        });

        jTextField_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_dniActionPerformed(evt);
            }
        });

        jTextField_carrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_carreraActionPerformed(evt);
            }
        });

        jLabel_Titulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Titulo.setText("Alta de alumno nuevo");

        jTable_tablaAltaAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_tablaAltaAlumno);

        jButton_regresar.setText("Regresar");
        jButton_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_regresarActionPerformed(evt);
            }
        });

        jButton_guardar.setText("Guardar");
        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton_regresar)
                        .addGap(174, 174, 174)
                        .addComponent(jButton_guardar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_apellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_dni, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_carrera, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addComponent(jTextField_apellido)
                                        .addComponent(jTextField_carrera))
                                    .addComponent(jTextField_dni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addComponent(jLabel_Titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel_Titulo)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_apellido)
                    .addComponent(jTextField_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_dni)
                    .addComponent(jTextField_dni, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_carrera)
                    .addComponent(jTextField_carrera, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_regresar)
                    .addComponent(jButton_guardar))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombreActionPerformed

    private void jTextField_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_apellidoActionPerformed

    private void jTextField_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_dniActionPerformed

    private void jTextField_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_carreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_carreraActionPerformed

    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
        // TODO add your handling code here:
        modeloTabla = new DefaultTableModel();
        String nombre = jTextField_nombre.getText();
        String apellido = jTextField_apellido.getText();
        String dni = jTextField_dni.getText();
        String carrera = jTextField_carrera.getText();
        
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setDni(dni);
        alumno.setCarrera(carrera);
        
        metodos.guardar(alumno);
        metodos.guardarArchivo(alumno);
        
        JOptionPane.showMessageDialog(null, "Registro exitoso!");
        
        jTextField_nombre.setText("");
        jTextField_apellido.setText("");
        jTextField_dni.setText("");
        jTextField_carrera.setText("");
        
        jTable_tablaAltaAlumno.setModel(metodos.listaAlumnos());
        
    }//GEN-LAST:event_jButton_guardarActionPerformed

    private void jButton_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_regresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JButton jButton_regresar;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_apellido;
    private javax.swing.JLabel jLabel_carrera;
    private javax.swing.JLabel jLabel_dni;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_tablaAltaAlumno;
    private javax.swing.JTextField jTextField_apellido;
    private javax.swing.JTextField jTextField_carrera;
    private javax.swing.JTextField jTextField_dni;
    private javax.swing.JTextField jTextField_nombre;
    // End of variables declaration//GEN-END:variables
}
