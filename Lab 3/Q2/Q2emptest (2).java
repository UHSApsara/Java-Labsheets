

package com.mycompany.q2emptest;

/**
 *
 * @author User
 */
public class Q2emptest {

    public static void main(String[] args) {
          // constructor with bonus 
        Q2employee employee = new Q2employee("James", 50000.0, 5000.0);

        //  Employee Name using the getter
        System.out.println("Employee Name: " + employee.getName());

        //  Basic Salary using the getter
        System.out.println("Basic Salary: " + employee.getBasicSalary());

        //  Bonus using the getter
        System.out.println("Bonus: " + employee.getBonus());
    
    }
}
