/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author akshatajadhav
 */
public class MenuDirectory {
    private ArrayList<Menu> menuDirectory;
    
    public MenuDirectory() {
        menuDirectory = new ArrayList();
    }

    public ArrayList<Menu> getMenuDirectory() {
        return menuDirectory;
    }
    
    public Menu newItem(Menu menu) {
        menuDirectory.add(menu);
        return menu;
    }
    
    public void removeMenu(Menu menu) {
        menuDirectory.remove(menu);
    }
}
