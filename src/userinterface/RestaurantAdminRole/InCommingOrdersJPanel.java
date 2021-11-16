/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.FoodDeliverySystem;
import Business.Order.Order;
import Business.Restaurant.Restaurant;
import userinterface.DeliveryManRole.*;
import userinterface.CustomerRole.*;
import java.util.ArrayList;
import java.util.List;
import userinterface.SystemAdminWorkArea.*;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akshatajadhav
 */
public class InCommingOrdersJPanel extends javax.swing.JPanel {
    
    FoodDeliverySystem system;
    Restaurant restaurant;
    JLayeredPane adminTaskLayer;
    List<Object> test = new ArrayList<>();
    /**
     * Creates new form SysAdminManageCustomersJPanel
     */
    public InCommingOrdersJPanel(JLayeredPane adminTaskLayer, FoodDeliverySystem system, Restaurant restaurant) {
        initComponents();
        this.adminTaskLayer=adminTaskLayer;
        this.system = system;
        this.restaurant = restaurant;
        tableRecordsStatus.setSize(tableRecordsStatus.getPreferredSize());
        populateTable();
    }

    public void displayAdminTaskPanel(JPanel panel) {
        adminTaskLayer.removeAll();
        adminTaskLayer.add(panel);
        adminTaskLayer.repaint();
        adminTaskLayer.revalidate();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        incomingOrdersTable = new javax.swing.JTable();
        acceptOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tableRecordsStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableRecordsStatus.setText("No records available");

        setBackground(new java.awt.Color(255, 255, 255));

        incomingOrdersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Status", "Items", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(incomingOrdersTable);
        if (incomingOrdersTable.getColumnModel().getColumnCount() > 0) {
            incomingOrdersTable.getColumnModel().getColumn(0).setResizable(false);
            incomingOrdersTable.getColumnModel().getColumn(1).setResizable(false);
            incomingOrdersTable.getColumnModel().getColumn(2).setResizable(false);
            incomingOrdersTable.getColumnModel().getColumn(3).setResizable(false);
        }

        acceptOrder.setBackground(new java.awt.Color(92, 184, 92));
        acceptOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        acceptOrder.setForeground(new java.awt.Color(255, 255, 255));
        acceptOrder.setText("Accept Order!");
        acceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptOrderActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Start Preparing Order!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(acceptOrder)
                .addGap(391, 391, 391))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(acceptOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void acceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptOrderActionPerformed
        populateTable();
        incomingOrdersTable.setValueAt("Order Accepted",incomingOrdersTable.getSelectedRow(),1);
        system.getOrderById((String) incomingOrdersTable.getValueAt(incomingOrdersTable.getSelectedRow(),0)).setOrderStatus("Order Accepted");
    }//GEN-LAST:event_acceptOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptOrder;
    private javax.swing.JTable incomingOrdersTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tableRecordsStatus;
    // End of variables declaration//GEN-END:variables
    private void populateTable() {
        JTable table = incomingOrdersTable;
        int rowCount = table.getRowCount();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    
        for (Order o : system.getOrdersByRestaurant(restaurant)) {
            if(o.getOrderStatus().equalsIgnoreCase("Order Placed")){
                Object[] c = new Object[4];
                c[0] = o.getOrderId();
                c[1] = o.getOrderStatus();
                c[2] = o.getItemsAsString();
                c[3] = o.getTotal();
                model.addRow(c);
                //model.addRow(c);
            }
        }
        table.getSelectedRow();
        table.setModel(model);
        if (table.getRowCount() == 0) {
            table.add(tableRecordsStatus);
            table.setFillsViewportHeight(true);
        }
    }
}
