/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Customer.Customer;
import Business.DeliveryPartner.DeliveryPartner;
import Business.Menu.Menu;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author akshatajadhav
 */
public class Order extends WorkRequest {
    
    private String orderId;
    private String orderStatus;
    private Restaurant restaurant;
    private Customer customer;
    private DeliveryPartner deliveryPartner;
    private List<Item> items;
    private double total;
    private int rating;
    private String feedback;

    public Order() {
        items = new ArrayList<>();
        deliveryPartner = new DeliveryPartner();
        rating=0;
        feedback="Yet to provide!";
    }
    
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public DeliveryPartner getDeliveryPartner() {
        return deliveryPartner;
    }

    public void setDeliveryPartner(DeliveryPartner deliveryPartner) {
        this.deliveryPartner = deliveryPartner;
    }
    
    public List<Item> getItems(){
        return items;
    }
    
    public void addItem(Menu menu, int quantity){
        Item i = new Item();
        i.setItemName(menu.getItemName());
        i.setPrice(menu.getPrice());
        i.setQuantity(quantity);
        items.add(i);
        total = menu.getPrice() * quantity;
    }

    public double getTotal() {
        return total;
    }
    
    public String getItemsAsString(){
        List<String> itemString=new ArrayList<>();
        for(Item i:items){
            itemString.add(i.getItemName()+"("+i.getQuantity()+")");
        }
        return String.join(",", itemString);
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    @Override
    public String toString() {
        return orderId;
    }
    
}
