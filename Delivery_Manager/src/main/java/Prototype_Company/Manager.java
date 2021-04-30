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
public class Manager extends Employee {

   private int ManagerID;

    public Manager(int ManagerID, String firstname, String lastname, int ID, String phone) {
        super(firstname, lastname, ID, phone);
        this.ManagerID = ManagerID;
    }

    public int getManagerID() {
        return ManagerID;
    }

    public void setManagerID(int ManagerID) {
        this.ManagerID = ManagerID;
    }

    @Override
    public String toString() {
        return "Manager{" + "ManagerID=" + ManagerID + '}';
    }

    
   
    
}
