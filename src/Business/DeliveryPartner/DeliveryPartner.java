/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryPartner;

import java.util.Date;

/**
 *
 * @author akshatajadhav
 */
public class DeliveryPartner {
    private String username;
    private String name;
    private String address;
    private String email;
    private long phoneNumber;
    private Date dob;
    private boolean available;
    
    public DeliveryPartner(String username, String name, String address, String email, long phoneNumber, Date dob) {
        this.username = username;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.available = true;
    }

    public DeliveryPartner() {
        this.available = true;
     }

    public Date getDateOfBirth() {
        return dob;
    }

    public void setDateOfBirth(Date dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
