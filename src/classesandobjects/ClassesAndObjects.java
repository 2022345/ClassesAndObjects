/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classesandobjects;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.ShapeD2;
import shapes.Square;
import shapes.Triangle;

/**
 *
 * @author suele
 */
public class ClassesAndObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Triangle tri1 = new Triangle ();
        System.out.println(tri1);
      Triangle tri2 = new Triangle ();
      Triangle tri3 = new Triangle ();
      Triangle tri4 = new Triangle ();
      Triangle tri5 = new Triangle ();
      Triangle tri6 = new Triangle ();
      
      int[] sideLengths = new int [18];
      //The lengths of tri1's sides will be first, then the lengths of tri2 sides etc.
      
      sideLengths[0] = 5;
      sideLengths[1] = 8;
      sideLengths[2] = 9;
      
      //tri5(4,7,2)
      
      sideLengths[12] = 4;
      sideLengths[13] = 7;
      sideLengths[14] = 2;
      
      //we want to get to set the middle side of ecah triangle to be 3
      sideLengths[1] = 3;
      sideLengths[4] = 3;
      sideLengths[7] = 3;
      sideLengths[10] = 3;
      sideLengths[13] = 3;
      sideLengths[16] = 3;
              
      
      Person sam = new Person();
      sam.favTriangle = tri5;
      
              System.out.println("---Rectangles---");
        Rectangle rect1 = new Rectangle ();
        Rectangle rect2 = new Rectangle (true, "Blue", 5, 6);
        System.out.println(  rect1.getArea());
        
        System.out.println(rect1.getColour());
        System.out.println(tri5.getColour());
      
        
     //   Shape shap1 =new Shape();
        
        Person p4 = new Person ("Sam", 100);
        Person p3 = new Person (42, "Ken");
        Person p1 = new Person();
        Person p2 = new Person(5);
        
        
        Square sq1 = new Square(true, "Green", 10);
        Rectangle sq2 = new Square(false, "Purple", 5);
        Shape sq3 = new Square (true, "Maroon",7);
        Shape tri10 = new Triangle();
        sq1.getArea();
        
        ShapeD2 sq4 = new Square (true, "Blue", 2);
        sq4.calculateAngles();
        
       // ShapeD2 circle5 = new Circle();
    }
    
}
