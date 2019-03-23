/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruit;

/**
 *
 * @author CUC THAN
 */
public class fruit {
    String id, name, origin;
    int price, quantity;

    public fruit(String id, String name, String origin, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "fruit{" + "id=" + id + ", name=" + name + ", origin=" + origin + ", price=" + price + "," + ", quantity=" + quantity + '}';
    }
    
    
}
