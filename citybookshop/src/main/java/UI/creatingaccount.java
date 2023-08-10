package UI;

import db.Myconnector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class creatingaccount extends javax.swing.JFrame {

      Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public creatingaccount() {
        initComponents();
         con = Myconnector.getConnection();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        newusername = new javax.swing.JTextField();
        conformpassword = new javax.swing.JPasswordField();
        newpassword1 = new javax.swing.JPasswordField();
        conformpassword1 = new javax.swing.JLabel();
        conformpasword1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        conformpassword2 = new javax.swing.JPasswordField();
        newpassword2 = new javax.swing.JPasswordField();
        conformpassword3 = new javax.swing.JLabel();
        conformpasword2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        newusername3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        delete = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("New User Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 85, 110, 28));

        newusername.setBackground(new java.awt.Color(204, 204, 255));
        newusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newusernameActionPerformed(evt);
            }
        });
        jPanel2.add(newusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 84, 175, 30));

        conformpassword.setBackground(new java.awt.Color(204, 204, 255));
        conformpassword.setForeground(new java.awt.Color(0, 0, 0));
        conformpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conformpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(conformpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 192, 175, 30));

        newpassword1.setBackground(new java.awt.Color(204, 204, 255));
        newpassword1.setForeground(new java.awt.Color(0, 0, 0));
        newpassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassword1ActionPerformed(evt);
            }
        });
        jPanel2.add(newpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 141, 175, 30));

        conformpassword1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        conformpassword1.setForeground(new java.awt.Color(0, 0, 0));
        conformpassword1.setText("Conform Pasword");
        jPanel2.add(conformpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 120, 28));

        conformpasword1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        conformpasword1.setForeground(new java.awt.Color(0, 0, 0));
        conformpasword1.setText("New Password");
        jPanel2.add(conformpasword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 142, 110, 28));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Create cashier accounts");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 280, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("New User Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 276, 110, 28));

        conformpassword2.setBackground(new java.awt.Color(204, 204, 255));
        conformpassword2.setForeground(new java.awt.Color(0, 0, 0));
        conformpassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conformpassword2ActionPerformed(evt);
            }
        });
        jPanel2.add(conformpassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 383, 175, 30));

        newpassword2.setBackground(new java.awt.Color(204, 204, 255));
        newpassword2.setForeground(new java.awt.Color(0, 0, 0));
        newpassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpassword2ActionPerformed(evt);
            }
        });
        jPanel2.add(newpassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 332, 175, 30));

        conformpassword3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        conformpassword3.setForeground(new java.awt.Color(0, 0, 0));
        conformpassword3.setText("conform pasword");
        jPanel2.add(conformpassword3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 380, 120, 28));

        conformpasword2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        conformpasword2.setForeground(new java.awt.Color(0, 0, 0));
        conformpasword2.setText("New Password");
        jPanel2.add(conformpasword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 333, 100, 28));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Create Manager accounts");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 290, 30));

        newusername3.setBackground(new java.awt.Color(204, 204, 255));
        newusername3.setForeground(new java.awt.Color(0, 0, 0));
        newusername3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newusername3ActionPerformed(evt);
            }
        });
        jPanel2.add(newusername3, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 275, 175, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Cashier User Name");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, 150, 28));

        delete.setBackground(new java.awt.Color(204, 204, 255));
        delete.setForeground(new java.awt.Color(0, 0, 0));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 175, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Delete Cashier accounts");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 300, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Submit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Pictures\\ktc-opengraph-solutions-data-security-who-is-responsible-for-cyber-security.png")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-400, -40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newusernameActionPerformed

    private void conformpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conformpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conformpasswordActionPerformed

    private void newpassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassword1ActionPerformed

    private void conformpassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conformpassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conformpassword2ActionPerformed

    private void newpassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassword2ActionPerformed

    private void newusername3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newusername3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newusername3ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //back to main menue:
        new manger().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         // add and save new cashier details:
        
           if(newusername.getText().length()<=0||newpassword1.getText().length()<=0||conformpassword.getText().length()<=0){
            
             JOptionPane.showMessageDialog(null,"all data is Mandotory");
            
        }
          
          else{
          try{
            
            
            String conString = "jdbc:mysql://localhost:3306/citydb?serverTimezone=UTC";
            con = DriverManager.getConnection(conString,"root","");
            
            String query = "insert into logindatabase(username,password,Confirmpassword)values (?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
        
            pst.setString(1,newusername.getText());
            pst.setString(2,newpassword1.getText());
             pst.setString(3,conformpassword.getText());
           

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully submitted");
        
        }catch (Exception e){
            
             JOptionPane.showMessageDialog(null,e);

           
        }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // manager details submit button:
        if(newusername3.getText().length()<=0||newpassword2.getText().length()<=0||conformpassword2.getText().length()<=0){
            
             JOptionPane.showMessageDialog(null,"all data is Mandotory");
            
        }
          
          else{
          try{
            
            
            String conString = "jdbc:mysql://localhost:3306/citydb?serverTimezone=UTC";
            con = DriverManager.getConnection(conString,"root","");
            
            String query = "insert into logindatabase2(username,password,Confirmpassword)values (?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
        
            pst.setString(1,newusername3.getText());
            pst.setString(2,newpassword2.getText());
             pst.setString(3,conformpassword2.getText());
           
           
        
            
        
        
         
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully submitted");
        
        }catch (Exception e){
            
             JOptionPane.showMessageDialog(null,e);
        
 
           
        }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      //delete data
 
               if(delete.getText().length()<=0){
               JOptionPane.showMessageDialog(this, "Enter the username first to delete the respective cashier record ");
               }else{
              int response =  JOptionPane.showConfirmDialog(null," Are You Sure to Delete?","Delete ",JOptionPane.YES_NO_OPTION);
              if(response==0)  
               
            try {
            
           
            String id = delete.getText();
            String conString = "jdbc:mysql://localhost:3306/citydb?serverTimezone=UTC";
            con = DriverManager.getConnection(conString,"root","");
            String query1="Delete FROM logindatabase where username =? ";
            PreparedStatement pst= con.prepareStatement(query1);
            
           pst.setString(1, id);
           pst.executeUpdate();
         
         
              
     
       
         JOptionPane.showMessageDialog(this, "Deleted Successfully");
         
            
            
        } catch (SQLException e) {
       //    Logger.getLogger(.class.getName()).log(Level.SEVERE,null,e);
        }
          
              }

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(creatingaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(creatingaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(creatingaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(creatingaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new creatingaccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField conformpassword;
    private javax.swing.JLabel conformpassword1;
    private javax.swing.JPasswordField conformpassword2;
    private javax.swing.JLabel conformpassword3;
    private javax.swing.JLabel conformpasword1;
    private javax.swing.JLabel conformpasword2;
    private javax.swing.JTextField delete;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField newpassword1;
    private javax.swing.JPasswordField newpassword2;
    private javax.swing.JTextField newusername;
    private javax.swing.JTextField newusername3;
    // End of variables declaration//GEN-END:variables
}
