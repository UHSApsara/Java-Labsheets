
package com.mycompany.q3emptest;

public class Q3employee {
      private String name;
    private double basicSalary;
    private double bonus;

    // Constructor with bonus parameter
    public Q3employee(String name, double basicSalary, double bonus) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
    }

    // Getter for Employee Name
    public String getName() {
        return name;
    }

    // Setter for Employee Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Basic Salary
    public double getBasicSalary() {
        return basicSalary;
    }

    // Setter for Basic Salary
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Getter for Bonus
    public double getBonus() {
        return bonus;
    }

    // Setter for Bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Method to calculate Bonus Amount (total of Basic Salary and Bonus)
    public double calculateBonusAmount() {
        return basicSalary + bonus;
    }
    
}
