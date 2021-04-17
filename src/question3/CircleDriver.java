/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author S541906
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<Object>list=  new ArrayList<Object>();
        Loan lo = new Loan(101101,100000,"HDFC");
        Date dat = new Date();
        String str = "Loan Circle Date";
        Circle ci= new Circle(2.5,5);
        list.add(lo);
        list.add(dat);
        list.add(str);
        list.add(ci);
   System.out.println("Answer For Question 3: Keerthi Muli");
    for(Object obj: list){
    System.out.println(obj.toString());
}
    }
    
}
