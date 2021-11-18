/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author akshatajadhav
 */
public class MenuDirectory {
    private HashMap<String,Menu> menuDirectory;
    
    public MenuDirectory() {
        menuDirectory = new HashMap<>();
    }

    public ArrayList<Menu> getMenuDirectory() {
        return new ArrayList<>(menuDirectory.values());
    }
    
    public Menu newItem(Menu menu) {
        menuDirectory.put(menu.getItemName(),menu);
        return menu;
    }
    public Menu updateItem(Menu menu) {
        menuDirectory.put(menu.getItemName(),menu);
        return menu;
    }
    
    public ArrayList<String> getItemNames() {
        return new ArrayList<>(menuDirectory.keySet());
    }
    
    public void removeMenu(String itemName) {
        menuDirectory.remove(itemName);
    }
}
