import java.io.*;

public class Employee {
    public String name;
    private double salary;
    public static final String DEPARTMENT = "Development";
    public static double averageSalary = 3000;

    public Employee(String empName) {
        name = empName;
    }

    public void setSalary(double empSal) {
        salary = empSal;
    }

    public void printEmp() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary + " $CAD");
    }

    public static void main(String args[]) {
        Employee empOne = new Employee("John");

        empOne.setSalary(5000);
        empOne.printEmp();
        System.out.println(DEPARTMENT + " average salary: " + averageSalary + " $CAD");
    }
}
