/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryPartner;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author akshatajadhav
 */
public class DeliveryPartnerDirectory {
    private HashMap<String, DeliveryPartner> deliveryPartnerDirectory;
    
    public DeliveryPartnerDirectory() {
        deliveryPartnerDirectory = new HashMap();
    }

    public ArrayList<DeliveryPartner> getDeliveryPartnerDirectory() {
        return new ArrayList<>(deliveryPartnerDirectory.values());
    }
    
    public DeliveryPartner addDeliveryPartner(DeliveryPartner deliveryPartner) {
        deliveryPartnerDirectory.put(deliveryPartner.getUsername(),deliveryPartner);
        return deliveryPartner;
    }
    
    public DeliveryPartner getDeliveryPartner(String username){
        return deliveryPartnerDirectory.get(username);
    }
    
    public void modifyDeliveryPartner(DeliveryPartner deliveryPartner){
        deliveryPartnerDirectory.put(deliveryPartner.getUsername(),deliveryPartner);
    }
    
    public boolean isUsernameUnique(String s) {
        return !deliveryPartnerDirectory.containsKey(s);
    }
    
    public void removeDeliveryPartner(String username) {
        deliveryPartnerDirectory.remove(username);
    }
}
