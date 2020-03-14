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
public class Circle {
    //**private instanance variable
    private double radius;
    private String color;
    //khoi tao doi tuong
    public Circle(){
        radius = 5;
        color = "blue";
    }
    public Circle (double  radius){
        this. radius = radius;
    }
       /**
        * Lay ra mau sac
        * @raturn
        */
    public String getColor(){
        return color;
    }
    /**
     * Lay ra diem tinh
     *  @return
     */
    public double getArea(){
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    
    
}
