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
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;


public class Home extends javax.swing.JFrame {
    double totalDueAmount = 0;
    double total = 0;
    double discount = 0;
    
    public Home() {
        initComponents();
    }
    
    private void calculateSubtotal() {

    double subtotalAmount = 0;

    DefaultTableModel d =
            (DefaultTableModel) processSaleTable.getModel();

    for (int i = 0; i < d.getRowCount(); i++) 
    {
        double price = Double.parseDouble(d.getValueAt(i, 2).toString());
        int quantity =  Integer.parseInt(d.getValueAt(i, 3).toString());
        double total = price * quantity;
        subtotalAmount = subtotalAmount + total;
    }
            subtotal.setText( "R" + String.format("%.2f", subtotalAmount)
    );
}
    
    private void calculateTotalDue() {

    double total = 0;
    double discount = 0;

    DefaultTableModel d = (DefaultTableModel) processSaleTable.getModel();

    for (int i = 0; i < d.getRowCount(); i++) 
    {

        double price = Double.parseDouble(d.getValueAt(i, 2).toString());
        int quantity = Integer.parseInt(d.getValueAt(i, 3).toString());
         total = total + (price * quantity);
    }

    if (total >= 500)
    {
        discount = total * 0.10;
    }
    
    Discountlbl.setText("R"+ String.format("%.2f", discount));
    totalDueAmount = total - discount;
    totalDue.setText("R" + String.format("%.2f", totalDueAmount)
    );
}
  @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnSignOut = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnProductManagement = new javax.swing.JButton();
        btnProdutc = new javax.swing.JButton();
        btnViewSales = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        addtocart = new javax.swing.JToggleButton();
        txtSearch = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        subtotal = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Discountlbl = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        totalDue = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        btnCash = new javax.swing.JButton();
        btnCard = new javax.swing.JButton();
        btnEwallet = new javax.swing.JButton();
        btnVoucher = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        Ternderd = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        change = new javax.swing.JLabel();
        completeSale = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        processSaleTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menu");

        btnSignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/log-out.png"))); // NOI18N
        btnSignOut.setText("Sign out");
        btnSignOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOutActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/best_brightness_logo_50px.png"))); // NOI18N

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));

        btnProductManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/delivery.png"))); // NOI18N
        btnProductManagement.setText("Product Management");
        btnProductManagement.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProductManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductManagementActionPerformed(evt);
            }
        });

        btnProdutc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/viewing.png"))); // NOI18N
        btnProdutc.setText("Manage Staff");
        btnProdutc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProdutc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutcActionPerformed(evt);
            }
        });

        btnViewSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/viewing.png"))); // NOI18N
        btnViewSales.setText("view sales");
        btnViewSales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSalesActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/user.png"))); // NOI18N
        jLabel9.setText("Thabo M");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("10:21 AM");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Best Brightness POS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(193, 193, 193)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        addtocart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/barcode-scan.png"))); // NOI18N
        addtocart.setText("add");
        addtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartActionPerformed(evt);
            }
        });

        txtSearch.setText("scan barcode or type barcode");
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
        });

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/search-interface-symbol.png"))); // NOI18N
        jToggleButton2.setText("Look up");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/user (1).png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Walk-in customer");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/search-interface-symbol.png"))); // NOI18N
        jButton1.setText("Find");

        jLabel11.setForeground(new java.awt.Color(0, 255, 51));
        jLabel11.setText("No loyalty card ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(addtocart)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(96, 96, 96))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addtocart, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(3, 3, 3))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Subtotal");

        jLabel13.setText("VAT (15%)");

        jLabel14.setText("DISCOUNT");

        subtotal.setText("R0.00");

        jLabel16.setText("R0.00");

        Discountlbl.setForeground(new java.awt.Color(0, 255, 51));
        Discountlbl.setText("-R0.00");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Total due");

        totalDue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalDue.setForeground(new java.awt.Color(0, 0, 255));
        totalDue.setText("R0.00");

        jTextField2.setText("vouche/promo code");

        jButton18.setText("Apply");

        btnCash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/money.png"))); // NOI18N
        btnCash.setText("Cash");

        btnCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/credit-card.png"))); // NOI18N
        btnCard.setText("Card/tap");
        btnCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCardActionPerformed(evt);
            }
        });

        btnEwallet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/wallet.png"))); // NOI18N
        btnEwallet.setText("eWallet");

        btnVoucher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/coupon.png"))); // NOI18N
        btnVoucher.setText("Voucher");

        jLabel20.setText("Ternderd:");

        Ternderd.setText("R0,00");
        Ternderd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TernderdFocusGained(evt);
            }
        });

        jLabel21.setText("Change:");

        change.setText("R0,00");

        completeSale.setText("Complete sale - R0.00");
        completeSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeSaleActionPerformed(evt);
            }
        });

        jButton24.setText("Void Transection");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Discountlbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton18))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Ternderd))
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCash, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEwallet, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnVoucher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(change, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 15, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(completeSale, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                    .addComponent(jButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(15, 15, 15)))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalDue, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(subtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Discountlbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(totalDue))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCash, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCard, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEwallet, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(Ternderd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(change))
                .addGap(18, 18, 18)
                .addComponent(completeSale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton24)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        processSaleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Iterm id", "Product Name", "Unit price", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(processSaleTable);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/barcodes.png"))); // NOI18N

        jLabel4.setText("Scan or Enter barcode to add item");

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/delete.png"))); // NOI18N
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 203, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 7, Short.MAX_VALUE)
                    .addComponent(jSeparator2)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnProdutc, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(125, 125, 125))
                            .addComponent(btnProductManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewSales, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel7)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(59, 59, 59)
                        .addComponent(btnProductManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnProdutc, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewSales, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    Connection con;
    PreparedStatement pst;
    
    
    private void btnProductManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductManagementActionPerformed
        // TODO add your handling code here:
        processSales p = new processSales();
        p.setVisible(true);
        this.hide();

    }//GEN-LAST:event_btnProductManagementActionPerformed

    private void btnProdutcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutcActionPerformed
        // TODO add your handling code here:
        staffmanageraccount sma = new staffmanageraccount();
        sma.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnProdutcActionPerformed

    private void btnViewSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSalesActionPerformed
        // TODO add your handling code here:
        salesOverview s = new salesOverview();
        s.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnViewSalesActionPerformed

    private void btnSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOutActionPerformed
        // TODO add your handling code here:
        login L = new login();
        L.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnSignOutActionPerformed

    private void btnCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCardActionPerformed

    }//GEN-LAST:event_btnCardActionPerformed

    private void addtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartActionPerformed
        // TODO add your handling code here:
         String product = txtSearch.getText().trim();

    if (product.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a product ID or product name.");
        return;
    }

    try {

        con = DriverManager.getConnection(
            "jdbc:mysql://localhost/bestbrightpos",
            "root",
            "@25Roots"
        );

        pst = con.prepareStatement(
            "SELECT * FROM product WHERE product_id = ? OR product_name LIKE ? LIMIT 1"
        );

        pst.setString(1, product);
        pst.setString(2, "%" + product + "%");

        ResultSet rs = pst.executeQuery();

        DefaultTableModel d =
                (DefaultTableModel) processSaleTable.getModel();

        if (rs.next()) {

    String productID = rs.getString("product_id");
    String productName = rs.getString("product_Name");
    double price = rs.getDouble("price");
    int quantity = 1;

    // Create Product object
    Product p = new Product(Integer.parseInt(productID),
        productName,
        price,
        quantity
    );

    // Put Product object into the array
    Cartdata.cart[Cartdata.count] = p;
    Cartdata.count++;

    // Add product to JTable
    Vector v2 = new Vector();

    v2.add(productID);
    v2.add(productName);
    v2.add(price);
    v2.add(quantity);

    d.addRow(v2);
   
     calculateTotalDue();
     calculateSubtotal();

    txtSearch.setText("Please enter a product ID or product name");
 }
        else {

            JOptionPane.showMessageDialog(
                this,
                "Product not found."
            );
        }

    } catch (Exception ex) {

        JOptionPane.showMessageDialog(
            this,
            ex.getMessage()
        );
    }
        
    }//GEN-LAST:event_addtocartActionPerformed

    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        // TODO add your handling code here:
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchFocusGained

    private void TernderdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TernderdFocusGained
        // TODO add your handling code here:
        Ternderd.setText("");
    }//GEN-LAST:event_TernderdFocusGained

    private void completeSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeSaleActionPerformed
        // TODO add your handling code here:
        
        try{
        double pay =Double.parseDouble(Ternderd.getText()); 
        
          // Check if customer gave enough money
        if (pay < totalDueAmount) {
            JOptionPane.showMessageDialog(this,
                    "Insufficient amount.");
            return;
        }
        
        
        double amount=0;
         amount= pay - totalDueAmount;
         DefaultTableModel d =(DefaultTableModel) processSaleTable.getModel();
         
         for (int i = 0; i < d.getRowCount(); i++) {

            double price = Double.parseDouble(d.getValueAt(i, 2).toString());
            int quantity = Integer.parseInt(d.getValueAt(i, 3).toString());
            total = total + (price * quantity);
        }
         
          // 10% discount if total is R500 or more
        if (total >= 500) {
            discount = total * 0.10;
        }
        
         // Connect to database
        con = DriverManager.getConnection(
                "jdbc:mysql://localhost/bestbrightpos",
                "root",
                "@25Roots"
        );

        // Save the sale
        pst = con.prepareStatement(
                "INSERT INTO sales (discount, total, final_total, sale_date) "
                + "VALUES (?, ?, ?, NOW())",
                Statement.RETURN_GENERATED_KEYS
        );
         
         pst.setDouble(1, discount);
         pst.setDouble(2, total);
         pst.setDouble(3, totalDueAmount);
         pst.executeUpdate();
         
         // Get the sale ID that was just created
         ResultSet rs = pst.getGeneratedKeys();
         
        int saleID = 0;

        if (rs.next()) {
            saleID = rs.getInt(1);
        }
         
        // Save every product from the table
        for (int i = 0; i < d.getRowCount(); i++) {

            int productID = Integer.parseInt(d.getValueAt(i, 0).toString());

            int quantity = Integer.parseInt(d.getValueAt(i, 3).toString());

            double price = Double.parseDouble(d.getValueAt(i, 2).toString());

            double itemSubtotal = price * quantity;

            pst = con.prepareStatement(
                    "INSERT INTO sale_items "
                    + "(sale_id, product_id, quantity, subtotal) "
                    + "VALUES (?, ?, ?, ?)"
            );

            pst.setInt(1, saleID);
            pst.setInt(2, productID);
            pst.setInt(3, quantity);
            pst.setDouble(4, itemSubtotal);

            pst.executeUpdate();
        }

        // Show receipt information
        change.setText(
                "R" + String.format("%.2f", amount)
        );
        
        
        
        
        
         
         JOptionPane.showMessageDialog(this,
         "Tendered: R" + pay +
         "\nTotal Due: R" + totalDueAmount +
         "\nChange: R" + amount);       
         change.setText("R"+String.format("%.2f", amount));
         
         
         d.setRowCount(0);

        // Reset the amounts
        subtotal.setText("R0.00");
        Discountlbl.setText("R0.00");
        totalDue.setText("R0.00");
        change.setText("R0.00");

        Ternderd.setText("0.00");
         // Close connection
        con.close(); 
         
         
        }
         catch(Exception ex)
        {
               JOptionPane.showMessageDialog(this,
                ex.getMessage());
        }
    }//GEN-LAST:event_completeSaleActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
         int row = processSaleTable.getSelectedRow();
         if (row == -1)
         {
         JOptionPane.showMessageDialog(this, "Please select a product from the table first.");
         return;
         }
         
          DefaultTableModel d = (DefaultTableModel) processSaleTable.getModel();
          d.removeRow(row);    
    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Discountlbl;
    private javax.swing.JTextField Ternderd;
    private javax.swing.JToggleButton addtocart;
    private javax.swing.JButton btnCard;
    private javax.swing.JButton btnCash;
    private javax.swing.JButton btnEwallet;
    private javax.swing.JButton btnProductManagement;
    private javax.swing.JButton btnProdutc;
    private javax.swing.JButton btnSignOut;
    private javax.swing.JButton btnViewSales;
    private javax.swing.JButton btnVoucher;
    private javax.swing.JLabel change;
    private javax.swing.JButton completeSale;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton24;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTable processSaleTable;
    private javax.swing.JLabel subtotal;
    private javax.swing.JLabel totalDue;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
