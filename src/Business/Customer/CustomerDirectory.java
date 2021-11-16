/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author akshatajadhav
 */
public class CustomerDirectory {
    
    private HashMap<String,Customer> customerDirectory;
    
    public CustomerDirectory() {
        customerDirectory = new HashMap<>();
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return new ArrayList<>(customerDirectory.values());
    }
    
    public Customer addCustomer(Customer customer){
        customerDirectory.put(customer.getUserName(),customer);
        return customer;
    }
    
    public Customer modifyCustomer(Customer customer){
        customerDirectory.put(customer.getUserName(),customer);
        return customer;
    }
    
    public void removeCustomer(Customer customer){
        customerDirectory.remove(customer.getUserName());
    }
    
    public void removeCustomer(String username){
        customerDirectory.remove(username);
    }
    
    public Customer getCustomer(String username){
        return customerDirectory.get(username);
    }
    
}
