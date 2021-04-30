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
public class Car {
    private String model;
    private String registration;
    private boolean repairing;
    private int CarID;

    public Car(String model, String registration, boolean repairing, int CarID) {
        this.model = model;
        this.registration = registration;
        this.repairing = repairing;
        this.CarID = CarID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public boolean isRepairing() {
        return repairing;
    }

    public void setRepairing(boolean repairing) {
        this.repairing = repairing;
    }

    public int getCarID() {
        return CarID;
    }

    public void setCarID(int CarID) {
        this.CarID = CarID;
    }

    @Override
    public String toString() {
        return "Car{" + "model=" + model + ", registration=" + registration + ", repairing=" + repairing + ", CarID=" + CarID + '}';
    }

   
    
    
}
