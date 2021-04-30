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
public class Employee {
   
    private String firstname;
    private String lastname;
    private int EmployeeID;
    private String phone;

    public Employee(String firstname, String lastname, int ID, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.EmployeeID = ID;
        this.phone = phone;
    }

    

    public int getID() {
        return EmployeeID;
    }

    public String getPhone() {
        return phone;
    }

    public void setID(int ID) {
        this.EmployeeID = ID;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    
    
}
