/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Keerthi Muli
 */
public class Question2 {

   public static boolean equals(int[][] m1, int[][] m2) {
     if(Arrays.deepEquals(m2, m1)){
         return true;
     }
     return false;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        System.out.println("Answer For Question 2: Keerthi Muli");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
       for(int r=0; r<3;r++)
         {            
            for(int c=0; c<3;c++)
            {
                m1[r][c]=input.nextInt();
            }
         }
               
        System.out.print("Enter list2: ");
        for(int r=0; r<3;r++)
         {            
            for(int c=0; c<3;c++)
            {
                m2[r][c]=input.nextInt();
            }
         }
               
       
       if (equals(m1, m2)== true){
           System.out.println("The two arrays are strictly identical");
       }
       else{
         System.out.println("The two arrays are not strictly identical");  
       }
          
    }
    
}
