package com.mycompany.encapsulation.ob;
public class EncapsulationClass {
    protected String name;
    protected int age;
    protected int salary;
    public void setname(String n){
        name=n;
    }
    public void setage(int a){
        age=a;
    }
    public void setsalary(int s){
        salary=s;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public int getsalary(){
        return salary;
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
