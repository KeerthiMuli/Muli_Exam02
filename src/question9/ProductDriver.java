/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author S541906
 */
public class ProductDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer For Question 9: Keerthi Muli");
        Product dprod = new GuaranteeProduct(103134,"Washing Machine",
                "WhrilPool",
                1,40000);
        System.out.println(dprod);
        Product nprod = new NonGuaranteeProduct(203134,"Power Bank","Local "
                + "China",
                2,1000);
        System.out.println(nprod);
    }
    
}
