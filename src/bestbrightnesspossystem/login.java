/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bestbrightnesspossystem;
import java.awt.HeadlessException;
import java.util.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class login extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
   
    public login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jUser = new javax.swing.JComboBox<>();
        txtUser_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPassword = new javax.swing.JTextField();
<<<<<<< HEAD

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
=======
        cbPassword = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
>>>>>>> 3d1a802c916ddd5b691ed23ad84556f699b565d5
        jPanel1.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 230, 70, 16);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtName);
        txtName.setBounds(70, 250, 260, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 290, 60, 16);

        btnLogin.setBackground(new java.awt.Color(0, 255, 51));
        btnLogin.setText("sign in");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin);
<<<<<<< HEAD
        btnLogin.setBounds(70, 420, 260, 30);
=======
        btnLogin.setBounds(70, 450, 260, 30);
>>>>>>> 3d1a802c916ddd5b691ed23ad84556f699b565d5

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/best_brightness_logo_50px.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(190, 40, 50, 50);

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Welcome Back");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(150, 100, 160, 16);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/images__3_-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 360, 266, 230);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("sign in to your account");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(160, 130, 140, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
<<<<<<< HEAD
        jLabel8.setText("------------Accounts--------------");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 350, 210, 16);

        jUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Manager", "Cashier" }));
        jPanel1.add(jUser);
        jUser.setBounds(70, 380, 260, 22);
        jPanel1.add(txtUser_id);
        txtUser_id.setBounds(70, 192, 260, 30);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
=======
        jLabel8.setText("============Accounts=============");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(70, 380, 260, 20);

        jUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Manager", "Cashier" }));
        jPanel1.add(jUser);
        jUser.setBounds(70, 410, 260, 30);
        jPanel1.add(txtUser_id);
        txtUser_id.setBounds(70, 192, 260, 30);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
>>>>>>> 3d1a802c916ddd5b691ed23ad84556f699b565d5
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Staff ID");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 170, 60, 16);
        jPanel1.add(jPassword);
        jPassword.setBounds(70, 310, 260, 30);

<<<<<<< HEAD
=======
        cbPassword.setForeground(new java.awt.Color(255, 255, 255));
        cbPassword.setText("Show Password");
        cbPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(cbPassword);
        cbPassword.setBounds(220, 350, 110, 20);

>>>>>>> 3d1a802c916ddd5b691ed23ad84556f699b565d5
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
=======
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
>>>>>>> 3d1a802c916ddd5b691ed23ad84556f699b565d5
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
         try {
            String query = "select * from users where user_id=? and Username=? and Password =? and user=?";
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bestbrightpos", "root", "@25Roots");
            pst = con.prepareStatement(query);
            pst.setString(1, txtUser_id.getText());
            pst.setString(2, txtName.getText());
            pst.setString(3, jPassword.getText());
            pst.setString(4, String.valueOf(jUser.getSelectedItem()));
            rs = (ResultSet) pst.executeQuery();
 
            if (rs.next()) {
<<<<<<< HEAD
           JOptionPane.showMessageDialog(this, "user_id and Password matched and you succesfully loged in as " + rs.getString("user"));
=======
           JOptionPane.showMessageDialog(this, "user_id and Password matched and /n you succesfully loged in as " + rs.getString("user"));
>>>>>>> 3d1a802c916ddd5b691ed23ad84556f699b565d5

           int roleIndex = jUser.getSelectedIndex();
           this.setVisible(false);

           loading loadingScreen = new loading(() -> {
          if (roleIndex == 0) {
            staffmanageraccount sma = new staffmanageraccount();
            sma.setVisible(true);
          } else if (roleIndex == 1) {
            salesOverview so = new salesOverview();
            so.setVisible(true);
         } else if (roleIndex == 2) {
            Home H = new Home();
            H.setVisible(true);
         }
        login.this.dispose();
    });
    loadingScreen.setVisible(true);

} else {
                JOptionPane.showMessageDialog(this, "unsuccesful!! please check your deatails are correct");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

<<<<<<< HEAD
=======
    private void cbPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPasswordActionPerformed
        // TODO add your handling code here:
        
       /* if(cbPassword.isSelected()){
            jPassword.setEchoChar((char)0);
        }else{
            jPassword.setEchoChar("*");
        }*/
    }//GEN-LAST:event_cbPasswordActionPerformed

>>>>>>> 3d1a802c916ddd5b691ed23ad84556f699b565d5
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
    private javax.swing.JButton btnLogin;
<<<<<<< HEAD
=======
    private javax.swing.JCheckBox cbPassword;
>>>>>>> 3d1a802c916ddd5b691ed23ad84556f699b565d5
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPassword;
    private javax.swing.JComboBox<String> jUser;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUser_id;
    // End of variables declaration//GEN-END:variables
}
