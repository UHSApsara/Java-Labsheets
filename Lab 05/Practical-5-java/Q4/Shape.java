package com.mycompany.shapeobj;
abstract class Shape 
{
  abstract  double calculateArea();
  public void display()
  {
      System.out.println("Area:"+calculateArea());
  }
    
}
