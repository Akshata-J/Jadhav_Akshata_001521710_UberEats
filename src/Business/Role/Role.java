/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;


/**
 *
 * @author akshatajadhav
 */
public abstract class Role {
    
    public enum RoleType{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryPartner("DeliveryPartner"),
        SysAdmin("SysAdmin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }    
}