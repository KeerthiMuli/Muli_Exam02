/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author Keerthi Muli
 */
public class WomenWear extends MenWear {

    public WomenWear(String designerFirstName, String designerLastName, 
            double price, String materail, String size) {
        super(designerFirstName, designerLastName, price, materail, size);
        System.out.println("Inside WomenWear Constructor");
    }
    
    @Override
    public String getFullName(){
       System.out.println("Inside WomenWear getFullName");
      return super.getDesignerLastName()+","+super.getDesignerFirstName();    
    }

    @Override
    public String toString() {
        System.out.println("Inside WomenWear tostring");
        return super.toString();
    } 
}
