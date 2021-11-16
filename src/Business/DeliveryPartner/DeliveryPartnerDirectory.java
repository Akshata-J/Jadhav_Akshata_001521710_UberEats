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
    private HashMap<String, DeliveryPartner> deliveryManDirectory;
    
    public DeliveryPartnerDirectory() {
        deliveryManDirectory = new HashMap();
    }

    public ArrayList<DeliveryPartner> getDeliveryPartnerDirectory() {
        return new ArrayList<>(deliveryManDirectory.values());
    }
    
    public DeliveryPartner addDeliveryPartner(DeliveryPartner deliveryPartner) {
        deliveryManDirectory.put(deliveryPartner.getName(), deliveryPartner);
        return deliveryPartner;
    }
    
    public void removeDeliveryMan(DeliveryPartner deliveryMan) {
        deliveryManDirectory.remove(deliveryMan);
    }
}
