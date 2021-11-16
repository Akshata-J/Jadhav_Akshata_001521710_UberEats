/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.FoodDeliverySystem;
import Business.Order.Order;
import userinterface.SystemAdminWorkArea.*;
import java.awt.Color;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import userinterface.login.LoginJPanel;

/**
 *
 * @author akshatajadhav
 */
public class CustomerJPanel extends javax.swing.JPanel {

    FoodDeliverySystem system;
    JLayeredPane mainLayeredPane;
    Customer customer;
    DB4OUtil dB4OUtil;
    /**
     * Creates new form LoginJPanel
     */
    public CustomerJPanel(JLayeredPane mainLayeredPane, FoodDeliverySystem system, Customer customer, DB4OUtil dB4OUtil) {
        initComponents();
        //jPanel1.setBackground(new Color(0, 0, 0, 0));
        jLabel5.setBackground(new Color(63, 129, 64));
        tableRecordsStatus.setSize(tableRecordsStatus.getPreferredSize());
        this.mainLayeredPane = mainLayeredPane;
        this.system = system;
        this.customer = customer;
        List<Order> customerOrders = system.getOrdersOfCustomer(customer);
        Order order=null;
        if(customerOrders.size()>0){
            order=customerOrders.get(customerOrders.size()-1);
        }
        if(order!=null && order.getOrderStatus().equalsIgnoreCase("Order Placed")){
            OrderPlacedJPanel lrjp = new OrderPlacedJPanel(adminTaskLayer,system, order);
            displayCustomerTaskPanel(lrjp);
            return;
        }
        if(order!=null && order.getOrderStatus().equalsIgnoreCase("Order Accepted")){
            OrderPreparingJPanel lrjp = new OrderPreparingJPanel(adminTaskLayer);
            displayCustomerTaskPanel(lrjp);
            return;
        }
        ListRestaurantsJPanel lrjp = new ListRestaurantsJPanel(adminTaskLayer,system, customer);
        displayCustomerTaskPanel(lrjp);
    }
    
    public void displayCustomerTaskPanel(JPanel panel) {
        adminTaskLayer.removeAll();
        adminTaskLayer.add(panel);
        adminTaskLayer.repaint();
        adminTaskLayer.revalidate();
    }
    
    public void displayMainPanel(JPanel panel) {
        mainLayeredPane.removeAll();
        mainLayeredPane.add(panel);
        mainLayeredPane.repaint();
        mainLayeredPane.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rolesRadioButton = new javax.swing.ButtonGroup();
        tableRecordsStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        adminTaskLayer = new javax.swing.JLayeredPane();
        blankPane = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        tableRecordsStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableRecordsStatus.setText("No records available");

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Place A Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Order History");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Sign Out");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        adminTaskLayer.setLayout(new java.awt.CardLayout());

        blankPane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout blankPaneLayout = new javax.swing.GroupLayout(blankPane);
        blankPane.setLayout(blankPaneLayout);
        blankPaneLayout.setHorizontalGroup(
            blankPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        blankPaneLayout.setVerticalGroup(
            blankPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        adminTaskLayer.add(blankPane, "card2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adminTaskLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(adminTaskLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 990, 520));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/login/UberEats.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, -1));

        jLabel5.setBackground(new java.awt.Color(63, 129, 64));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Welcome Customer!");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel5.setOpaque(true);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 1050, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/login/x.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, -1, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/login/right.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 680, 720));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/login/right.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 710, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        JFrame parentFrame = (JFrame) SwingUtilities.getRoot(this);//(JFrame)this.getParent().getParent().getParent();
        parentFrame.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        List<Order> customerOrders = system.getOrdersOfCustomer(customer);
        Order order=null;
        if(customerOrders.size()>0){
            order=customerOrders.get(customerOrders.size()-1);
        }
        System.out.println(order);
        if(order!=null && order.getOrderStatus().equalsIgnoreCase("Order Placed")){
            OrderPlacedJPanel lrjp = new OrderPlacedJPanel(adminTaskLayer, system, order);
            displayCustomerTaskPanel(lrjp);
            return;
        }
        ListRestaurantsJPanel lrjp = new ListRestaurantsJPanel(adminTaskLayer,system, customer);
        displayCustomerTaskPanel(lrjp);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        OrderHistoryJPanel ohjp = new OrderHistoryJPanel(adminTaskLayer, system, customer);
        displayCustomerTaskPanel(ohjp);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        LoginJPanel ljp = new LoginJPanel(mainLayeredPane,system,dB4OUtil);
        displayMainPanel(ljp);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane adminTaskLayer;
    private javax.swing.JPanel blankPane;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.ButtonGroup rolesRadioButton;
    private javax.swing.JLabel tableRecordsStatus;
    // End of variables declaration//GEN-END:variables
}
