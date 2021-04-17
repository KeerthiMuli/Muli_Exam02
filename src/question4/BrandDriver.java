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
public class BrandDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer For Question 4: Keerthi Muli");
 PersonalBrand pbrand = new PersonalBrand("HRX","Hrithik","Roshan",1234,100,5.5);
  System.out.println(pbrand); 
   PersonalBrand obrand = new OrganizationBrand("TATA Motors","Salman","Khan",
          5678,200,6.5);
   System.out.println(obrand);
  
    }   
}
