/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author suele
 */
public class Circle extends Shape {
    private int radius;
    
   

    public int getRadius() {
        return radius;
    }

  public double getArea(){
      return (3.141579 * this.radius * this.radius);
  }
    
    
}
