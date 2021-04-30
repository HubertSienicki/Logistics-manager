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
public class Deliverer extends Employee {
    
    private Car c1;

    public Deliverer(Car c1, String firstname, String lastname, int ID, String phone) {
        super(firstname, lastname, ID, phone);
        this.c1 = c1;
    }

    
    
    
}
