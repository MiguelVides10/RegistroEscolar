/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registroescolar;

import javax.swing.JOptionPane;

/**
 *
 * @author migue
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel1.setText("Plantilla Docente");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 20, 220, 36);

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel2.setText("Horario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 300, 60, 23);

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 70, 23);

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 150, 70, 23);

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel5.setText("Dui:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 200, 40, 23);

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jLabel6.setText("Curso:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 250, 50, 23);

        jTextField1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(100, 200, 130, 26);

        jTextField2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(100, 100, 130, 26);

        jTextField3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(100, 150, 130, 26);

        jComboBox1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Horario 1", "Horario 2", "Horario 3", "Horario 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(100, 300, 130, 26);

        jComboBox2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Curso 1", "Curso 2", "Curso 3", "Curso 4" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(100, 250, 130, 26);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Juan", "Cerbellón", "147896-9", "Lenguaje", "10:00-1:00"},
                {"2", "Lucia", "Valladares", "147936-2", "Matematica", "3:00-5:00"}
            },
            new String [] {
                "Id docente", "Nombre", "Apellido", "Dui", "Curso", "Horario"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(260, 130, 550, 250);

        jButton1.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 12)); // NOI18N
        jButton1.setText("Alumnos");
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 80, 90, 29);

        jButton2.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 12)); // NOI18N
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(140, 390, 90, 29);

        jButton3.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 12)); // NOI18N
        jButton3.setText("Cursos");
        getContentPane().add(jButton3);
        jButton3.setBounds(280, 80, 90, 29);

        jButton4.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 12)); // NOI18N
        jButton4.setText("Horarios");
        getContentPane().add(jButton4);
        jButton4.setBounds(400, 80, 90, 29);

        jButton5.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 12)); // NOI18N
        jButton5.setText("Guardar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(80, 340, 90, 29);

        jButton6.setFont(new java.awt.Font("Lucida Sans Unicode", 3, 12)); // NOI18N
        jButton6.setText("Editar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(30, 390, 90, 29);

        setBounds(0, 0, 858, 475);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(null,  "Registro guardado con éxito","Exito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(null, "No se pudo guardar el registro", "Error", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showConfirmDialog(null, "Se eliminará un elemento\n de forma permanente", "Borrar", JOptionPane.OK_CANCEL_OPTION);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
