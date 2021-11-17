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
    private String restaurantName;
    private String address;
    private String description;
    private String managerName;
    private String phoneNumber;
    private MenuDirectory menuDirectory;
    
    public Restaurant(String restaurantName,String description, String address, String managerName, String phoneNumber) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.managerName = managerName;
        this.phoneNumber = phoneNumber;
        this.description = description;
        menuDirectory = new MenuDirectory();
    }

    public ArrayList<Menu> getMenu() {
        return menuDirectory.getMenuDirectory();
    }
    
    public MenuDirectory getMenuDirectory() {
        return menuDirectory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Menu newItem(Menu menu) {
        menuDirectory.newItem(menu);
        return menu;
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

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public String toString() {
        return restaurantName;
    }

    
}
