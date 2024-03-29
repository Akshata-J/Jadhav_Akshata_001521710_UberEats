/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantManagerRole;

import Business.FoodDeliverySystem;
import Business.Order.Order;
import Business.Restaurant.Restaurant;
import java.awt.Component;
import userinterface.CustomerRole.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.CellRendererPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author akshatajadhav
 */
public class CompletedOrderHistoryJPanel extends javax.swing.JPanel {

    FoodDeliverySystem system;
    Restaurant restaurant;
    JLayeredPane restaurantTaskLayer;
    /**
     * Creates new form SysAdminManageCustomersJPanel
     */
    public CompletedOrderHistoryJPanel(JLayeredPane restaurantTaskLayer, FoodDeliverySystem system, Restaurant restaurant) {
        initComponents();
        this.restaurantTaskLayer=restaurantTaskLayer;
        this.system = system;
        this.restaurant = restaurant;
        tableRecordsStatus.setSize(tableRecordsStatus.getPreferredSize());
        orderHistory.getColumn("Rating").setCellRenderer(new CellRenderer());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        orderHistory = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        totalSales = new javax.swing.JLabel();

        tableRecordsStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tableRecordsStatus.setText("No orders history available!");

        setBackground(new java.awt.Color(255, 255, 255));

        orderHistory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Items", "Total Price ($)", "Feedback", "Rating"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderHistory);
        if (orderHistory.getColumnModel().getColumnCount() > 0) {
            orderHistory.getColumnModel().getColumn(0).setResizable(false);
            orderHistory.getColumnModel().getColumn(0).setPreferredWidth(3);
            orderHistory.getColumnModel().getColumn(1).setResizable(false);
            orderHistory.getColumnModel().getColumn(1).setPreferredWidth(200);
            orderHistory.getColumnModel().getColumn(2).setResizable(false);
            orderHistory.getColumnModel().getColumn(2).setPreferredWidth(15);
            orderHistory.getColumnModel().getColumn(3).setResizable(false);
            orderHistory.getColumnModel().getColumn(3).setPreferredWidth(100);
            orderHistory.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Order History!");

        totalSales.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalSales.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(totalSales, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalSales, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    class CellRenderer implements TableCellRenderer{
 
        @Override
        public Component getTableCellRendererComponent(JTable table,
                Object value,
                boolean isSelected,
                boolean hasFocus,
                int row,
                int column) {
 
            TableColumn tb = orderHistory.getColumn("Rating");
            orderHistory.setRowHeight(20);
 
            return (Component) value;
        }
 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderHistory;
    private javax.swing.JLabel tableRecordsStatus;
    private javax.swing.JLabel totalSales;
    // End of variables declaration//GEN-END:variables
    private void populateTable() {
        JTable table = orderHistory;
        int rowCount = table.getRowCount();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        int total = 0;
        
        for (Order o : system.getOrdersByRestaurant(restaurant)) {
            if(!o.getOrderStatus().equalsIgnoreCase("Order Placed") &&
                    !o.getOrderStatus().equalsIgnoreCase("Order Accepted") &&
                        !o.getOrderStatus().equalsIgnoreCase("Order cancelled by restaurant")&&
                            !o.getOrderStatus().equalsIgnoreCase("Order cancelled")){
                Object[] c = new Object[5];
                c[0] = o.getOrderId();
                c[1] = o.getItemsAsString();
                c[2] = o.getTotal();
                c[3] = o.getFeedback();
                JLabel t = new JLabel();
                String stars = "/resources/sstar"+(o.getRating())+".png";
                t.setIcon(new ImageIcon(getClass().getResource(stars)));
                c[4] = t;
                model.addRow(c);
                total+=o.getTotal();
            }
        }
        table.getSelectedRow();
        table.setModel(model);
        if (table.getRowCount() == 0) {
            table.add(tableRecordsStatus);
            table.setFillsViewportHeight(true);
            totalSales.setText("Total Sales: $0  ");
        }else{
            totalSales.setText("Total Sales: $"+total+"  ");
        }
    }

}
