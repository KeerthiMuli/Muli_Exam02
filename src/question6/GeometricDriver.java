/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author Keerthi Muli
 */
public class GeometricDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer For Question 6: Keerthi Muli");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter triangle first side: ");
        double firstSide = in.nextDouble();
        System.out.print("Enter triangle second side: ");
        double secondSide = in.nextDouble();
        System.out.print("Enter triangle third side: ");
        double thirdSide = in.nextDouble();
        System.out.print("Enter triangle color: ");
        String color = in.next();
        System.out.print("Enter triangle filled: ");
        boolean filled = in.nextBoolean();
        
     Triangle angle = new Triangle(firstSide,secondSide,thirdSide,color,filled);
        System.out.println("Area of Triangle: "+ angle.getArea());
        System.out.println("Perimeter of Triangle: " + angle.getPerimeter());
        System.out.println("Color of Triangle: " + angle.getColor());
        System.out.println("isFilled: " + angle.isFilled());


    }
    
}
