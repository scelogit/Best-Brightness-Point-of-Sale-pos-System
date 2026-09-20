/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bestbrightnesspossystem;
import java.sql.Statement;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.text.NumberFormat;
import java.util.Locale;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class salesOverview extends javax.swing.JFrame {


    
    public salesOverview() {
  
        initComponents();
        loadDashboard();

    }
    Connection con1;
    PreparedStatement pst;
    ResultSet rs = null;

   
  
    private void loadDashboard(){
    try {
             con1 = DriverManager.getConnection(
            "jdbc:mysql://localhost/bestbrightpos", "root", "@25Roots"
        );

        // --- Today's sales, transactions, items sold ---
        PreparedStatement pst = con1.prepareStatement(
            "SELECT COALESCE(SUM(Final_total),0) AS total, COUNT(*) AS cnt FROM sales WHERE DATE(Sale_Date) = CURDATE()"
        );
        ResultSet rs1 = pst.executeQuery();
        if (rs1.next()) {
            TotaSale.setText("R " + String.format("%,.2f", rs1.getDouble("total")));
            Transection.setText(String.valueOf(rs1.getInt("cnt")));
        }

        PreparedStatement pst2 = con1.prepareStatement(
            "SELECT COALESCE(SUM(si.quantity),0) AS items FROM sale_items si " +
            "JOIN sales s ON si.Sale_id = s.Sale_id WHERE DATE(s.Sale_Date) = CURDATE()"
        );
        ResultSet rs2 = pst2.executeQuery();
        if (rs2.next()) {
            itemSold.setText(String.valueOf(rs2.getInt("items")));
        }

        // --- Top sellers ---
        JTextArea topSellersArea = new JTextArea();
        topSellersArea.setEditable(false);
        topSellersArea.setFont(jLabel8.getFont().deriveFont(java.awt.Font.PLAIN, 13f));

        PreparedStatement pst3 = con1.prepareStatement(
            "SELECT p.product_Name, SUM(si.quantity) AS total_sold FROM sale_items si " +
            "JOIN product p ON si.product_id = p.product_id " +
            "JOIN sales s ON si.Sale_id = s.Sale_id " +
            "WHERE DATE(s.Sale_Date) = CURDATE() " +
            "GROUP BY p.product_Name ORDER BY total_sold DESC LIMIT 5"
        );
        ResultSet rs3 = pst3.executeQuery();
        StringBuilder topSellersText = new StringBuilder();
        while (rs3.next()) {
            topSellersText.append(rs3.getString("product_Name"))
                          .append("  -  ")
                          .append(rs3.getInt("total_sold"))
                          .append(" sold\n");
        }
        if (topSellersText.length() == 0) topSellersText.append("No sales yet today.");
        topSellersArea.setText(topSellersText.toString());

        topsellerPanel.setLayout(new BorderLayout());
        topsellerPanel.add(jLabel8, BorderLayout.NORTH);
        topsellerPanel.add(topSellersArea, BorderLayout.CENTER);
        topsellerPanel.revalidate();

        // --- Hourly sales ---
        JTextArea hourlyArea = new JTextArea();
        hourlyArea.setEditable(false);
        hourlyArea.setFont(jLabel9.getFont().deriveFont(java.awt.Font.PLAIN, 13f));

        PreparedStatement pst4 = con1.prepareStatement(
            "SELECT HOUR(Sale_Date) AS hr, SUM(Final_total) AS total FROM sales " +
            "WHERE DATE(Sale_Date) = CURDATE() GROUP BY HOUR(Sale_Date) ORDER BY hr"
        );
        ResultSet rs4 = pst4.executeQuery();
        StringBuilder hourlyText = new StringBuilder();
        while (rs4.next()) {
            hourlyText.append(String.format("%02d:00", rs4.getInt("hr")))
                       .append("  -  R")
                       .append(String.format("%.2f", rs4.getDouble("total")))
                       .append("\n");
        }
        if (hourlyText.length() == 0) hourlyText.append("No sales yet today.");
        hourlyArea.setText(hourlyText.toString());

        hrSalesPanel.setLayout(new BorderLayout());
        hrSalesPanel.add(jLabel9, BorderLayout.NORTH);
        hrSalesPanel.add(hourlyArea, BorderLayout.CENTER);
        hrSalesPanel.revalidate();

        // --- Recent transactions ---
        JTextArea recentArea = new JTextArea();
        recentArea.setEditable(false);
        recentArea.setFont(jLabel11.getFont().deriveFont(java.awt.Font.PLAIN, 13f));

        PreparedStatement pst5 = con1.prepareStatement(
            "SELECT Sale_id, Final_total, Sale_Date FROM sales ORDER BY Sale_Date DESC, Sale_id DESC LIMIT 5"
        );
        ResultSet rs5 = pst5.executeQuery();
        StringBuilder recentText = new StringBuilder();
        while (rs5.next()) {
            recentText.append("Sale #").append(rs5.getInt("Sale_id"))
                       .append("   R").append(String.format("%.2f", rs5.getDouble("Final_total")))
                       .append("   ").append(rs5.getDate("Sale_Date"))
                       .append("\n");
        }
        if (recentText.length() == 0) recentText.append("No transactions yet.");
        recentArea.setText(recentText.toString());

        RecTransactionPAnel.setLayout(new BorderLayout());
        RecTransactionPAnel.add(jLabel11, BorderLayout.NORTH);
        RecTransactionPAnel.add(recentArea, BorderLayout.CENTER);
        RecTransactionPAnel.revalidate();

        con1.close();

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Dashboard load error: " + ex.getMessage());
    }
}

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnProcessSale = new javax.swing.JButton();
        btnProductMng = new javax.swing.JButton();
        btnStaffManager = new javax.swing.JButton();
        usernamelbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        salesPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TotaSale = new javax.swing.JLabel();
        transectionPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Transection = new javax.swing.JLabel();
        soldItemPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        itemSold = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        topsellerPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        hrSalesPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        RecTransactionPAnel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        btnProcessSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/sales.png"))); // NOI18N
        btnProcessSale.setText("Process sales");
        btnProcessSale.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProcessSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessSaleActionPerformed(evt);
            }
        });

        btnProductMng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/delivery.png"))); // NOI18N
        btnProductMng.setText("Products Management");
        btnProductMng.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnProductMng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductMngActionPerformed(evt);
            }
        });

        btnStaffManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/viewing.png"))); // NOI18N
        btnStaffManager.setText("Staff Management");
        btnStaffManager.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStaffManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffManagerActionPerformed(evt);
            }
        });

        usernamelbl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usernamelbl.setForeground(new java.awt.Color(255, 255, 255));
        usernamelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/phothos/photos/user.png"))); // NOI18N
        usernamelbl.setText("Thabo M");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("10:36AM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnProcessSale, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnProductMng, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStaffManager, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(usernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcessSale, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductMng, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStaffManager, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernamelbl)
                    .addComponent(jLabel2))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        salesPanel.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Today's sales");

        TotaSale.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TotaSale.setText("R 4 740,99");

        javax.swing.GroupLayout salesPanelLayout = new javax.swing.GroupLayout(salesPanel);
        salesPanel.setLayout(salesPanelLayout);
        salesPanelLayout.setHorizontalGroup(
            salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesPanelLayout.createSequentialGroup()
                .addGroup(salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(salesPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1))
                    .addGroup(salesPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(TotaSale)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        salesPanelLayout.setVerticalGroup(
            salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(TotaSale)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        transectionPanel.setBackground(new java.awt.Color(153, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Transactions");

        Transection.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Transection.setText("37");

        javax.swing.GroupLayout transectionPanelLayout = new javax.swing.GroupLayout(transectionPanel);
        transectionPanel.setLayout(transectionPanelLayout);
        transectionPanelLayout.setHorizontalGroup(
            transectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transectionPanelLayout.createSequentialGroup()
                .addGroup(transectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transectionPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(transectionPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(Transection)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        transectionPanelLayout.setVerticalGroup(
            transectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(Transection)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        soldItemPanel.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Item sold");

        itemSold.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        itemSold.setText("148");

        javax.swing.GroupLayout soldItemPanelLayout = new javax.swing.GroupLayout(soldItemPanel);
        soldItemPanel.setLayout(soldItemPanelLayout);
        soldItemPanelLayout.setHorizontalGroup(
            soldItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(soldItemPanelLayout.createSequentialGroup()
                .addGroup(soldItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(soldItemPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(soldItemPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(itemSold)))
                .addContainerGap(186, Short.MAX_VALUE))
        );
        soldItemPanelLayout.setVerticalGroup(
            soldItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(soldItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(itemSold)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bestbrightnesspossystem/best_brightness_logo_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        topsellerPanel.setBackground(new java.awt.Color(255, 255, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Top sellers");

        javax.swing.GroupLayout topsellerPanelLayout = new javax.swing.GroupLayout(topsellerPanel);
        topsellerPanel.setLayout(topsellerPanelLayout);
        topsellerPanelLayout.setHorizontalGroup(
            topsellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topsellerPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel8)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        topsellerPanelLayout.setVerticalGroup(
            topsellerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topsellerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        hrSalesPanel.setBackground(new java.awt.Color(255, 204, 204));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Hourly  sales - Today");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("R per hour");

        javax.swing.GroupLayout hrSalesPanelLayout = new javax.swing.GroupLayout(hrSalesPanel);
        hrSalesPanel.setLayout(hrSalesPanelLayout);
        hrSalesPanelLayout.setHorizontalGroup(
            hrSalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hrSalesPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(45, 45, 45))
        );
        hrSalesPanelLayout.setVerticalGroup(
            hrSalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hrSalesPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(hrSalesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        RecTransactionPAnel.setBackground(new java.awt.Color(204, 255, 204));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Recent transactions");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        javax.swing.GroupLayout RecTransactionPAnelLayout = new javax.swing.GroupLayout(RecTransactionPAnel);
        RecTransactionPAnel.setLayout(RecTransactionPAnelLayout);
        RecTransactionPAnelLayout.setHorizontalGroup(
            RecTransactionPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecTransactionPAnelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(110, 110, 110))
        );
        RecTransactionPAnelLayout.setVerticalGroup(
            RecTransactionPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecTransactionPAnelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(RecTransactionPAnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(988, 988, 988)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(salesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(transectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(soldItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(hrSalesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(topsellerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(RecTransactionPAnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(soldItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hrSalesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(topsellerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RecTransactionPAnel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessSaleActionPerformed
        // TODO add your handling code here:
        Home h = new Home();
        h.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnProcessSaleActionPerformed

    private void btnProductMngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductMngActionPerformed
        // TODO add your handling code here:
         processSales p = new processSales();
        p.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_btnProductMngActionPerformed

    private void btnStaffManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffManagerActionPerformed
        // TODO add your handling code here:
               staffmanageraccount sma = new staffmanageraccount();
               sma.setVisible(true);
               this.hide();
    }//GEN-LAST:event_btnStaffManagerActionPerformed

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
            java.util.logging.Logger.getLogger(salesOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salesOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salesOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salesOverview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salesOverview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RecTransactionPAnel;
    private javax.swing.JLabel TotaSale;
    private javax.swing.JLabel Transection;
    private javax.swing.JButton btnProcessSale;
    private javax.swing.JButton btnProductMng;
    private javax.swing.JButton btnStaffManager;
    private javax.swing.JPanel hrSalesPanel;
    private javax.swing.JLabel itemSold;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel salesPanel;
    private javax.swing.JPanel soldItemPanel;
    private javax.swing.JPanel topsellerPanel;
    private javax.swing.JPanel transectionPanel;
    private javax.swing.JLabel usernamelbl;
    // End of variables declaration//GEN-END:variables
}
