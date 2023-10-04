/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author suele
 */
public class Rectangle  extends Shape{
   private String colour;
   private  boolean isFilled;
   private double height = 5.0;
   private double widht = 6.2;
    

    public double getHeight() {
        return height;
    }

    public double getWidht() {
        return widht;
    }
     public double getArea(){
       
       return height * widht;
       
       
       
       
   }
            
    
}
