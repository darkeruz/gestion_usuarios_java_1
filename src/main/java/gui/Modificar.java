
package gui;

import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import metodos.Metodos;


public class Modificar extends javax.swing.JFrame {
    
    int filas;
    Metodos metodos = new Metodos();
    DefaultTableModel tablaModelo = new DefaultTableModel();
    


    public Modificar() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTable_modificar.setModel(metodos.listaAlumnos());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_modificar = new javax.swing.JTable();
        jButton_regresar = new javax.swing.JButton();
        jButton_actualizar = new javax.swing.JButton();
        jTextField_apellido = new javax.swing.JTextField();
        jTextField_dni = new javax.swing.JTextField();
        jTextField_carrera = new javax.swing.JTextField();
        jLabel_nombre = new javax.swing.JLabel();
        jLabel_apellido = new javax.swing.JLabel();
        jLabel_dni = new javax.swing.JLabel();
        jLabel_carrera = new javax.swing.JLabel();
        jTextField_nombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_titulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel_titulo.setText("Selecciona una fila, modifica y presiona en Actualizar");

        jTable_modificar.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_modificarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_modificar);

        jButton_regresar.setText("Regresar");
        jButton_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_regresarActionPerformed(evt);
            }
        });

        jButton_actualizar.setText("Actualizar");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
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

        jLabel_nombre.setText("Nombre:");

        jLabel_apellido.setText("Apellido:");

        jLabel_dni.setText("DNI:");

        jLabel_carrera.setText("Carrera:");

        jTextField_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel_titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
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
                                        .addComponent(jTextField_nombre)
                                        .addComponent(jTextField_apellido)
                                        .addComponent(jTextField_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField_dni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButton_regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_actualizar)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_nombre)
                    .addComponent(jTextField_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_apellido)
                    .addComponent(jTextField_apellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_dni)
                    .addComponent(jTextField_dni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_carrera)
                    .addComponent(jTextField_carrera))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_regresar)
                    .addComponent(jButton_actualizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_regresarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton_regresarActionPerformed

    private void jTextField_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_apellidoActionPerformed

    private void jTextField_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_dniActionPerformed

    private void jTextField_carreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_carreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_carreraActionPerformed

    private void jTextField_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_nombreActionPerformed

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        // TODO add your handling code here:
        String []datos = new String[4];
        datos[0] = jTextField_nombre.getText();
        datos[1] = jTextField_apellido.getText();
        datos[2] = jTextField_dni.getText();
        datos[3] = jTextField_carrera.getText();
        
        for(int k=0; k<jTable_modificar.getColumnCount(); k++){
            jTable_modificar.setValueAt(datos[k], filas, k);
        }
        
        try{
            String archivo = "Alumnos.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            for(int i=0; i<jTable_modificar.getRowCount(); i++){
                for(int j=0; j<jTable_modificar.getColumnCount(); j++){
                    bw.write((String) (jTable_modificar.getValueAt(i, j)));
                    if(j<jTable_modificar.getColumnCount()-1){
                        bw.write("|");
                    }
                }
                bw.newLine();
            }
            bw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
        JOptionPane.showMessageDialog(rootPane, "Registro actualizado!");
        
        jTextField_nombre.setText("");
        jTextField_apellido.setText("");
        jTextField_dni.setText("");
        jTextField_carrera.setText("");
              
    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jTable_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_modificarMouseClicked
        // TODO add your handling code here:
        this.tablaModelo = (DefaultTableModel) jTable_modificar.getModel();
        
        int seleccion = jTable_modificar.getSelectedRow();
        jTextField_nombre.setText(jTable_modificar.getValueAt(seleccion, 0).toString());
        jTextField_apellido.setText(jTable_modificar.getValueAt(seleccion, 1).toString());
        jTextField_dni.setText(jTable_modificar.getValueAt(seleccion, 2).toString());
        jTextField_carrera.setText(jTable_modificar.getValueAt(seleccion, 3).toString());
        filas = seleccion;
    }//GEN-LAST:event_jTable_modificarMouseClicked

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
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_regresar;
    private javax.swing.JLabel jLabel_apellido;
    private javax.swing.JLabel jLabel_carrera;
    private javax.swing.JLabel jLabel_dni;
    private javax.swing.JLabel jLabel_nombre;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_modificar;
    private javax.swing.JTextField jTextField_apellido;
    private javax.swing.JTextField jTextField_carrera;
    private javax.swing.JTextField jTextField_dni;
    private javax.swing.JTextField jTextField_nombre;
    // End of variables declaration//GEN-END:variables
}
