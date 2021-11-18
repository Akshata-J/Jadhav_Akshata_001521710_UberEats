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
import java.util.List;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akshatajadhav
 */
public class DeliveryHistoryJPanel extends javax.swing.JPanel {

    FoodDeliverySystem system;
    DeliveryPartner deliveryPartner;
    JLayeredPane deliveryPartnerTaskLayer;
    List<Object> test = new ArrayList<>();
    /**
     * Creates new form SysAdminManageCustomersJPanel
     */
    public DeliveryHistoryJPanel(JLayeredPane deliveryPartnerTaskLayer, FoodDeliverySystem system, DeliveryPartner deliveryPartner) {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        deliveryHistory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        tableRecordsStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableRecordsStatus.setText("No orders available to pick up!");

        setBackground(new java.awt.Color(255, 255, 255));

        deliveryHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(deliveryHistory);
        if (deliveryHistory.getColumnModel().getColumnCount() > 0) {
            deliveryHistory.getColumnModel().getColumn(0).setResizable(false);
            deliveryHistory.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Deliver History!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable deliveryHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel tableRecordsStatus;
    // End of variables declaration//GEN-END:variables
    private void populateTable() {
        JTable table = deliveryHistory;
        int rowCount = table.getRowCount();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (Order o : system.getOrderByDeliveryPartner(deliveryPartner)) {
                Object[] c = new Object[5];
                c[0] = o.getOrderId();
                c[1] = o.getCustomer().getName();
                c[2] = o.getRestaurant().getRestaurantName();
                c[3] = o.getRestaurant().getAddress();
                c[4] = o.getItemsAsString();
                model.addRow(c);
        }
        table.getSelectedRow();
        table.setModel(model);
        if (table.getRowCount() == 0) {
            table.add(tableRecordsStatus);
            table.setFillsViewportHeight(true);
        }
    }
}
