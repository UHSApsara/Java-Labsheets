package com.mycompany.shapeobj;
public class ShapeObj {

    public static void main(String[] args) 
    {
       
        Shape s=new Circle(5);
        s.calculateArea();
        s.display();
        
        Shape s1=new Rectangle(4,5);
        s1.calculateArea();
        s1.display();
        
    }
}
