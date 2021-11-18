package Business;

import Business.Customer.Customer;
import Business.DeliveryPartner.DeliveryPartner;
import Business.Menu.Menu;
import Business.Restaurant.Restaurant;
import Business.Role.CustomerRole;
import Business.Role.DeliverPartnerRole;
import Business.Role.ResturantAdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author akshatajadhav
 */
public class ConfigureASystem {
    
    public static FoodDeliverySystem configure(){
        
        FoodDeliverySystem system = new FoodDeliverySystem();
        
        
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("sysadmin");
        userAccount.setPassword("sysadmin");
        userAccount.setRole(new SystemAdminRole());
        UserAccount ua = system.getUserAccountDirectory().createUserAccount(userAccount);
        
        Customer customer = new Customer("test", "test@email", 888888, new Date(), "add", "testing");
        UserAccount uac = new UserAccount();
        uac.setUsername("testing");
        uac.setPassword("testing");
        uac.setRole(new CustomerRole());
        system.newCustomer(customer, uac);
        
        Restaurant restaurant = new Restaurant("restaurant","restaurant","Indian", "t", "t", 85208520);
        Menu menu = new Menu("test", 100);
        restaurant.newItem(menu);
        Menu menu1 = new Menu("abc", 50);
        restaurant.newItem(menu1);
        UserAccount uar = new UserAccount("restaurant","restaurant",new ResturantAdminRole());
        system.newRestaurant(restaurant, uar);
        
        Restaurant restaurant1 = new Restaurant("restaurant11","restaurant11","Indian", "t", "t", 85208520);
        Menu menu11 = new Menu("test", 100);
        restaurant1.newItem(menu11);
        Menu menu111 = new Menu("abc", 50);
        restaurant1.newItem(menu111);
        UserAccount uar1 = new UserAccount("restaurant11","restaurant11",new ResturantAdminRole());
        system.newRestaurant(restaurant1, uar1);
        
        
        DeliveryPartner deliveryPartner = new DeliveryPartner("dp", "t", "tt", "tt@tmail", 85208520, new Date());
        UserAccount uad = new UserAccount("dp", "dp", new DeliverPartnerRole());
        system.newDeliveryPartner(deliveryPartner, uad);
        return system;
    }
    
}
