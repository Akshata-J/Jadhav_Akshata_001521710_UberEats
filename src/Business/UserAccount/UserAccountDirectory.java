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
    
    public UserAccount authenticateUser(String username, String password){
        if (userAccountList.containsKey(username) && userAccountList.get(username).getPassword().equals(password)){
            return userAccountList.get(username);
        }
        return null;
    }
    
    public UserAccount createUserAccount(UserAccount userAccount){
        userAccountList.put(userAccount.getUsername(),userAccount);
        return userAccount;
    }
    
    public ArrayList<String> usernames(){
        return new ArrayList<>(userAccountList.keySet());
    }
}
