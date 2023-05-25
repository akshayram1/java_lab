package programs;

/*22. Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.*/
import java.util.Scanner;

class Person1 {
    private String firstName;
    private String lastName;

    public Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

class Employee1 extends Person1 {
    private int employeeId;
    private String jobTitle;

    public Employee1(String firstName, String lastName, int employeeId, String jobTitle) {
        super(firstName, lastName);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + " (" + jobTitle + ")";
    }
}

public class Employeeperson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Person
        System.out.print("Enter Person's First Name: ");
        String personFirstName = scanner.nextLine();

        System.out.print("Enter Person's Last Name: ");
        String personLastName = scanner.nextLine();

        // Input for Employee
        System.out.print("Enter Employee's First Name: ");
        String employeeFirstName = scanner.nextLine();

        System.out.print("Enter Employee's Last Name: ");
        String employeeLastName = scanner.nextLine();

        System.out.print("Enter Employee's ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Employee's Job Title: ");
        String jobTitle = scanner.nextLine();

        // Create Person and Employee objects
        Person1 person = new Person1(personFirstName, personLastName);
        Employee1 employee = new Employee1(employeeFirstName, employeeLastName, employeeId, jobTitle);

        System.out.println("\nPerson:");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());

        System.out.println("\nEmployee:");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());

        scanner.close();
    }
}
