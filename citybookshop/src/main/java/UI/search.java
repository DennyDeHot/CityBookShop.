package UI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class search extends javax.swing.JFrame {
 Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    DefaultTableModel model= null;
    public search() {
        initComponents();
         setRecordsToTable();

         
    }
      public void  setRecordsToTable(){
    
        try {
        String conString = "jdbc:mysql://localhost:3306/citydb?serverTimezone=UTC";
            con = DriverManager.getConnection(conString,"root","");
            String query1="SELECT * FROM insert_books";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            
            while(rs.next()){
             String bookname=  rs.getString("Book_name");
             String author= rs.getString("Author");
             String pages= rs.getString("Pages");
             String price= rs.getString("Price");
             String type= rs.getString("Type");
             
          Object[] obj = {bookname,author,pages,price,type};
            
            model = (DefaultTableModel)booklist.getModel();
             model.addRow(obj);
            }
          
        }
        
         
     catch (Exception e){
         e.printStackTrace();
     
     }
      }
      public void search (String str){
          model = (DefaultTableModel)booklist.getModel();
          TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
          booklist.setRowSorter(trs);
          trs.setRowFilter(RowFilter.regexFilter(str));
}


Bookviwe jtRowdata = new Bookviwe();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        searchbook = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        booklist = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("Wecome to City Bookshop Search ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, 38));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 255));
        jLabel2.setText("Search book details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 136, -1));

        jButton1.setText("view");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 190, -1, -1));

        searchbook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchbookKeyReleased(evt);
            }
        });
        getContentPane().add(searchbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 388, -1));

        booklist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Author", "Pages", "Price", "Type"
            }
        ));
        jScrollPane1.setViewportView(booklist);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 780, 100));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 19, -1, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 130, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\OneDrive\\Pictures\\960x0.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -230, 910, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // view
        
        if(booklist.getSelectedRowCount()==1){ 
        int index = booklist.getSelectedRow();
          TableModel model =booklist.getModel();
           String bookname = model.getValueAt(index,0).toString();
           String author = model.getValueAt(index,1).toString();
           String pages = model.getValueAt(index,2).toString();
           String price = model.getValueAt(index,3).toString();
            String type = model.getValueAt(index,4).toString();
           
           
    
           
           jtRowdata.setVisible(true);
           jtRowdata.pack();
           jtRowdata.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           
           jtRowdata.Bookname.setText(bookname);
           jtRowdata.Author2.setText(author);
           jtRowdata.pages.setText(pages);
           jtRowdata.price.setText(price);
           jtRowdata.type.setText(type);
            
         }else
               
         JOptionPane.showMessageDialog(this,"Select the Row which you want to view" );
                 
    }                                        
 
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // refresh:
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //back to main menue:
        new manger().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchbookKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchbookKeyReleased
        //search key:
         
String searchString = searchbook.getText();
        search (searchString);

    }//GEN-LAST:event_searchbookKeyReleased

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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable booklist;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchbook;
    // End of variables declaration//GEN-END:variables
}
