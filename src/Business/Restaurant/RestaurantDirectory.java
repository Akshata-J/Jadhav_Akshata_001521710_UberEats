/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author akshatajadhav
 */
public class RestaurantDirectory {
    
    private HashMap<String, Restaurant> restaurantDirectory;
    
    public RestaurantDirectory() {
        restaurantDirectory = new HashMap();
    }

    public ArrayList<Restaurant> getRestaurantDirectory() {
        return new ArrayList<>(restaurantDirectory.values());
    }
    

    
    public Restaurant newRestaurant(Restaurant restaurant) {
        restaurantDirectory.put(restaurant.getRestaurantName(), restaurant);
        return restaurant;
    }
    
    public void removeRestaurant(Restaurant restaurant){
        restaurantDirectory.remove(restaurant.getRestaurantName());
    }
    
    public void removeRestaurant(String restaurantName){
        restaurantDirectory.remove(restaurantName);
    }
    
    public Restaurant getRestaurant(String name) {
        return restaurantDirectory.get(name);
    }
    
}
