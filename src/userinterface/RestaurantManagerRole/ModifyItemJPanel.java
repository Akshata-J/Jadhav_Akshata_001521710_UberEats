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

/**
 *
 * @author akshatajadhav
 */
public class ModifyItemJPanel extends javax.swing.JPanel {

    FoodDeliverySystem system;
    Restaurant restaurant;
    JLayeredPane restaurantTaskLayer;
    String itemName;
    /**
     * Creates new form SysAdminManageCustomersJPanel
     */
    public ModifyItemJPanel(JLayeredPane restaurantTaskLayer, FoodDeliverySystem system, Restaurant restaurant, String itemName) {
        initComponents();
        this.restaurantTaskLayer=restaurantTaskLayer;
        this.system = system;
        this.restaurant = restaurant;
        this.itemName = itemName;
        itemNameText.setText(itemName);
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

        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        submitButton = new javax.swing.JButton();
        itemNameText = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        priceText = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Modify Item");

        submitButton.setBackground(new java.awt.Color(92, 184, 92));
        submitButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("SUBMIT");
        submitButton.setBorder(null);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        itemNameText.setEditable(false);
        itemNameText.setBorder(null);
        itemNameText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemNameTextMouseClicked(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Berlin Sans FB", 1, 16)); // NOI18N
        jLabel26.setText("Price ($):");

        priceText.setBorder(null);
        priceText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                priceTextMouseClicked(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Berlin Sans FB", 1, 16)); // NOI18N
        jLabel29.setText("Item Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(itemNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(itemNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
   
        String price = priceText.getText();
        
        if(price.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Please provide price of a item", "Empty Text Feilds", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Double priceOfItem = utils.Utils.doubleFromString(price);
        if(priceOfItem==null){
            JOptionPane.showMessageDialog(this, "Please provide correct price of a item", "Wrong price", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Menu menu = new Menu();
        menu.setItemName(itemName);
        menu.setPrice(priceOfItem);
        
        restaurant.updateItem(menu);
        system.getRestaurantDirectory().updateRestaurant(restaurant);
        
        
        JOptionPane.showMessageDialog(this, "Item updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        ManageMenuJPanel mmjp = new ManageMenuJPanel(restaurantTaskLayer, system, restaurant);
        displayRestaurantTaskPanel(mmjp);
    }//GEN-LAST:event_submitButtonActionPerformed

    private void itemNameTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemNameTextMouseClicked
        
    }//GEN-LAST:event_itemNameTextMouseClicked

    private void priceTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_priceTextMouseClicked
        
    }//GEN-LAST:event_priceTextMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField itemNameText;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField priceText;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
