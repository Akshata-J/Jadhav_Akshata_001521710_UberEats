/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.FoodDeliverySystem;
import Business.Restaurant.Restaurant;
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
public class ListRestaurantsJPanel extends javax.swing.JPanel {

    FoodDeliverySystem system;
    JLayeredPane adminTaskLayer;
    Customer customer;
    /**
     * Creates new form SysAdminManageCustomersJPanel
     */
    public ListRestaurantsJPanel(JLayeredPane adminTaskLayer, FoodDeliverySystem system, Customer customer) {
        initComponents();
        this.adminTaskLayer = adminTaskLayer;
        this.system = system;
        this.customer = customer;
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
        restaurantListTable = new javax.swing.JTable();
        selectRestaurantButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tableRecordsStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableRecordsStatus.setText("No records available");

        setBackground(new java.awt.Color(255, 255, 255));

        restaurantListTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(restaurantListTable);
        if (restaurantListTable.getColumnModel().getColumnCount() > 0) {
            restaurantListTable.getColumnModel().getColumn(0).setResizable(false);
            restaurantListTable.getColumnModel().getColumn(1).setResizable(false);
        }

        selectRestaurantButton.setBackground(new java.awt.Color(92, 184, 92));
        selectRestaurantButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        selectRestaurantButton.setForeground(new java.awt.Color(255, 255, 255));
        selectRestaurantButton.setText("Select");
        selectRestaurantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectRestaurantButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Select Restaurant");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(selectRestaurantButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 962, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectRestaurantButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectRestaurantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectRestaurantButtonActionPerformed
        String restaurantName = (String) restaurantListTable.getValueAt(restaurantListTable.getSelectedRow(),0);
        MenuJPanel mjp = new MenuJPanel(adminTaskLayer, system, restaurantName, customer);
        displayAdminTaskPanel(mjp);
    }//GEN-LAST:event_selectRestaurantButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable restaurantListTable;
    private javax.swing.JButton selectRestaurantButton;
    private javax.swing.JLabel tableRecordsStatus;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        JTable table = restaurantListTable;
        int rowCount = table.getRowCount();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
    
        for (Restaurant r : system.getRestaurantDirectory().getRestaurantDirectory()) {
            System.out.println(r);
            Object[] c = new Object[8];
            c[0] = r.getRestaurantName();
            c[1] = r.getDescription();
            model.addRow(c);
        }
        table.setModel(model);
        if (table.getRowCount() == 0) {
            table.add(tableRecordsStatus);
            table.setFillsViewportHeight(true);
        }
    }
}
