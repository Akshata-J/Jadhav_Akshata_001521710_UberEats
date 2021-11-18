/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryPartnerRole;

import Business.DeliveryPartner.DeliveryPartner;
import Business.FoodDeliverySystem;
import Business.Order.Order;
import userinterface.CustomerRole.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akshatajadhav
 */
public class CurrentDeliveryJPanel extends javax.swing.JPanel {

    FoodDeliverySystem system;
    DeliveryPartner deliveryPartner;
    JLayeredPane deliveryPartnerTaskLayer;
    List<Object> test = new ArrayList<>();
    /**
     * Creates new form SysAdminManageCustomersJPanel
     */
    public CurrentDeliveryJPanel(JLayeredPane deliveryPartnerTaskLayer, FoodDeliverySystem system, DeliveryPartner deliveryPartner) {
        initComponents();
        this.deliveryPartnerTaskLayer=deliveryPartnerTaskLayer;
        this.system = system;
        this.deliveryPartner = deliveryPartner;
        tableRecordsStatus.setSize(tableRecordsStatus.getPreferredSize());
        populateTable();
    }

    public void displayDeliveryPartnerTaskPanel(JPanel panel) {
        deliveryPartnerTaskLayer.removeAll();
        deliveryPartnerTaskLayer.add(panel);
        deliveryPartnerTaskLayer.repaint();
        deliveryPartnerTaskLayer.revalidate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableRecordsStatus = new javax.swing.JLabel();
        deliverOrderBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        currentDeliveryTable = new javax.swing.JTable();

        tableRecordsStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableRecordsStatus.setText("No orders available to pick up!");

        setBackground(new java.awt.Color(255, 255, 255));

        deliverOrderBtn.setBackground(new java.awt.Color(92, 184, 92));
        deliverOrderBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deliverOrderBtn.setForeground(new java.awt.Color(255, 255, 255));
        deliverOrderBtn.setText("Deliver Order!");
        deliverOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliverOrderBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Deliver Order!");

        currentDeliveryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Customer", "Delivery Address ", "Resturant", "PickUp Address", "Items"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(currentDeliveryTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(396, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(deliverOrderBtn)))
                .addContainerGap(396, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(deliverOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deliverOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliverOrderBtnActionPerformed
        int row = currentDeliveryTable.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Select a order!", "Select", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String orderId = (String) currentDeliveryTable.getValueAt(row, 0);
        if(system.getOrderById(orderId).getOrderStatus().equalsIgnoreCase("Order Delivered")){
            JOptionPane.showMessageDialog(this, "Order already Delivered!", "Order Status", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        system.getOrderById(orderId).setOrderStatus("Order Delivered");
        system.getOrderById(orderId).setResolveDate(new Date());
        populateTable();
    }//GEN-LAST:event_deliverOrderBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable currentDeliveryTable;
    private javax.swing.JButton deliverOrderBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tableRecordsStatus;
    // End of variables declaration//GEN-END:variables
    private void populateTable() {
        JTable table = currentDeliveryTable;
        int rowCount = table.getRowCount();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (Order o : system.getOrderDirectory().getOrderDirectory()) {
            if (o.getOrderStatus().equalsIgnoreCase("Order picked up")) {
                Object[] c = new Object[6];
                c[0] = o.getOrderId();
                c[1] = o.getCustomer().getName();
                c[2] = o.getCustomer().getHomeAddress();
                c[3] = o.getRestaurant().getRestaurantName();
                c[4] = o.getRestaurant().getAddress();
                c[5] = o.getItemsAsString();
                model.addRow(c);
            }
        }
        table.getSelectedRow();
        table.setModel(model);
        if (table.getRowCount() == 0) {
            table.add(tableRecordsStatus);
            table.setFillsViewportHeight(true);
            deliverOrderBtn.setEnabled(false);
        } else {
            deliverOrderBtn.setEnabled(true);
        }
    }
}
