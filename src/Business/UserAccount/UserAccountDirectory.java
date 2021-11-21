/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author akshatajadhav
 */
public class UserAccountDirectory {
    
    private HashMap<String,UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new HashMap<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return new ArrayList<>(userAccountList.values());
    }
    
    public boolean authenticateUser(String username, String password, String role){
        if (userAccountList.containsKey(username) && 
              userAccountList.get(username).getPassword().equals(password) && 
                userAccountList.get(username).getRole().toString().equals(role)){
            return true;
        }
        return false;
    }
    
    public void removeUserAccount(String username){
        
            userAccountList.remove(username);
    }
    
    public UserAccount createUserAccount(UserAccount userAccount){
        userAccountList.put(userAccount.getUsername(),userAccount);
        return userAccount;
    }
    
    public ArrayList<String> usernames(){
        return new ArrayList<>(userAccountList.keySet());
    }

    public boolean isUsernameUnique(String username){
        return !userAccountList.containsKey(username);
    }
    
    @Override
    public String toString() {
        return "UserAccountDirectory{" + "userAccountList=" + userAccountList + '}';
    }
}
