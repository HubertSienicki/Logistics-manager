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
public class Order {
    private Customer c1;
    private Product p1;
    private String start_date;
    private String end_date;
    private boolean is_delivered;
    private Deliverer d1;
    private int amount;

    public Order(Customer c1, Product p1, String start_date, String end_date, boolean is_delivered, Deliverer d1, int amount) {
        this.c1 = c1;
        this.p1 = p1;
        this.start_date = start_date;
        this.end_date = end_date;
        this.is_delivered = is_delivered;
        this.d1 = d1;
        this.amount = amount;
    }

    public Customer getC1() {
        return c1;
    }

    public Product getP1() {
        return p1;
    }

    public String getStart_date() {
        return start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public boolean is_delivered() {
        return is_delivered;
    }

    public Deliverer getD1() {
        return d1;
    }

    public int getAmount() {
        return amount;
    }

    public void setC1(Customer c1) {
        this.c1 = c1;
    }

    public void setP1(Product p1) {
        this.p1 = p1;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public void setIs_delivered(boolean is_delivered) {
        this.is_delivered = is_delivered;
    }

    public void setD1(Deliverer d1) {
        this.d1 = d1;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
}
