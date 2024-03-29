/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.gui;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import yumxpress.dao.OrderDAO;
import yumxpress.pojo.OrderPojo;
import yumxpress.util.UserProfile;

/**
 *
 * @author sir
 */
public class CancelOrderFrame extends javax.swing.JFrame {

    private DefaultTableModel model;
    private List<OrderPojo> orderList;
    
    public CancelOrderFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblUserProfile.setText("Hello " + UserProfile.getUserName().trim());
        model = (DefaultTableModel) jtOrderedTable.getModel();
        loadNewOrderDetails(UserProfile.getUserId().trim());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblUserProfile = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnMyCart = new javax.swing.JButton();
        btnOrderFood = new javax.swing.JButton();
        btnOrderHistory = new javax.swing.JButton();
        btnMyAccount = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtOrderedTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\YumXpress\\src\\yumxpress\\icons\\icons\\user.png")); // NOI18N

        lblUserProfile.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));

        btnMyCart.setBackground(new java.awt.Color(153, 255, 153));
        btnMyCart.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMyCart.setText("My Cart");
        btnMyCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyCartActionPerformed(evt);
            }
        });

        btnOrderFood.setBackground(new java.awt.Color(153, 255, 153));
        btnOrderFood.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnOrderFood.setText("Order Food");
        btnOrderFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderFoodActionPerformed(evt);
            }
        });

        btnOrderHistory.setBackground(new java.awt.Color(153, 255, 153));
        btnOrderHistory.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnOrderHistory.setText("Order History");
        btnOrderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderHistoryActionPerformed(evt);
            }
        });

        btnMyAccount.setBackground(new java.awt.Color(153, 255, 153));
        btnMyAccount.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMyAccount.setText("My Account");
        btnMyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(264, 264, 264))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMyCart, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrderFood, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrderHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMyAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUserProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnMyAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(btnMyCart, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(btnOrderFood, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addComponent(btnOrderHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(164, 164, 164))
        );

        jtOrderedTable.setBackground(new java.awt.Color(204, 204, 255));
        jtOrderedTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtOrderedTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "PRODUCT NAME", "PRODUCT PRICE", "DELIVERY STAFF", "ADDRESS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtOrderedTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtOrderedTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtOrderedTable);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Cancel Order");

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 23, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(288, 288, 288))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(391, 391, 391)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new CustomerOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnOrderFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderFoodActionPerformed
        new OrderFoodFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderFoodActionPerformed

    private void btnMyCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyCartActionPerformed
        new CustomerCartFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMyCartActionPerformed

    private void btnOrderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderHistoryActionPerformed
        new ViewOrderHistoryFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderHistoryActionPerformed

    private void btnMyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyAccountActionPerformed
        new CustomerAccountFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMyAccountActionPerformed

    private void jtOrderedTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtOrderedTableMouseClicked
         int index = jtOrderedTable.getSelectedRow();
        OrderPojo order = orderList.get(index);
        String orderId=order.getOrderId();
        try{
            String[] str = {"Cancel Order", "No"};
            int choice = JOptionPane.showOptionDialog(null, "Do you want to cancel this order ?", "Select", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, str, str[1]);
            if(choice==0){
                boolean done=OrderDAO.cancelOrder(orderId);
                if(done){
                    JOptionPane.showMessageDialog(null, "Order cancelled..!");
                    model.removeRow(index);
                    return;
                }
                JOptionPane.showMessageDialog(null, "Some error occured in order cancelling..!");
            }
            
        }
        catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, "DB ERROR IN CancelOrderFrame jt Mouse Clicked");
            sq.printStackTrace();
        }      
    }//GEN-LAST:event_jtOrderedTableMouseClicked

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
            java.util.logging.Logger.getLogger(CancelOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelOrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelOrderFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMyAccount;
    private javax.swing.JButton btnMyCart;
    private javax.swing.JButton btnOrderFood;
    private javax.swing.JButton btnOrderHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtOrderedTable;
    private javax.swing.JLabel lblUserProfile;
    // End of variables declaration//GEN-END:variables

    private void loadNewOrderDetails(String customerId) {
         try {
            orderList = OrderDAO.getOrdersToCancel(customerId);
            if (orderList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "You have no orders to cancel..!");
                jtOrderedTable.setEnabled(false);
                return;
            }
            int i = 0;
            Object[] rows = new Object[5];
            while (i < orderList.size()) {
                OrderPojo ord = orderList.get(i);
                rows[0] = ord.getOrderId();
                rows[1] = ord.getProductName();
                rows[2] = ord.getProductPrice();
                rows[3] = ord.getDeliveryStaffName();
                rows[4] = ord.getCustomerAddress();
                model.addRow(rows);
                i++;

            }
        } catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, "DB ERROR IN CancelOrderFrame");
            sq.printStackTrace();
        }
    }
}
