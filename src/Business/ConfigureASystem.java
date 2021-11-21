package Business;

import Business.Customer.Customer;
import Business.DeliveryPartner.DeliveryPartner;
import Business.Menu.Menu;
import Business.Restaurant.Restaurant;
import Business.Role.CustomerRole;
import Business.Role.DeliverPartnerRole;
import Business.Role.RestaurantManagerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.Date;
import userinterface.RestaurantManagerRole.RestaurantManagerJPanel;

/**
 *
 * @author akshatajadhav
 */
public class ConfigureASystem {
    
    public static FoodDeliverySystem configure(){
        
        FoodDeliverySystem system = new FoodDeliverySystem();
        
        UserAccount userAccount = new UserAccount("Admin","admin",new SystemAdminRole());
        system.getUserAccountDirectory().createUserAccount(userAccount);
        
        Customer customer = new Customer("Bruce Wayne", "wayneE@gmail.com", 5647836254l, new Date(), "Gotham", "Bruce");
        UserAccount uac = new UserAccount("Bruce","bruce",new CustomerRole());
        system.newCustomer(customer, uac);
        
        Customer customer1 = new Customer("Alfred Pennyworth", "alfred@gmail.com", 8765322232l, new Date(), "Boston", "Alfred");
        UserAccount uac1 = new UserAccount("Alfred","alfred",new CustomerRole());
        system.newCustomer(customer1, uac1);
        
        Restaurant restaurant = new Restaurant("restaurant1","Mainland China","Copley, Boston", "Chinese", "www.mainlandchina.com", "Raju", 9885208520l);
        restaurant.newItem(new Menu("Pan Fried Noodles", 45));
        restaurant.newItem(new Menu("Siu Mai Dumplings", 30));
        restaurant.newItem(new Menu("Prawns cheung feung", 40));
        UserAccount uar = new UserAccount("restaurant1","restaurant1",new RestaurantManagerRole());
        system.newRestaurant(restaurant, uar);
        
        Restaurant restaurant1 = new Restaurant("restaurant2","FC Road Socials", "Newbury Street, Boston", "Continental, Indian", "www.fcroadSocials.com", "Rakesh", 8520852045l);
        restaurant1.newItem(new Menu("Devil Dumplings", 30));
        restaurant1.newItem(new Menu("Eggs Kejriwal", 20));
        restaurant1.newItem(new Menu("Berry Pulaao", 35));
        UserAccount uar1 = new UserAccount("restaurant2","restaurant2",new RestaurantManagerRole());
        system.newRestaurant(restaurant1, uar1);
        
        Restaurant restaurant2 = new Restaurant("restaurant3", "Naple Staples", "Boylston, Boston", "Italian", "www.naplestaples.com", "Janhavi", 656473897l);
        restaurant2.newItem(new Menu("Aglio Olio", 30));
        restaurant2.newItem(new Menu("Lasagna", 35));
        restaurant2.newItem(new Menu("Potato Wedges", 15));
        restaurant2.newItem(new Menu("Penne Arabiata", 25));
        UserAccount uar2 = new UserAccount("restaurant3", "restaurant3", new RestaurantManagerRole());
        system.newRestaurant(restaurant2, uar2);
        
        DeliveryPartner deliveryPartner = new DeliveryPartner("dp1", "Suresh", "Boston", "suresh@gmail.com", 7885208520l, new Date());
        UserAccount uad = new UserAccount("dp1", "dp1", new DeliverPartnerRole());
        system.newDeliveryPartner(deliveryPartner, uad);
        
        DeliveryPartner deliveryPartner1 = new DeliveryPartner("dp2", "Shikha", "Boston", "shikha@yahoo.com", 5647389876l, new Date());
        UserAccount uad1 = new UserAccount("dp2", "dp2", new DeliverPartnerRole());
        system.newDeliveryPartner(deliveryPartner1, uad1);
        
        System.out.println(restaurant.getUsername());
        System.out.println(system.getUserAccountDirectory());
        
        return system;
        
    }
    
}
