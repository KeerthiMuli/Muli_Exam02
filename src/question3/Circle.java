/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Keerthi Muli
 */
public class Circle {
    private double radius;
    private double diameter;

    public Circle(double radius, double diameter) {
        this.radius = radius;
        this.diameter = diameter;
    }
        @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", diameter=" + diameter + '}';
    }

    
}
