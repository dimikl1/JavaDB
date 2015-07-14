
package Pack1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javafx.scene.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import javax.swing.JFrame;


public class MainPanel1 extends javax.swing.JFrame {
    String tmima2;
    String tmima3;
    String tmima;
    String tmima1;
    Connection con;
    Statement stm;
    ResultSet rs;
    Connection conn; 
    String dbURL = "jdbc:derby://localhost:1527/Students;;user=root;password=root";
    boolean firsttime;
    
    public MainPanel1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tFname1 = new javax.swing.JTextField();
        tLname1 = new javax.swing.JTextField();
        tAM1 = new javax.swing.JTextField();
        classCombo1 = new javax.swing.JComboBox();
        bClear1 = new javax.swing.JButton();
        bGo1 = new javax.swing.JButton();
        bExit1 = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(886, 780));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ΚΑΤΑΧΩΡΗΣΗ ΣΤΟΙΧΕΙΩΝ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("ΤΕΧΝΗΤΗ ΝΟΗΜΟΣΥΝΗ ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ΟΝΟΜΑ:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("ΕΠΙΘΕΤΟ:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("ΑΜ:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("TMHMA:");

        tFname1.setBackground(new java.awt.Color(255, 255, 204));

        tLname1.setBackground(new java.awt.Color(255, 255, 204));

        tAM1.setBackground(new java.awt.Color(255, 255, 204));

        classCombo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        classCombo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---- TMHMATA ----", "ΕΤ1 - (ΔΕΥΤΕΡΑ 2-4) - Ε8", "ΕΤ2 - (ΤΕΤΑΡΤΗ 5-7) - Α4", "ΕΤ3 - (ΠΑΡΑΣΚΕΥΗ 10-12) - Α4" }));
        classCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classCombo1ActionPerformed(evt);
            }
        });

        bClear1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bClear1.setText("CLEAR");
        bClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClear1ActionPerformed(evt);
            }
        });

        bGo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bGo1.setText("GO");
        bGo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGo1ActionPerformed(evt);
            }
        });

        bExit1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bExit1.setText("EXIT");
        bExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExit1ActionPerformed(evt);
            }
        });

        bBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bBack.setText("BACK");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pack1/images/hand1.jpg"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pack1/images/hand3.jpg"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pack1/images/prolog2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tAM1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tLname1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                                .addComponent(tFname1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(176, 176, 176)
                        .addComponent(jLabel10)
                        .addGap(52, 52, 52))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(bClear1)
                .addGap(150, 150, 150)
                .addComponent(bGo1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190)
                .addComponent(bBack, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1)))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tFname1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tLname1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(tAM1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(72, 72, 72)
                            .addComponent(classCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bClear1)
                    .addComponent(bGo1)
                    .addComponent(bBack, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bExit1))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClear1ActionPerformed
        tFname1.setText("");
        tLname1.setText("");
        tAM1.setText("");
    }//GEN-LAST:event_bClear1ActionPerformed

    private void bExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExit1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bExit1ActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        this.setVisible(false);
        new Inrto().setVisible(true);
    }//GEN-LAST:event_bBackActionPerformed

    private void bGo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGo1ActionPerformed
        String name = tFname1.getText();
        String last = tLname1.getText();
        Integer am = Integer.parseInt(tAM1.getText());
        
        if (tmima1.equals("1")) {
          try
               {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    con = DriverManager.getConnection("jdbc:derby://localhost:1527/Students", "root", "root");
                    stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                    Statement stm2 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                    String sql = "INSERT  INTO APP.AET1(Fname, Lname, AM) VALUES('"+name+"','"+last+"',"+am+")"; 
                    stm.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Η ΒΑΣΗ ΕΝΗΜΕΡΩΘΗΚΕ", "Complete!", 1);
                } 
          catch (ClassNotFoundException | SQLException e1) {
                   
                    e1.printStackTrace();
                }
        }else if(tmima1.equals("2")){
            try
               {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    con = DriverManager.getConnection("jdbc:derby://localhost:1527/Students", "root", "root");
                    stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                    Statement stm2 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                    String sql = "INSERT  INTO APP.AET2(Fname, Lname, AM) VALUES('"+name+"','"+last+"',"+am+")"; 
                    stm.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Η ΒΑΣΗ ΕΝΗΜΕΡΩΘΗΚΕ", "Complete!", 1);
                } 
          catch (ClassNotFoundException | SQLException e1) {
                   
                    e1.printStackTrace();
                }
            
        }else if(tmima1.equals("3")){
            try
               {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    con = DriverManager.getConnection("jdbc:derby://localhost:1527/Students", "root", "root");
                    stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                    Statement stm2 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
                    String sql = "INSERT  INTO APP.AET3(Fname, Lname, AM) VALUES('"+name+"','"+last+"',"+am+")"; 
                    stm.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Η ΒΑΣΗ ΕΝΗΜΕΡΩΘΗΚΕ", "Complete!", 1);
                } 
          catch (ClassNotFoundException | SQLException e1) {
                   
                    e1.printStackTrace();
                }
        
        }
    }                                   

    private void FirstCheckPropertyChange(java.beans.PropertyChangeEvent evt) {                                          
        
    }                                         

    private void FirstCheckActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
        
        
    }                                          

    private void classBoxActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        
        
                                           
    }//GEN-LAST:event_bGo1ActionPerformed

    private void classCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classCombo1ActionPerformed
        String tmima3 = classCombo1.getSelectedItem().toString();
        if (tmima3.equals("ΕΤ1 - (ΔΕΥΤΕΡΑ 2-4) - Ε8")){
            tmima1 = "1";
        }else if (tmima3.equals("ΕΤ2 - (ΤΕΤΑΡΤΗ 5-7) - Α4")){
            tmima1="2";
        }else if(tmima3.equals("ΕΤ3 - (ΠΑΡΑΣΚΕΥΗ 10-12) - Α4")){
            tmima1="3";
        }
        JOptionPane.showMessageDialog(null,""+tmima1);
    }//GEN-LAST:event_classCombo1ActionPerformed

    
   
    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(MainPanel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                //new MainPanel1().setVisible(true);
                displayPanel();
            }
            public void displayPanel(){
                JFrame mainPanel1 = new MainPanel1();
               
                mainPanel1.setLocationRelativeTo(null);
                mainPanel1.setResizable(false);
                mainPanel1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBack;
    private javax.swing.JButton bClear1;
    private javax.swing.JButton bExit1;
    private javax.swing.JButton bGo1;
    private javax.swing.JComboBox classCombo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tAM1;
    private javax.swing.JTextField tFname1;
    private javax.swing.JTextField tLname1;
    // End of variables declaration//GEN-END:variables
}
