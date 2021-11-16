package Business;

import Business.Customer.Customer;
import Business.DeliveryPartner.DeliveryPartner;
import Business.Employee.Employee;
import Business.Menu.Menu;
import Business.Restaurant.Restaurant;
import Business.Role.CustomerRole;
import Business.Role.DeliverPartnerRole;
import Business.Role.ResturantAdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author akshatajadhav
 */
public class ConfigureASystem {
    
    public static FoodDeliverySystem configure(){
        
        FoodDeliverySystem system = FoodDeliverySystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin", "Test");
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("sysadmin");
        userAccount.setPassword("sysadmin");
        userAccount.setRole(new SystemAdminRole());
        UserAccount ua = system.getUserAccountDirectory().createUserAccount(userAccount);
        
        Customer customer = new Customer("test", "test@email", "888888", 0, "add", "testing");
        UserAccount uac = new UserAccount();
        uac.setUsername("testing");
        uac.setPassword("testing");
        uac.setRole(new CustomerRole());
        system.newCustomer(customer, userAccount);
        
        Restaurant restaurant = new Restaurant("restaurant","Indian", "t", "t", "85208520");
        Menu menu = new Menu("test", 100);
        restaurant.newItem(menu);
        Menu menu1 = new Menu("abc", 50);
        restaurant.newItem(menu1);
        UserAccount uar = new UserAccount("restaurant","restaurant",new ResturantAdminRole());
        system.newRestaurant(restaurant, uar);
        
        
        
        DeliveryPartner deliveryPartner = new DeliveryPartner("dp", "t", "tt", "tt@tmail", "85208520", 0);
        UserAccount uad = new UserAccount("dp", "dp", new DeliverPartnerRole());
        system.newDeliveryPartner(deliveryPartner, userAccount);
        
        return system;
    }
    
}
