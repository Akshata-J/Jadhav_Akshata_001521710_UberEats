/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryPartner.DeliveryPartner;
import Business.DeliveryPartner.DeliveryPartnerDirectory;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.CustomerRole;
import Business.Role.DeliverPartnerRole;
import Business.Role.ResturantAdminRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akshatajadhav
 */
public class FoodDeliverySystem {
    
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryPartnerDirectory deliveryPartnerDirectory;
    private OrderDirectory orderDirectory;
    private UserAccountDirectory userAccountDirectory;

    public FoodDeliverySystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryPartnerDirectory deliveryPartnerDirectory, UserAccountDirectory userAccountDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryPartnerDirectory = deliveryPartnerDirectory;
        this.userAccountDirectory = this.userAccountDirectory;
        
    }
    
    
    
    public FoodDeliverySystem(){
        customerDirectory = new CustomerDirectory();
        restaurantDirectory = new RestaurantDirectory();
        deliveryPartnerDirectory = new DeliveryPartnerDirectory();
        orderDirectory = new OrderDirectory();
        userAccountDirectory = new UserAccountDirectory();
    }


    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }
    
    public List<Order> getOrdersOfCustomer(Customer customer) {
        List<Order> orders = new ArrayList<>();
        if(orderDirectory.getOrderDirectory()==null)
            return orders;
        for(Order o: orderDirectory.getOrderDirectory()){
            if(o.getCustomer().equals(customer)){
                orders.add(o);
            }
        }
        return orders;
    }
    public List<Order> getOrdersByRestaurant(Restaurant restaurant) {
        List<Order> orders = new ArrayList<>();
        for(Order o: orderDirectory.getOrderDirectory()){
            if(o.getRestaurant().equals(restaurant)){
                orders.add(o);
            }
        }
        return orders;
    }
    
    public Order getOrderById(String id) {
        Order order = null;
        for(Order o: orderDirectory.getOrderDirectory()){
            if(o.getOrderId().equals(id)){
                order=o;
                break;
            }
        }
        return order;
    }
    
    public List<Order> getOrderByDeliveryPartner(DeliveryPartner deliveryPartner) {
        List<Order> orders = new ArrayList<>();
        for(Order o: orderDirectory.getOrderDirectory()){
            if(o.getDeliveryPartner().equals(deliveryPartner)){
                orders.add(o);
            }
        }
        return orders;
    }
    
    public Restaurant getRestaurantByObj(Restaurant restaurant) {
        Restaurant res = null;
        for(Restaurant r: restaurantDirectory.getRestaurantDirectory()){
            if(r.equals(restaurant)){
                res=r;
                break;
            }
        }
        return res;
    }
    
    public Customer getCustomerByUsername(String username) {
        Customer customer = null;
        for(Customer o: customerDirectory.getCustomerDirectory()){
            if(o.getUserName().equals(username)){
                customer=o;
                break;
            }
        }
        return customer;
    }

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    

    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryPartnerDirectory getDeliveryPartnerDirectory() {
        return deliveryPartnerDirectory;
    }

    public void setDeliveryPartnerDirectory(DeliveryPartnerDirectory deliveryPartnerDirectory) {
        this.deliveryPartnerDirectory = deliveryPartnerDirectory;
    }
    
    public void newCustomer(Customer customer, UserAccount userAccount){
        userAccount.setRole(new CustomerRole());
        customerDirectory.addCustomer(customer);
        userAccountDirectory.createUserAccount(userAccount);
    }
    
    public void newRestaurant(Restaurant restaurant, UserAccount userAccount){
        userAccount.setRole(new ResturantAdminRole());
        restaurantDirectory.newRestaurant(restaurant);
        userAccountDirectory.createUserAccount(userAccount);
    }
    
    public void newDeliveryPartner(DeliveryPartner deliveryPartner, UserAccount userAccount){
        userAccount.setRole(new DeliverPartnerRole());
        deliveryPartnerDirectory.addDeliveryPartner(deliveryPartner);
        userAccountDirectory.createUserAccount(userAccount);
    }
    
    public void removeCustomer(String username){
        customerDirectory.removeCustomer(username);
        userAccountDirectory.removeUserAccount(username);
    }
    
    public void removeDeliveryPartner(String username){
        deliveryPartnerDirectory.removeDeliveryPartner(username);
        userAccountDirectory.removeUserAccount(username);
    }
    
    public void removeRestaurant(String username){
        restaurantDirectory.removeRestaurant(username);
        userAccountDirectory.removeUserAccount(username);
    }

    
}
