

package com.mycompany.q3emptest;


public class Q3emptest {

    public static void main(String[] args) {
        Q3employee employee = new Q3employee("Bogdan", 50000.0, 10000.0);

        //  Employee Name using the getter
        System.out.println("Employee Name: " + employee.getName());

        //  Basic Salary using the getter
        System.out.println("Basic Salary: " + employee.getBasicSalary());

        //  Bonus using the getter
        System.out.println("Bonus: " + employee.getBonus());

        // Calculate and print Bonus Amount using the calculateBonusAmount() method
        double bonusAmount = employee.calculateBonusAmount();
        System.out.println("Bonus Amount: " + bonusAmount);
    }
}







    

