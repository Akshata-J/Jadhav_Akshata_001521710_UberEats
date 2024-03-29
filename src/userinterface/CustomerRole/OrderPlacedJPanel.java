/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.FoodDeliverySystem;
import Business.Order.Order;
import java.awt.BorderLayout;
import java.awt.Font;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author akshatajadhav
 */
public class OrderPlacedJPanel extends javax.swing.JPanel {

    JLayeredPane customerTaskLayer;
    List<Object> test = new ArrayList<>();
    FoodDeliverySystem system;
    Order order;
    /**
     * Creates new form SysAdminManageCustomersJPanel
     */
    public OrderPlacedJPanel(JLayeredPane customerTaskLayer, FoodDeliverySystem system, Order order) {
        initComponents();
        this.customerTaskLayer=customerTaskLayer;
        this.order = order;
        itemsLabel.setText("Restaurant:"+order.getRestaurant().getRestaurantName()+"    Order Items : "+order.getItemsAsString());
        
        URL url = this.getClass().getResource("/resources/orderPlaced.gif");
        Icon myImgIcon = new ImageIcon(url);
        //JLabel imageLbl = new JLabel(myImgIcon);
        jLabel1.setIcon(myImgIcon);
        //add(jLabel1, BorderLayout.CENTER);
    }

    public void displayCustomerTaskPanel(JPanel panel) {
        customerTaskLayer.removeAll();
        customerTaskLayer.add(panel);
        customerTaskLayer.repaint();
        customerTaskLayer.revalidate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        itemsLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 89, 470, 327));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Order Placed Successfully!");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 11, -1, -1));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 64, -1, 14));

        itemsLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        itemsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemsLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        add(itemsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 51, 1000, 27));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel itemsLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
