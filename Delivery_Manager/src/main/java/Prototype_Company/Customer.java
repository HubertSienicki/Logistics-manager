/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype_Company;

/**
 *
 * @author kneiv
 */
public class Customer {
    
    private String firstname;
    private String lastname;
    private String phone;
    private String address;
    private int CustomerID;

    public Customer(String phone, String address, int ID, String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.address = address;
        this.CustomerID = ID;
    }

    public void Update(String phone, String adress, int ID)
    {   
        this.CustomerID = ID;
        this.address = address;
        this.phone = phone;
    }    
  
    
    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getID() {
        return CustomerID;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setID(int ID) {
        this.CustomerID = ID;
    }
    
    
            
    }
