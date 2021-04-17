/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Keerthi Muli
 */
public class CoverGirl extends Lakme{

    public CoverGirl(String brandEndorserFirstName, String 
            brandEndorserLastName, double quantity) {
        super(brandEndorserFirstName, brandEndorserLastName, quantity);
        System.out.println("This is CoverGirl Constructor");
    }
     @Override
   public String getBrandEndorserFullName(){
       System.out.println("This is CoverGirl getBrandEndorserFullName");
       return super.getBrandEndorserFirstName()+ " " +
               super.getBrandEndorserLastName();
   }

    @Override
    public String toString() {
        System.out.println("This is CoverGirl toString");
        return super.toString();
    }
    
    
}
