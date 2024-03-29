/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.gui;

import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import yumxpress.dao.CompanyDAO;
import yumxpress.dao.OrderDAO;
import yumxpress.dao.ProductDAO;
import yumxpress.pojo.PlaceOrderPojo;
import yumxpress.pojo.ProductPojo;
import yumxpress.util.UserProfile;

/**
 *
 * @author sir
 */
public class OrderFoodFrame extends javax.swing.JFrame {

    private Map<String, String> companyMap;
    private List<ProductPojo> productList;
    private int listIndex ;
    private ProductPojo p;
    private JFrame showFrame; 
    public OrderFoodFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblOwnerProfile.setText("Hello " + UserProfile.getUserName().trim());
        loadCompanyNames();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnMyAccount = new javax.swing.JButton();
        btnMyCart = new javax.swing.JButton();
        btnCancelOrder = new javax.swing.JButton();
        btnOrderHistory = new javax.swing.JButton();
        lblOwnerProfile = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblProductImage1 = new javax.swing.JLabel();
        lblProductImage2 = new javax.swing.JLabel();
        lblProductImage3 = new javax.swing.JLabel();
        lblProductName1 = new javax.swing.JLabel();
        lblProductName2 = new javax.swing.JLabel();
        lblProductName3 = new javax.swing.JLabel();
        lblProductImage6 = new javax.swing.JLabel();
        lblProductName6 = new javax.swing.JLabel();
        lblProductImage5 = new javax.swing.JLabel();
        lblProductImage4 = new javax.swing.JLabel();
        lblProductName5 = new javax.swing.JLabel();
        lblProductName4 = new javax.swing.JLabel();
        jcbCompanyNames = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(127, 118, 177));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.white));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\YumXpress\\src\\yumxpress\\icons\\icons\\user.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 13, -1, -1));

        btnBack.setBackground(new java.awt.Color(255, 153, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 604, 107, -1));

        btnMyAccount.setBackground(new java.awt.Color(255, 153, 0));
        btnMyAccount.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMyAccount.setText("My Account");
        btnMyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyAccountActionPerformed(evt);
            }
        });
        jPanel2.add(btnMyAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 234, 165, 51));

        btnMyCart.setBackground(new java.awt.Color(255, 153, 0));
        btnMyCart.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnMyCart.setText("My Cart");
        btnMyCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyCartActionPerformed(evt);
            }
        });
        jPanel2.add(btnMyCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 324, 165, 52));

        btnCancelOrder.setBackground(new java.awt.Color(255, 153, 0));
        btnCancelOrder.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnCancelOrder.setText("Cancel Order");
        btnCancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelOrderActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 411, 165, 53));

        btnOrderHistory.setBackground(new java.awt.Color(255, 153, 0));
        btnOrderHistory.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnOrderHistory.setText("Order History");
        btnOrderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderHistoryActionPerformed(evt);
            }
        });
        jPanel2.add(btnOrderHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 499, 165, 52));

        lblOwnerProfile.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel2.add(lblOwnerProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 169, 258, 28));

        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 203, 291, 1));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 222, 291, 1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 670));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 255));
        jLabel3.setText("Order Food");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 11, -1, -1));

        lblNext.setIcon(new javax.swing.ImageIcon("F:\\YumXpress\\src\\yumxpress\\icons\\icons\\icons8-right-arrow-64.png")); // NOI18N
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
        });
        jPanel1.add(lblNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 340, -1, 73));

        lblBack.setIcon(new javax.swing.ImageIcon("F:\\YumXpress\\src\\yumxpress\\icons\\icons\\icons8-left-arrow-64.png")); // NOI18N
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        jPanel1.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION), "Click the Image to Order The Food", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Showcard Gothic", 1, 18), new java.awt.Color(255, 153, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProductImage1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblProductImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        lblProductImage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });
        jPanel3.add(lblProductImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 55, 190, 142));

        lblProductImage2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblProductImage2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        lblProductImage2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });
        jPanel3.add(lblProductImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 55, 190, 142));

        lblProductImage3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblProductImage3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        lblProductImage3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });
        jPanel3.add(lblProductImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 55, 190, 142));

        lblProductName1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProductName1.setForeground(new java.awt.Color(255, 153, 0));
        lblProductName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        lblProductName1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProductsName(evt);
            }
        });
        jPanel3.add(lblProductName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 215, 190, 33));

        lblProductName2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProductName2.setForeground(new java.awt.Color(255, 153, 0));
        lblProductName2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel3.add(lblProductName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 215, 190, 33));

        lblProductName3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProductName3.setForeground(new java.awt.Color(255, 153, 0));
        lblProductName3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel3.add(lblProductName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 215, 190, 33));

        lblProductImage6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblProductImage6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        lblProductImage6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });
        jPanel3.add(lblProductImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 278, 190, 142));

        lblProductName6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProductName6.setForeground(new java.awt.Color(255, 153, 0));
        lblProductName6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel3.add(lblProductName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 446, 190, 33));

        lblProductImage5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblProductImage5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        lblProductImage5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });
        jPanel3.add(lblProductImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 278, 190, 142));

        lblProductImage4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblProductImage4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        lblProductImage4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOrderProductMouseClicked(evt);
            }
        });
        jPanel3.add(lblProductImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 278, 190, 142));

        lblProductName5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProductName5.setForeground(new java.awt.Color(255, 153, 0));
        lblProductName5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel3.add(lblProductName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 446, 190, 33));

        lblProductName4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblProductName4.setForeground(new java.awt.Color(255, 153, 0));
        lblProductName4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0)));
        jPanel3.add(lblProductName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 446, 181, 33));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 700, 500));

        jcbCompanyNames.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbCompanyNames.setForeground(new java.awt.Color(255, 135, 0));
        jcbCompanyNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCompanyNamesActionPerformed(evt);
            }
        });
        jPanel1.add(jcbCompanyNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(996, 96, 146, 31));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Filter :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(908, 96, 70, 31));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CustomerAccountFrame accountFrame =new CustomerAccountFrame();
        accountFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnMyCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyCartActionPerformed
       new CustomerCartFrame().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnMyCartActionPerformed

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
         
        listIndex--;
        if(listIndex < 0){
            listIndex = productList.size() -1;
        }
        showDetails();
    }//GEN-LAST:event_lblNextMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
       listIndex++;
        if(listIndex >= productList.size()){
            listIndex = 0;
        }
        showDetails();
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnMyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyAccountActionPerformed
        CustomerAccountFrame accountFrame = new CustomerAccountFrame();
        accountFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMyAccountActionPerformed

    private void jcbCompanyNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCompanyNamesActionPerformed
        String compName = jcbCompanyNames.getSelectedItem().toString();
        String compId = companyMap.get(compName);
        if(compId == null){
            compId = "ALL";
        }
        try {
            productList = ProductDAO.getAllProductsByCompanyId(compId);
            showDetails();
        } catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, "DB ERROR IN OrderFoodFrame");
            sq.printStackTrace();
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Image ERROR IN OrderFoodFrame");
            ex.printStackTrace();
        }
                
            
    }//GEN-LAST:event_jcbCompanyNamesActionPerformed

    private void lblProductsName(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProductsName
        // TODO add your handling code here:
    }//GEN-LAST:event_lblProductsName

    private void lblOrderProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOrderProductMouseClicked
        JLabel lbl = (JLabel)evt.getSource();
        int index = Integer.parseInt(lbl.getName());
        System.out.println("You clicked on: " + index);
        if(index >= productList.size()){
            JOptionPane.showMessageDialog(null, "Invalid item clicked");
            return;
        }
        String [] str = {"Add to Cart", "Buy Now"};
        int choice = JOptionPane.showOptionDialog(null, "What do you want to do?", "Select", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, str, str[1]);
        if(choice == 0){
            p = productList.get(index);
            PlaceOrderPojo placeOrder=new PlaceOrderPojo();
            placeOrder.setCompanyId(p.getCompanyId());
            placeOrder.setProductId(p.getProductId());
            placeOrder.setCustomerId(UserProfile.getUserId());
            try{
                boolean done=OrderDAO.addToCart(placeOrder);
                if(done){
                    JOptionPane.showMessageDialog(null, "Product added to CART successfully..!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Product not added to CART");
                }
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "DB Error in OrderFood Frame..!");
                ex.printStackTrace();
            }    
        }
        else{
            ProductPojo p = productList.get(index);
            showFrame = new OrderProductFrame(p);
            showFrame.setVisible(true);
            this.dispose();
        }
       
        
    }//GEN-LAST:event_lblOrderProductMouseClicked

    private void btnCancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelOrderActionPerformed
        new CancelOrderFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelOrderActionPerformed

    private void btnOrderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderHistoryActionPerformed
        new ViewOrderHistoryFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderHistoryActionPerformed

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
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFoodFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelOrder;
    private javax.swing.JButton btnMyAccount;
    private javax.swing.JButton btnMyCart;
    private javax.swing.JButton btnOrderHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcbCompanyNames;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblOwnerProfile;
    private javax.swing.JLabel lblProductImage1;
    private javax.swing.JLabel lblProductImage2;
    private javax.swing.JLabel lblProductImage3;
    private javax.swing.JLabel lblProductImage4;
    private javax.swing.JLabel lblProductImage5;
    private javax.swing.JLabel lblProductImage6;
    private javax.swing.JLabel lblProductName1;
    private javax.swing.JLabel lblProductName2;
    private javax.swing.JLabel lblProductName3;
    private javax.swing.JLabel lblProductName4;
    private javax.swing.JLabel lblProductName5;
    private javax.swing.JLabel lblProductName6;
    // End of variables declaration//GEN-END:variables

    private void loadCompanyNames() {
        try {
            companyMap = CompanyDAO.getAllCompanyIdAndName();
            Set<String> companyNames = companyMap.keySet();
            jcbCompanyNames.addItem("ALL");
            for(String cname: companyNames){
                jcbCompanyNames.addItem(cname);
            }
                
        } catch (SQLException sq) {
            JOptionPane.showMessageDialog(null, "DB ERROR IN OrderFoodFrame");
            sq.printStackTrace();
        }
    }

    private void showDetails() {
        if(listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage1.getWidth(), lblProductImage1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage1.setIcon(icon);
            lblProductName1.setText(p.getProductName());  
            lblProductImage1.setName(listIndex + "");
            lblProductName1.setName(listIndex + "");
            listIndex++;
        } else{
            lblProductImage1.setIcon(null);
            lblProductName1.setText("N/A"); 
            lblProductImage1.setText("N/A");
            lblProductImage1.setName(listIndex + "");
            lblProductName1.setName(listIndex + "");
            listIndex++;
        }
        if(listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage2.getWidth(), lblProductImage2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage2.setIcon(icon);
            lblProductName2.setText(p.getProductName());
            lblProductImage2.setName(listIndex + "");
            lblProductName2.setName(listIndex + "");
            listIndex++;
        } else{
            lblProductImage2.setIcon(null);
            lblProductName2.setText("N/A"); 
            lblProductImage2.setText("N/A");
            lblProductImage2.setName(listIndex + "");
            lblProductName2.setName(listIndex + "");
            listIndex++;
        }
        if(listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage3.getWidth(), lblProductImage3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage3.setIcon(icon);
            lblProductName3.setText(p.getProductName());
            lblProductImage3.setName(listIndex + "");
            lblProductName3.setName(listIndex + "");
            listIndex++;
        } else{
            lblProductImage3.setIcon(null);
            lblProductName3.setText("N/A"); 
            lblProductImage3.setText("N/A");
            lblProductImage3.setName(listIndex + "");
            lblProductName3.setName(listIndex + "");
            listIndex++;
        }
        if(listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage4.getWidth(), lblProductImage4.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage4.setIcon(icon);
            lblProductName4.setText(p.getProductName());
            lblProductImage4.setName(listIndex + "");
            lblProductName4.setName(listIndex + "");
            listIndex++;
        } else{
            lblProductImage4.setIcon(null);
            lblProductName4.setText("N/A"); 
            lblProductImage4.setText("N/A");
            lblProductImage4.setName(listIndex + "");
            lblProductName4.setName(listIndex + "");
            listIndex++;
        }
        if(listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage5.getWidth(), lblProductImage5.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage5.setIcon(icon);
            lblProductName5.setText(p.getProductName());
            lblProductImage5.setName(listIndex + "");
            lblProductName5.setName(listIndex + "");
            listIndex++;
        } else{
            lblProductImage5.setIcon(null);
            lblProductName5.setText("N/A"); 
            lblProductImage5.setText("N/A");
            lblProductImage5.setName(listIndex + "");
            lblProductName5.setName(listIndex + "");
            listIndex++;
        }
        if(listIndex < productList.size()) {
            ProductPojo p = productList.get(listIndex);
            Image img = p.getProductImage();
            img = img.getScaledInstance(lblProductImage6.getWidth(), lblProductImage6.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblProductImage6.setIcon(icon);
            lblProductName6.setText(p.getProductName());
            lblProductImage6.setName(listIndex + "");
            lblProductName6.setName(listIndex + "");
            listIndex++;
        } else{
            lblProductImage6.setIcon(null);
            lblProductName6.setText("N/A"); 
            lblProductImage6.setText("N/A");
            lblProductImage6.setName(listIndex + "");
            lblProductName6.setName(listIndex + "");
            listIndex++;
        }
        
    }
}
