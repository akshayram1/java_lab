package programs;

/*18. Write a program to implement following inheritance. Accept data for 5 persons and display the name of employee having salary greater than 5000.

Class Name: Person
Member variables:
Name, age

Class Name: Employee
Member variables:
Designation, salary
 */
import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }
}

class Employee extends Mainm {
    private String designation;
    private double salary;

    public void accept() {
        super.accept();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter designation: ");
        designation = scanner.nextLine();
        System.out.print("Enter salary: ");
        salary = scanner.nextDouble();
    }

    public void display() {
        if (salary > 5000) {
            System.out.println("Employee name: " + name);
        }
    }
}

public class EmployeeIN {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter data for 5 employees:");

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Employee " + (i + 1));
            employees[i] = new Employee();
            employees[i].accept();
        }

        System.out.println("\nEmployees with salary greater than 5000:");
        for (int i = 0; i < employees.length; i++) {
            employees[i].display();
        }
    }
}
