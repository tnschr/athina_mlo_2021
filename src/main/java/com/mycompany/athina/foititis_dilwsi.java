/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.athina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanos
 */
public class foititis_dilwsi extends javax.swing.JFrame {

    /**
     * Creates new form foititis_dilwsi
     */
    String armit;
    public foititis_dilwsi(String am) {
        initComponents();
        armit = am;
        
    }
     Connection connection=null;
    Statement st=null;
    ResultSet set=null;
    String mathima1;
    String mathima2;
    String mathima3;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        provoli_dilwsis_button = new javax.swing.JButton();
        provoli_dilwsis_button1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Φοιτητής Panel");

        jLabel2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Athina System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jCheckBox1.setText("C++");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Java");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("IoT");

        jButton1.setText("Υποβολή");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        provoli_dilwsis_button.setText("Προβολή Δήλωσης");
        provoli_dilwsis_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provoli_dilwsis_buttonActionPerformed(evt);
            }
        });

        provoli_dilwsis_button1.setText("Προβολή Βαθμολογιών");
        provoli_dilwsis_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provoli_dilwsis_button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(provoli_dilwsis_button, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(provoli_dilwsis_button1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addGap(18, 18, 18)
                .addComponent(provoli_dilwsis_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(provoli_dilwsis_button1)
                .addContainerGap(360, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        mathima1 = "Java";
        
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        try {
            String checkbox = "";
            connection = ConnectionManager.getConnection();
            if (jCheckBox1.isSelected()){
                checkbox=jCheckBox1.getText();
                System.out.println(checkbox);
                 String query="INSERT INTO dilwsi(id_mathimatos,am,mathima)"
                         + "SELECT id_math,'"+armit+"','"+checkbox+"'"
                         + "FROM mathimata WHERE onoma_math = '"+checkbox+"'";
                 st=connection.createStatement();
                 int set2;
            set2=st.executeUpdate(query);
            if( set2>0)
            {
                JOptionPane.showMessageDialog(this, "Succes");
            }else
            {
                JOptionPane.showMessageDialog(this, "No Success");
            }
            }
           
            
        } catch (SQLException e) {
            System.out.println("Message: "+ e.getMessage());
            System.out.println("SQLState: " +e.getSQLState());
            System.out.println("SQLState: " +e.getErrorCode());
            JOptionPane.showMessageDialog(this, "Something's Wrong");
            System.out.println(armit);
            
        }
         try {
            String checkbox = "";
            connection = ConnectionManager.getConnection();
            if (jCheckBox2.isSelected()){
                checkbox=jCheckBox2.getText();
                System.out.println(checkbox);
                 String query="INSERT INTO dilwsi(id_mathimatos,am,mathima)"
                         + "SELECT id_math,'"+armit+"','"+checkbox+"'"
                         + "FROM mathimata WHERE onoma_math = '"+checkbox+"'";
                 st=connection.createStatement();
                 int set2;
            set2=st.executeUpdate(query);
            if( set2>0)
            {
                JOptionPane.showMessageDialog(this, "Succes");
            }else
            {
                JOptionPane.showMessageDialog(this, "No Success");
            }
            }
           
            
        } catch (SQLException e) {
            System.out.println("Message: "+ e.getMessage());
            System.out.println("SQLState: " +e.getSQLState());
            System.out.println("SQLState: " +e.getErrorCode());
            JOptionPane.showMessageDialog(this, "Something's Wrong");
            
            
        }
          try {
            String checkbox = "";
            connection = ConnectionManager.getConnection();
            if (jCheckBox3.isSelected()){
                checkbox=jCheckBox3.getText();
                System.out.println(checkbox);
                 String query="INSERT INTO dilwsi(id_mathimatos,am,mathima)"
                         + "SELECT id_math,'"+armit+"','"+checkbox+"'"
                         + "FROM mathimata WHERE onoma_math = '"+checkbox+"'";
                 st=connection.createStatement();
                 int set2;
            set2=st.executeUpdate(query);
            if( set2>0)
            {
                JOptionPane.showMessageDialog(this, "Succes");
            }else
            {
                JOptionPane.showMessageDialog(this, "No Success");
            }
            }
           
            
        } catch (SQLException e) {
            System.out.println("Message: "+ e.getMessage());
            System.out.println("SQLState: " +e.getSQLState());
            System.out.println("SQLState: " +e.getErrorCode());
            JOptionPane.showMessageDialog(this, "Something's Wrong");
            System.out.println(armit);
            
        }
        
        
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
             
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void provoli_dilwsis_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provoli_dilwsis_buttonActionPerformed
        // TODO add your handling code here
        
        provoli_dilwsis pd = new provoli_dilwsis(armit);
            pd.setVisible(true);
            
    }//GEN-LAST:event_provoli_dilwsis_buttonActionPerformed

    private void provoli_dilwsis_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provoli_dilwsis_button1ActionPerformed
        // TODO add your handling code here:
        provoli_vathmologiwn pv = new provoli_vathmologiwn(armit);
        pv.setVisible(true);
    }//GEN-LAST:event_provoli_dilwsis_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(foititis_dilwsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(foititis_dilwsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(foititis_dilwsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(foititis_dilwsi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton provoli_dilwsis_button;
    private javax.swing.JButton provoli_dilwsis_button1;
    // End of variables declaration//GEN-END:variables
}
