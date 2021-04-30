
package Prototype_Company;

public class Product {
  private double price;
  private String item;
  
  public void Product(double price, String item){
      this.price = price;
      this.item = item;
  }

  public void Update(double u_price, String u_item){
      price = u_price;
      item = u_item;
  }


    public double getPrice() {
        return price;
    }

    public String getItem() {
        return item;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setItem(String item) {
        this.item = item;
    }



}
