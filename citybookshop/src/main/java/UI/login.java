
package UI;


import db.Myconnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        con = Myconnector.getConnection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        submitB = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        jLabel6.setText("jLabel6");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Pictures\\pngwing.com.png")); // NOI18N
        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 51, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\user namr.PNG")); // NOI18N
        jLabel1.setText("username");
        jLabel1.setMaximumSize(new java.awt.Dimension(1405, 1349));
        jLabel1.setMinimumSize(new java.awt.Dimension(1405, 1349));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 120, -1));

        username.setBackground(java.awt.SystemColor.scrollbar);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, 210, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\pasword.PNG")); // NOI18N
        jLabel2.setText(" password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 130, -1));

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 210, 30));

        submitB.setBackground(new java.awt.Color(255, 102, 51));
        submitB.setForeground(new java.awt.Color(0, 0, 0));
        submitB.setText("LOGIN");
        submitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBActionPerformed(evt);
            }
        });
        getContentPane().add(submitB, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 220, 20));

        jButton1.setText("Dear customer please click here to search your book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 430, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Desktop\\logo2.PNG")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 200, 160));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Pictures\\2-Higher-Ed (4).png")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBActionPerformed

   // login code here
 
        String uname = username.getText();
        String pass = String.valueOf(password.getPassword());
 
        if(username.getText().length()<=0||password.getText().length()<=0){
            JOptionPane.showMessageDialog(this, "Please Enter the Username & Password First","Warning",JOptionPane.WARNING_MESSAGE);
 
        }else{
            try{
 
                String  sql = ("SELECT * FROM logindatabase WHERE username=?  AND  password=?  ");//tablename
                pst = con.prepareCall(sql);
 
                pst.setString(1, uname); //user name
                pst.setString(2, pass); // password
 
                rs=pst.executeQuery();
 
                if (rs.next()){   // its true do this
 
                    JOptionPane.showMessageDialog(rootPane, "<html><b style = \" font-size:12px;\">You're Logged in as Cashier...</b></html>");
 
                    new manger().setVisible(true);
                    this.setVisible(false);
 
                }else {
                    String  sql1 = ("SELECT * FROM logindatabase2 WHERE username=?  AND  password=?  ");//tablename
                    pst = con.prepareCall(sql1);
 
                    pst.setString(1, uname); //user name
                    pst.setString(2, pass); // password
 
                    rs=pst.executeQuery();
 
                    if (rs.next()){
 
                        JOptionPane.showMessageDialog(rootPane, "<html><b style = \" font-size:12px;\">You're Logged in as Manager...</b></html>");
 
                        new manger().setVisible(true);
                        this.setVisible(false);
 
                    }else{
                        JOptionPane.showMessageDialog(this,"<html><b style = \"color :red; font-size:12px;\"> Incorrect Username or Password</b></html>","",JOptionPane.ERROR_MESSAGE);
 
                    }
                }
 
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,e);
 
            }
        }


        
    }//GEN-LAST:event_submitBActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_usernameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //direct way to search books
         new cmsearch().setVisible(true);
                    this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton submitB;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
