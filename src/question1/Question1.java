/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Keerthi Muli
 */
public class Question1 {
public static void removeDuplicate(ArrayList<Integer> list){
    ArrayList<Integer> distinctList = new ArrayList<Integer>(); 
    for (Integer ele : list) {
            if (!distinctList.contains(ele)) {
  
                distinctList.add(ele);
            }        
        }
  
     System.out.println("The distinct integers are "+
             distinctList.toString().replace("[", "").replace("]", "").
                     replace(",", ""));
}
    public static void main(String[] args) {
        // TODO code application logic here
          ArrayList<Integer> list=new ArrayList<Integer>();
          System.out.println("Answer For Question 1: Keerthi Muli");
                System.out.print("Enter ten integers: ");
                Scanner input=new Scanner(System.in);

                 String str =input.nextLine();
                 String[] string =str.split(" ", 10);
                 for(String st: string){
                      int in = Integer.parseInt(st);
                      list.add(in);   
                 }
                removeDuplicate(list);
                
                   
    }
    
}
