/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.login;

import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryPartner.DeliveryPartner;
import Business.FoodDeliverySystem;
import Business.Restaurant.Restaurant;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import userinterface.CustomerRole.CustomerJPanel;
import userinterface.DeliveryPartnerRole.DeliveryPartnerJPanel;
import userinterface.RestaurantAdminRole.RestaurantAdminJPanel;
import userinterface.SystemAdminRole.SysAdminJPanel;

/**
 *
 * @author akshatajadhav
 */
public class LoginJPanel extends javax.swing.JPanel {

    JLayeredPane mainLayeredPane;
    FoodDeliverySystem system;
    DB4OUtil dB4OUtil;
    /**
     * Creates new form LoginJPanel
     */
    public LoginJPanel(JLayeredPane mainLayeredPane, FoodDeliverySystem system) {
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));
        jPanel1.setBackground(new Color(0, 0, 0, 0));
        rolesRadioButton.add(customerRadioButton);
        rolesRadioButton.add(deliveryPartnerRadioButton);
        rolesRadioButton.add(restaurantRadioButton);
        rolesRadioButton.add(adminRadioButton);
        
        customerRadioButton.setActionCommand(Role.RoleType.Customer.getValue());
        deliveryPartnerRadioButton.setActionCommand(Role.RoleType.DeliveryPartner.getValue());
        restaurantRadioButton.setActionCommand(Role.RoleType.RestaurantAdmin.getValue());
        adminRadioButton.setActionCommand(Role.RoleType.SysAdmin.getValue());
        this.mainLayeredPane = mainLayeredPane;
        this.system = system;
    }
    
    public void displayPanel(JPanel panel) {
        SignPanel.removeAll();
        SignPanel.add(panel);
        SignPanel.repaint();
        SignPanel.revalidate();
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
        jPanel1 = new javax.swing.JPanel();
        SignPanel = new javax.swing.JLayeredPane();
        SignInPanel = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabelSignInButton = new javax.swing.JLabel();
        usernameSignInTextBox = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        passwordSignInTextBox = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        restaurantRadioButton = new javax.swing.JRadioButton();
        customerRadioButton = new javax.swing.JRadioButton();
        deliveryPartnerRadioButton = new javax.swing.JRadioButton();
        adminRadioButton = new javax.swing.JRadioButton();
        SignUpPanel = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        usernameSignUpTextBox = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        emailSignUpTextBox = new javax.swing.JTextField();
        passwordSignUpTextBox = new javax.swing.JPasswordField();
        jLabelSignInButton1 = new javax.swing.JLabel();
        mobileNumberSignUpTextBox = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        nameSignUpTextBox = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        tncLabel = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        addressSignUpTextBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SignPanel.setLayout(new java.awt.CardLayout());

        SignInPanel.setBackground(new java.awt.Color(255, 255, 255));
        SignInPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ClickedSignIn.png"))); // NOI18N
        SignInPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 130, 60));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SignUp.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        SignInPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 130, 60));

        jLabel15.setFont(new java.awt.Font("Berlin Sans FB", 1, 16)); // NOI18N
        jLabel15.setText("Password:");
        SignInPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 92, 34));

        jLabel16.setFont(new java.awt.Font("Berlin Sans FB", 1, 16)); // NOI18N
        jLabel16.setText("Username:");
        SignInPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 92, 34));

        jLabelSignInButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SignInPage.png"))); // NOI18N
        jLabelSignInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSignInButtonMouseClicked(evt);
            }
        });
        SignInPanel.add(jLabelSignInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        usernameSignInTextBox.setText("Enter Username");
        usernameSignInTextBox.setBorder(null);
        usernameSignInTextBox.setOpaque(false);
        usernameSignInTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameSignInTextBoxMouseClicked(evt);
            }
        });
        usernameSignInTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameSignInTextBoxActionPerformed(evt);
            }
        });
        SignInPanel.add(usernameSignInTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 368, 40));
        SignInPanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 368, 10));
        SignInPanel.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 368, 10));

        passwordSignInTextBox.setText("*************");
        passwordSignInTextBox.setBorder(null);
        passwordSignInTextBox.setOpaque(false);
        passwordSignInTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordSignInTextBoxMouseClicked(evt);
            }
        });
        SignInPanel.add(passwordSignInTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 368, 35));

        jLabel18.setFont(new java.awt.Font("Berlin Sans FB", 1, 16)); // NOI18N
        jLabel18.setText("Role:");
        SignInPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 92, 34));
        SignInPanel.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 368, 10));

        restaurantRadioButton.setText("Restaurant");
        SignInPanel.add(restaurantRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, 30));

        customerRadioButton.setText("Customer");
        SignInPanel.add(customerRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, 30));

        deliveryPartnerRadioButton.setText("Delivery Partner");
        SignInPanel.add(deliveryPartnerRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, -1, 30));

        adminRadioButton.setText("Admin");
        SignInPanel.add(adminRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, 30));

        SignPanel.add(SignInPanel, "card2");

        SignUpPanel.setBackground(new java.awt.Color(255, 255, 255));
        SignUpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ClickedSignUp.png"))); // NOI18N
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        SignUpPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 130, 60));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SignIn.png"))); // NOI18N
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        SignUpPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 130, 60));

        jLabel23.setFont(new java.awt.Font("Berlin Sans FB", 1, 16)); // NOI18N
        jLabel23.setText("Password:");
        SignUpPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 92, 34));

        jLabel24.setFont(new java.awt.Font("Berlin Sans FB", 1, 16)); // NOI18N
        jLabel24.setText("Username:");
        SignUpPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 92, 34));

        jLabel25.setFont(new java.awt.Font("Berlin Sans FB", 1, 16)); // NOI18N
        jLabel25.setText("Email:");
        SignUpPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 92, 34));

        usernameSignUpTextBox.setText("Enter Username");
        usernameSignUpTextBox.setBorder(null);
        usernameSignUpTextBox.setOpaque(false);
        usernameSignUpTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameSignUpTextBoxMouseClicked(evt);
            }
        });
        SignUpPanel.add(usernameSignUpTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 368, 40));
        SignUpPanel.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 368, 10));
        SignUpPanel.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 368, 10));
        SignUpPanel.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 368, 10));

        emailSignUpTextBox.setText("Enter Email");
        emailSignUpTextBox.setBorder(null);
        emailSignUpTextBox.setOpaque(false);
        emailSignUpTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailSignUpTextBoxMouseClicked(evt);
            }
        });
        SignUpPanel.add(emailSignUpTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 368, 40));

        passwordSignUpTextBox.setText("jPasswordField1");
        passwordSignUpTextBox.setBorder(null);
        passwordSignUpTextBox.setOpaque(false);
        passwordSignUpTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordSignUpTextBoxMouseClicked(evt);
            }
        });
        SignUpPanel.add(passwordSignUpTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 368, 40));

        jLabelSignInButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/SignUp.png"))); // NOI18N
        jLabelSignInButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSignInButton1MouseClicked(evt);
            }
        });
        SignUpPanel.add(jLabelSignInButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, -1, -1));

        mobileNumberSignUpTextBox.setText("Enter Mobile Number");
        mobileNumberSignUpTextBox.setBorder(null);
        mobileNumberSignUpTextBox.setOpaque(false);
        mobileNumberSignUpTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mobileNumberSignUpTextBoxMouseClicked(evt);
            }
        });
        SignUpPanel.add(mobileNumberSignUpTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 368, 40));

        jLabel26.setFont(new java.awt.Font("Berlin Sans FB", 1, 16)); // NOI18N
        jLabel26.setText("Mobile Number:");
        SignUpPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 140, 34));
        SignUpPanel.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 368, 10));

        nameSignUpTextBox.setText("Enter Name");
        nameSignUpTextBox.setBorder(null);
        nameSignUpTextBox.setOpaque(false);
        nameSignUpTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameSignUpTextBoxMouseClicked(evt);
            }
        });
        SignUpPanel.add(nameSignUpTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 368, 40));
        SignUpPanel.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 368, 10));

        jLabel29.setFont(new java.awt.Font("Berlin Sans FB", 1, 16)); // NOI18N
        jLabel29.setText("Name:");
        SignUpPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 92, 34));

        jCheckBox1.setText("Agree");
        SignUpPanel.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, -1));

        tncLabel.setText("<html> <body> <a href=\"https://www.google.com/\">Terms and Conditions</a> </body> </html>");
        tncLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tncLabelMouseClicked(evt);
            }
        });
        SignUpPanel.add(tncLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 150, 20));

        jLabel30.setFont(new java.awt.Font("Berlin Sans FB", 1, 16)); // NOI18N
        jLabel30.setText("Address:");
        SignUpPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 92, 34));
        SignUpPanel.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 368, 10));

        addressSignUpTextBox.setText("Enter Address");
        addressSignUpTextBox.setBorder(null);
        addressSignUpTextBox.setOpaque(false);
        addressSignUpTextBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressSignUpTextBoxMouseClicked(evt);
            }
        });
        SignUpPanel.add(addressSignUpTextBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 368, 40));

        SignPanel.add(SignUpPanel, "card2");

        jPanel1.add(SignPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 510, 680));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/x.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, -1, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/right.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 680, 720));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/left.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 710, 720));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1210, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        if(evt.getX()<120){
            displayPanel(SignInPanel);
        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        JFrame parentFrame = (JFrame) SwingUtilities.getRoot(this);//(JFrame)this.getParent().getParent().getParent();
        DB4OUtil.getInstance().storeSystem(system);
        parentFrame.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        if(evt.getX()>15){
            displayPanel(SignUpPanel);
        }
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabelSignInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignInButtonMouseClicked
        String username = usernameSignInTextBox.getText();
        String password = passwordSignInTextBox.getText();
        if(username.isEmpty() || password.isEmpty() || username.equals("Enter Username") || password.equals("*************")){
            JOptionPane.showMessageDialog(this, "Please provide username and password!", "Credential Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(rolesRadioButton.getSelection()==null){
            JOptionPane.showMessageDialog(this, "Please select a role!", "Role Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!system.getUserAccountDirectory().authenticateUser(username, password, rolesRadioButton.getSelection().getActionCommand())){
            JOptionPane.showMessageDialog(this, "Please provide correct username and password!", "Authentication Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(rolesRadioButton.getSelection().getActionCommand().equals(Role.RoleType.Customer.getValue())){
            Customer customer = system.getCustomerByUsername(username);
            CustomerJPanel cjp = new CustomerJPanel(mainLayeredPane,system, customer);
            displayMainPanel(cjp);
        }
        if(rolesRadioButton.getSelection().getActionCommand().equals(Role.RoleType.DeliveryPartner.getValue())){
            DeliveryPartner deliveryPartner = system.getDeliveryPartnerDirectory().getDeliveryPartner(username);
            DeliveryPartnerJPanel dpjp = new DeliveryPartnerJPanel(mainLayeredPane,system,deliveryPartner);
            displayMainPanel(dpjp);
        }
        if(rolesRadioButton.getSelection().getActionCommand().equals(Role.RoleType.RestaurantAdmin.getValue())){
            Restaurant restaurant = system.getRestaurantDirectory().getRestaurant(username);
            RestaurantAdminJPanel rajp = new RestaurantAdminJPanel(mainLayeredPane,system,restaurant);
            displayMainPanel(rajp);
        }
        if(rolesRadioButton.getSelection().getActionCommand().equals(Role.RoleType.SysAdmin.getValue())){
            SysAdminJPanel sajp = new SysAdminJPanel(mainLayeredPane,system, dB4OUtil);
            displayMainPanel(sajp);
        }
    }//GEN-LAST:event_jLabelSignInButtonMouseClicked

    private void usernameSignInTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameSignInTextBoxActionPerformed
        if(usernameSignInTextBox.getText().equals("Enter Username"))
            usernameSignInTextBox.setText("");
    }//GEN-LAST:event_usernameSignInTextBoxActionPerformed

    private void usernameSignInTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameSignInTextBoxMouseClicked
        if(usernameSignInTextBox.getText().equals("Enter Username"))
        usernameSignInTextBox.setText("");
    }//GEN-LAST:event_usernameSignInTextBoxMouseClicked

    private void passwordSignInTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordSignInTextBoxMouseClicked
        if(passwordSignInTextBox.getText().equals("*************"))
            passwordSignInTextBox.setText("");
    }//GEN-LAST:event_passwordSignInTextBoxMouseClicked

    private void usernameSignUpTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameSignUpTextBoxMouseClicked
        usernameSignUpTextBox.setText("");
    }//GEN-LAST:event_usernameSignUpTextBoxMouseClicked

    private void passwordSignUpTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordSignUpTextBoxMouseClicked
        passwordSignUpTextBox.setText("");
    }//GEN-LAST:event_passwordSignUpTextBoxMouseClicked

    private void nameSignUpTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameSignUpTextBoxMouseClicked
        nameSignUpTextBox.setText("");
    }//GEN-LAST:event_nameSignUpTextBoxMouseClicked

    private void mobileNumberSignUpTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileNumberSignUpTextBoxMouseClicked
        mobileNumberSignUpTextBox.setText("");
    }//GEN-LAST:event_mobileNumberSignUpTextBoxMouseClicked

    private void emailSignUpTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailSignUpTextBoxMouseClicked
        emailSignUpTextBox.setText("");
    }//GEN-LAST:event_emailSignUpTextBoxMouseClicked

    private void jLabelSignInButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSignInButton1MouseClicked
        
    }//GEN-LAST:event_jLabelSignInButton1MouseClicked

    private void tncLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tncLabelMouseClicked
        JEditorPane editorPane = new JEditorPane();
        JScrollPane scrollPane = new JScrollPane(editorPane);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(500, 500));
        try {
            editorPane.setPage(getClass().getResource("/resources/terms.html"));
        } catch (MalformedURLException ex) {
            Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, scrollPane, "Terms & Condition",
                JOptionPane.OK_OPTION, new ImageIcon(getClass().getResource("/resources/tnc.png")));
    }//GEN-LAST:event_tncLabelMouseClicked

    private void addressSignUpTextBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressSignUpTextBoxMouseClicked
        addressSignUpTextBox.setText("");
    }//GEN-LAST:event_addressSignUpTextBoxMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SignInPanel;
    private javax.swing.JLayeredPane SignPanel;
    private javax.swing.JPanel SignUpPanel;
    private javax.swing.JTextField addressSignUpTextBox;
    private javax.swing.JRadioButton adminRadioButton;
    private javax.swing.JRadioButton customerRadioButton;
    private javax.swing.JRadioButton deliveryPartnerRadioButton;
    private javax.swing.JTextField emailSignUpTextBox;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabelSignInButton;
    private javax.swing.JLabel jLabelSignInButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField mobileNumberSignUpTextBox;
    private javax.swing.JTextField nameSignUpTextBox;
    private javax.swing.JPasswordField passwordSignInTextBox;
    private javax.swing.JPasswordField passwordSignUpTextBox;
    private javax.swing.JRadioButton restaurantRadioButton;
    private javax.swing.ButtonGroup rolesRadioButton;
    private javax.swing.JLabel tncLabel;
    private javax.swing.JTextField usernameSignInTextBox;
    private javax.swing.JTextField usernameSignUpTextBox;
    // End of variables declaration//GEN-END:variables
}
