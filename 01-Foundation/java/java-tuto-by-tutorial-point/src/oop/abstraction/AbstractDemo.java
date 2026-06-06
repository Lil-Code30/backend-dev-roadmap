package oop.abstraction;

public class AbstractDemo {
    public static void main(String[] args){
        // Notes: Abstract classes can be directly created
        // Employee e = new Employee("George W.", "Houston, TX", 43);

        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println(s.getName() + " Salary's is: "+ s.getSalary());

        System.out.println("---------------");
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();

    }
}
