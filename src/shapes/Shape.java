/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author suele
 */
public abstract class Shape {
    
  protected String colour ="Yellow";
   private  boolean isFilled = true;
   
   public Shape (){
       System.out.println("Shape 1");
       
   }
   
   public Shape (boolean isFilled, String colour){
       this.colour = colour;
       this.isFilled = true;
       System.out.println("Shape 2");
   }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isIsFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }
    
    public abstract double getArea();
   
    
}
