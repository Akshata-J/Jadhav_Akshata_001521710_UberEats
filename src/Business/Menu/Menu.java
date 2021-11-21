/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

/**
 *
 * @author akshatajadhav
 */
public class Menu {
    private String itemName;
    private double price;
    
    public Menu(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
    }

    public Menu() {
        
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return itemName;
    }
    
    
    
}
