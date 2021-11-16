/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryPartner;

/**
 *
 * @author akshatajadhav
 */
public class DeliveryPartner {
    private String username;
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private int age;
    
    public DeliveryPartner(String username, String name, String address, String email, String phoneNumber, int age) {
        this.username = username;
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
