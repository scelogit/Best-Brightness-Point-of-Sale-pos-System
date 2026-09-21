/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bestbrightnesspossystem;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.HeadlessException;
import java.util.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;


public class staffmanageraccount extends javax.swing.JFrame {

    
    public staffmanageraccount() {
        initComponents();
        setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        txtRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Cashier", " " }));
        pack();
        table_update();
        btnRemove.addActionListener(this::btnRemoveActionPerformed);
        btnSave.addActionListener(this::btnSaveActionPerformed);
        btnSearch.addActionListener(this::btnSearchActionPerformed);
        workersTable.getSelectionModel().addListSelectionListener(this::workersTableRowSelected);
    }
      Connection con1;
    PreparedStatement pst;

    @SuppressWarnings("unchecked")
     private void table_update(){
        
        try {
            
            int cc;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
              
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/bestbrightpos", "root", "@25Roots");
                
                pst= con1.prepareStatement("select * from users");
                ResultSet rs = pst.executeQuery();
                
                ResultSetMetaData rsd = (ResultSetMetaData) rs.getMetaData();
                
                cc = rsd.getColumnCount();
                
                DefaultTableModel d =(DefaultTableModel)workersTable.getModel();
                d.setRowCount(0);
                
                while(rs.next()){
                    Vector v2 =new Vector();
                    
                    for(int i=1;i<=cc;i++){
                        v2.add(rs.getString("user_id"));
                        v2.add(rs.getString("username"));
                        v2.add(rs.getString("password"));
                        v2.add(rs.getString("user"));
                    }
                     d.addRow(v2);
                }
    
            } catch (ClassNotFoundException ex) {
                System.getLogger(processSales.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
             
        } catch (SQLException ex) {
            System.getLogger(processSales.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }      
    }
     
     private void workersTableRowSelected(javax.swing.event.ListSelectionEvent evt) {
    if (evt.getValueIsAdjusting()) return;
    int row = workersTable.getSelectedRow();
    if (row == -1) return;

    txtUser_id.setText(workersTable.getValueAt(row, 0).toString());
    txtUsername.setText(workersTable.getValueAt(row, 1).toString());
    txtPassword.setText(workersTable.getValueAt(row, 2).toString());
    txtRole.setSelectedItem(workersTable.getValueAt(row, 3).toString());
}
     
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnProcessSale = new javax.swing.JButton();
        btnProductMng = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workersTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        txtUser_id = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtRole = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/adminPP_50px.jpg"))); // NOI18N

        btnProcessSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/sales.png"))); // NOI18N
        btnProcessSale.setText("Process Sale");
        btnProcessSale.addActionListener(this::btnProcessSaleActionPerformed);

        btnProductMng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/delivery.png"))); // NOI18N
        btnProductMng.setText("Product Management");
        btnProductMng.addActionListener(this::btnProductMngActionPerformed);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/delivery.png"))); // NOI18N
        jButton6.setText("Stock");

        btnReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/delivery.png"))); // NOI18N
        btnReports.setText("Reports");
        btnReports.addActionListener(this::btnReportsActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnProcessSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProductMng, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(82, 82, 82)
                .addComponent(btnProcessSale, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnProductMng, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReports, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        workersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Staff id", "username", "Password", "Staff Role"
            }
        ));
        jScrollPane1.setViewportView(workersTable);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Manage Workers");

        btnSearch.setBackground(new java.awt.Color(255, 204, 204));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/search-interface-symbol.png"))); // NOI18N
        btnSearch.addActionListener(this::btnSearchActionPerformed);

        btnAdd.setBackground(new java.awt.Color(0, 0, 51));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add worker");
        btnAdd.addActionListener(this::btnAddActionPerformed);

        btnRemove.setBackground(new java.awt.Color(255, 204, 0));
        btnRemove.setText("Remove worker");
        btnRemove.addActionListener(this::btnRemoveActionPerformed);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("StaffID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Staff Role");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Password");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Username");

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/refresh.png"))); // NOI18N
        btnRefresh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnRefresh.addActionListener(this::btnRefreshActionPerformed);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/floppy-disk.png"))); // NOI18N
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnSave.addActionListener(this::btnSaveActionPerformed);

        txtRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Cashier", " " }));
        txtRole.setActionCommand("Admin\nManager\nCachier");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSearch))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(122, 122, 122)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(64, 64, 64)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(txtUser_id, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(58, 58, 58))
                                        .addComponent(txtRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAdd)
                            .addGap(18, 18, 18)
                            .addComponent(btnRemove)))
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUser_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessSaleActionPerformed
        // TODO add your handling code here:
        Home h = new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProcessSaleActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String staffID = txtUser_id.getText();
        String username=txtUsername.getText();
        String password = txtPassword.getText();
        Object selectedRole = txtRole.getSelectedItem();
        String role = (selectedRole == null) ? "" : selectedRole.toString();
        
        if (staffID.isEmpty() || username.isEmpty() || password.isEmpty() || role.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields before adding a worker.");
        return;
         }
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/bestbrightpos", "root", "@25Roots");
            pst = con1.prepareStatement("insert into users values(?,?,?,?) ");
            
            pst.setString(1, staffID);
            pst.setString(2, username);
            pst.setString(3, password);
            pst.setString(4, role);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Employee Has Successfuly Added! ");
            
            txtUser_id.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
            txtRole.setSelectedIndex(-1);
            
            table_update();
            txtUser_id.requestFocus();
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"ensure that you put all the details"+ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
      
        table_update();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
         String staffID = txtUser_id.getText();
         String username = txtUsername.getText();
         String password = txtPassword.getText();
         Object selectedRole = txtRole.getSelectedItem();
         String role = (selectedRole == null) ? "" : selectedRole.toString().trim();
    
         
         
        if (staffID.isEmpty())
        {
        } else {
            JOptionPane.showMessageDialog(this, "Please select a worker from the table first.");
            return;
        }

         try 
          {
             con1 = DriverManager.getConnection("jdbc:mysql://localhost/bestbrightpos", "root", "@25Roots");
             pst = con1.prepareStatement("update users set username = ?, password = ?, user = ? where user_id = ?");
             pst.setString(1, username);
             pst.setString(2, password);
             pst.setString(3, role);
             pst.setString(4, staffID);
             pst.executeUpdate();
             JOptionPane.showMessageDialog(this, "Worker updated successfully.");
             table_update();
             
        } catch (Exception ex) 
        {
          JOptionPane.showMessageDialog(this, "Error updating worker: " + ex.getMessage());
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
         int row = workersTable.getSelectedRow();
         if (row == -1)
         {
             JOptionPane.showMessageDialog(this, "Please select a worker from the table first.");
             return;
         }
            String staffID = workersTable.getValueAt(row, 0).toString();
            String role = workersTable.getValueAt(row, 3).toString();
             if (role.equalsIgnoreCase("Admin")) {
        JOptionPane.showMessageDialog(this, "Admin accounts cannot be removed.");
        return;
        
        
    }
          int confirm = JOptionPane.showConfirmDialog(this,
          "Remove staff ID " + staffID + "?", "Confirm Remove",
          JOptionPane.YES_NO_OPTION);
          
          if (confirm != JOptionPane.YES_OPTION) return;

         try
         {
             con1 = DriverManager.getConnection("jdbc:mysql://localhost/bestbrightpos", "root", "@25Roots");
             pst = con1.prepareStatement("delete from users where user_id = ?");
             pst.setString(1, staffID);
             pst.executeUpdate();
             
            JOptionPane.showMessageDialog(this, "Worker removed successfully.");
             table_update();
             txtUser_id.setText("");
             txtUsername.setText("");
             txtPassword.setText("");
             
         } 
         catch (Exception ex) 
         {
              JOptionPane.showMessageDialog(this, "Error removing worker: " + ex.getMessage());
         }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
         String keyword = txtSearch.getText().trim();

    if (keyword.isEmpty()) {
        table_update();
        return;
    }

    try {
        con1 = DriverManager.getConnection("jdbc:mysql://localhost/bestbrightpos", "root", "@25Roots");
        pst = con1.prepareStatement("select * from users where user_id like ? or username like ?");
        pst.setString(1, "%" + keyword + "%");
        pst.setString(2, "%" + keyword + "%");
        ResultSet rs = pst.executeQuery();

        DefaultTableModel d = (DefaultTableModel) workersTable.getModel();
        d.setRowCount(0);

        while (rs.next()) {
            Vector v2 = new Vector();
            v2.add(rs.getString("user_id"));
            v2.add(rs.getString("username"));
            v2.add(rs.getString("password"));
            v2.add(rs.getString("user"));
            d.addRow(v2);
        }
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error searching: " + ex.getMessage());
    }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnProductMngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductMngActionPerformed
        // TODO add your handling code here:
        processSales p = new processSales();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProductMngActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        // TODO add your handling code here:
        salesOverview s = new salesOverview();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReportsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnProcessSale;
    private javax.swing.JButton btnProductMng;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JComboBox<String> txtRole;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUser_id;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTable workersTable;
    // End of variables declaration//GEN-END:variables
}
