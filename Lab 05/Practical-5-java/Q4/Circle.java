package com.mycompany.shapeobj;
public class Circle extends Shape
{
  private double radius;

  public Circle(double radius)
  {
      this.radius=radius;
  }
  public double calculateArea()
          {
          
            return 22/7*radius*radius;
          }
   public void display()
  {
      System.out.println("Circle Area:"+calculateArea());
  }
}
