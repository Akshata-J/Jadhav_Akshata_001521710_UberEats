/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantManagerRole;

import Business.FoodDeliverySystem;
import Business.Menu.Menu;
import Business.Restaurant.Restaurant;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author akshatajadhav
 */
public class ManageMenuJPanel extends javax.swing.JPanel {

    FoodDeliverySystem system;
    Restaurant restaurant;
    JLayeredPane restaurantTaskLayer;
    /**
     * Creates new form SysAdminManageCustomersJPanel
     */
    public ManageMenuJPanel(JLayeredPane restaurantTaskLayer, FoodDeliverySystem system, Restaurant restaurant) {
        initComponents();
        this.restaurantTaskLayer=restaurantTaskLayer;
        this.system = system;
        this.restaurant = restaurant;
        tableRecordsStatus.setSize(tableRecordsStatus.getPreferredSize());
        populateTable();
    }

    public void displayRestaurantTaskPanel(JPanel panel) {
        restaurantTaskLayer.removeAll();
        restaurantTaskLayer.add(panel);
        restaurantTaskLayer.repaint();
        restaurantTaskLayer.revalidate();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        deleteMenu = new javax.swing.JButton();
        modifyMenu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        modifyBtn4 = new javax.swing.JButton();

        tableRecordsStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableRecordsStatus.setText("No items Available!");

        setBackground(new java.awt.Color(255, 255, 255));

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(menuTable);
        if (menuTable.getColumnModel().getColumnCount() > 0) {
            menuTable.getColumnModel().getColumn(0).setResizable(false);
            menuTable.getColumnModel().getColumn(1).setResizable(false);
        }

        deleteMenu.setBackground(new java.awt.Color(209, 26, 42));
        deleteMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteMenu.setForeground(new java.awt.Color(255, 255, 255));
        deleteMenu.setText("Delete");
        deleteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuActionPerformed(evt);
            }
        });

        modifyMenu.setBackground(new java.awt.Color(92, 184, 92));
        modifyMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modifyMenu.setForeground(new java.awt.Color(255, 255, 255));
        modifyMenu.setText("Modify");
        modifyMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyMenuActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Manage Menu");

        modifyBtn4.setBackground(new java.awt.Color(92, 184, 92));
        modifyBtn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modifyBtn4.setForeground(new java.awt.Color(255, 255, 255));
        modifyBtn4.setText("Add Item");
        modifyBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtn4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(modifyBtn4)
                                .addGap(122, 122, 122)
                                .addComponent(modifyMenu)
                                .addGap(119, 119, 119)
                                .addComponent(deleteMenu)
                                .addGap(0, 258, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {deleteMenu, modifyBtn4, modifyMenu});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 48, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {deleteMenu, modifyBtn4, modifyMenu});

    }// </editor-fold>//GEN-END:initComponents

    private void deleteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenuActionPerformed
        int row = menuTable.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Select a menu!", "Select", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String itemName = (String) menuTable.getValueAt(row, 0);
        system.getRestaurantByObj(restaurant).getMenuDirectory().removeMenu(itemName);
        restaurant.removeMenu(itemName);
        populateTable();
    }//GEN-LAST:event_deleteMenuActionPerformed

    private void modifyMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyMenuActionPerformed
        int row = menuTable.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Select a menu!", "Select", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        String itemName = (String) menuTable.getValueAt(row, 0);
        ModifyItemJPanel mcjp = new ModifyItemJPanel(restaurantTaskLayer, system, restaurant, itemName);
        displayRestaurantTaskPanel(mcjp);
    }//GEN-LAST:event_modifyMenuActionPerformed

    private void modifyBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtn4ActionPerformed
        AddItemJPanel acjp = new AddItemJPanel(restaurantTaskLayer, system, restaurant);
        displayRestaurantTaskPanel(acjp);
    }//GEN-LAST:event_modifyBtn4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteMenu;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable menuTable;
    private javax.swing.JButton modifyBtn4;
    private javax.swing.JButton modifyMenu;
    private javax.swing.JLabel tableRecordsStatus;
    // End of variables declaration//GEN-END:variables
    private void populateTable() {
        JTable table = menuTable;
        int rowCount = table.getRowCount();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        for (Menu m : restaurant.getMenu()) {
                Object[] c = new Object[2];
                c[0] = m.getItemName();
                c[1] = m.getPrice();
                model.addRow(c);
        }
        table.getSelectedRow();
        table.setModel(model);
        if (table.getRowCount() == 0) {
            table.add(tableRecordsStatus);
            table.setFillsViewportHeight(true);
            deleteMenu.setEnabled(false);
            modifyMenu.setEnabled(false);
        }
        else{
            deleteMenu.setEnabled(true);
            modifyMenu.setEnabled(true);
        }
    }

}