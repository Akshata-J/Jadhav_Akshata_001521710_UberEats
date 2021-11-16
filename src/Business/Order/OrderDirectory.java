/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author akshatajadhav
 */
public class OrderDirectory {
    private ArrayList<Order> orderDirectory;
    
    public OrderDirectory() {
        orderDirectory = new ArrayList<>();
    }

    public ArrayList<Order> getOrderDirectory() {
        return orderDirectory;
    }
    
//    public Order getOrderId(String id){
//        return orderDirectory.get(id);
//    }
    
    public Order newOrder(Order order){
        orderDirectory.add(order);
        return order;
    }
    
}
