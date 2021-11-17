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
import Business.Employee.Employee;
import Business.Menu.MenuDirectory;
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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akshatajadhav
 */
public class FoodDeliverySystem extends Organization{
    
    private static FoodDeliverySystem business;
    private RestaurantDirectory restaurantDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryPartnerDirectory deliveryPartnerDirectory;
    private OrderDirectory orderDirectory;
    private MenuDirectory menuDirectory;

    public FoodDeliverySystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryPartnerDirectory deliveryPartnerDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryPartnerDirectory = deliveryPartnerDirectory;
        
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

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    public MenuDirectory getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(MenuDirectory menuDirectory) {
        this.menuDirectory = menuDirectory;
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

    public void setDeliveryManDirectory(DeliveryPartnerDirectory deliveryPartnerDirectory) {
        this.deliveryPartnerDirectory = deliveryPartnerDirectory;
    }
    
    
    
    public static FoodDeliverySystem getInstance(){
        if(business==null){
            business=new FoodDeliverySystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private FoodDeliverySystem(){
        super(null);
        customerDirectory = new CustomerDirectory();
        restaurantDirectory = new RestaurantDirectory();
        deliveryPartnerDirectory = new DeliveryPartnerDirectory();
        menuDirectory = new MenuDirectory();
        orderDirectory = new OrderDirectory();
        
       // networkList=new ArrayList<Network>();
    }

    
    public void newCustomer(Customer customer, UserAccount userAccount){
        userAccount.setRole(new CustomerRole());
        customerDirectory.addCustomer(customer);
        this.getUserAccountDirectory().createUserAccount(userAccount);
    }
    
    public void newEmployee(Employee employee, UserAccount userAccount){
        userAccount.setRole(new SystemAdminRole());
        this.getEmployeeDirectory().newEmployee(employee);
        this.getUserAccountDirectory().createUserAccount(userAccount);
    }
    
    public void newRestaurant(Restaurant restaurant, UserAccount userAccount){
        userAccount.setRole(new ResturantAdminRole());
        restaurantDirectory.newRestaurant(restaurant);
        this.getUserAccountDirectory().createUserAccount(userAccount);
    }
    
    public void newDeliveryPartner(DeliveryPartner deliveryPartner, UserAccount userAccount){
        userAccount.setRole(new DeliverPartnerRole());
        deliveryPartnerDirectory.addDeliveryPartner(deliveryPartner);
        this.getUserAccountDirectory().createUserAccount(userAccount);
    }

    
}
