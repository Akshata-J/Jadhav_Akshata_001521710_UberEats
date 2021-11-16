/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Customer.CustomerDirectory;
import Business.FoodDeliverySystem;

import Business.Organization;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.DeliveryPartner.DeliveryPartnerDirectory;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;

/**
 *
 * @author akshatajadhav
 */
public abstract class Role {
    
    public enum RoleType{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryPartner("Delivery"),
        SysAdmin("Sysadmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}