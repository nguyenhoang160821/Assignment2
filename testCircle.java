/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phan1.Circle;

/**
 *
 * @author admin
 */
public class testCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();
        String color1 = c1.getColor();
        System.out.print(c1.toString());
        
        Circle c2 = new Circle("red");
        System.out.print(c2.toString());
        
        Circle c3 = new Circle(1.2);
        System.out.print(c3.toString());
        
        Circle c4 = new Circle(19.4,"green");
        System.out.println(c4.toString());
        
    }
    
    
}
