package com.mycompany.employees;
public class Encapsulation {
     protected String name;
    protected int age;
    protected int salary;
    public Encapsulation(String n,int a,int s){
        name=n;
        age=a;
        salary=s;
    }
   
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
    }
    
    
}
