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
        restaurantDirectory.put(restaurant.getUsername(), restaurant);
        return restaurant;
    }
    
    public Restaurant updateRestaurant(Restaurant restaurant) {
        if(!restaurantDirectory.containsKey(restaurant.getUsername())){
            return null;
        }
        restaurantDirectory.put(restaurant.getUsername(), restaurant);
        return restaurant;
    }
    
    public boolean isRestaurantNameUnique(String username){
        return !restaurantDirectory.containsKey(username);
    }
    
    public void removeRestaurant(Restaurant restaurant){
        restaurantDirectory.remove(restaurant.getUsername());
    }
    
    public void removeRestaurant(String restaurantName){
        restaurantDirectory.remove(restaurantName);
    }
   
    
    public Restaurant getRestaurant(String username) {
        return restaurantDirectory.get(username);
    }

    @Override
    public String toString() {
        return "RestaurantDirectory{" + "restaurantDirectory=" + restaurantDirectory + '}';
    }
    
}
