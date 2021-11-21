/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Menu.Menu;
import Business.Menu.MenuDirectory;
import java.util.ArrayList;

/**
 *
 * @author akshatajadhav
 */
public class Restaurant {
    private String username;
    private String restaurantName;
    private String address;
    private String cuisine;
    private String website;
    private String managerName;
    private long phoneNumber;
    private MenuDirectory menuDirectory;
    
//    public Restaurant(String username, String restaurantName,String website, String address, String managerName, long phoneNumber) {
//        this.restaurantName = restaurantName;
//        this.address = address;
//        this.managerName = managerName;
//        this.phoneNumber = phoneNumber;
//        this.website = website;
//        this.username = username;
//        menuDirectory = new MenuDirectory();
//    }

    public Restaurant(String username, String restaurantName, String address, String cuisine, String website, String managerName, long phoneNumber) {
        this.username = username;
        this.restaurantName = restaurantName;
        this.address = address;
        this.cuisine = cuisine;
        this.website = website;
        this.managerName = managerName;
        this.phoneNumber = phoneNumber;
        
        menuDirectory = new MenuDirectory();
    }
    
    

    public ArrayList<Menu> getMenu() {
        return menuDirectory.getMenuDirectory();
    }
    
    public MenuDirectory getMenuDirectory() {
        return menuDirectory;
    }

//    public String getDescription() {
//        return website;
//    }
//
//    public void setDescription(String description) {
//        this.website = description;
//    }

    public Menu newItem(Menu menu) {
        menuDirectory.newItem(menu);
        return menu;
    }
    public void updateItem(Menu menu) {
        menuDirectory.updateItem(menu);
    }
    
    public void removeMenu(String itemName) {
        menuDirectory.removeMenu(itemName);
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
    
    @Override
    public String toString() {
        return restaurantName;
    }

    
}
