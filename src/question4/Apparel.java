/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author S541906
 */
public class Apparel {
    private double price;
    private String materail;
    private String size;   

    public Apparel(double price, String materail, String size) {
        this.price = price;
        this.materail = materail;
        this.size = size;
        System.out.println("Inside Apparel Constructor");
    }

    public double getPrice() {
        System.out.println("Inside Apparel getPrice");
        return price;
    }

    public String getMaterail() {
         System.out.println("Inside Apparel getMaterial");
        return materail;
    }

    public String getSize() {
         System.out.println("Inside Apparel getSize");
        return size;
    }

    @Override
    public String toString() {
         System.out.println("This is Aparrel toString");
        return "Price: "+price+" ,"+"Material: "+materail+" ,"+"Size: "+size;
    }
    
}
