package programs;

/*24. Create a class Student with attributes roll no, name, age and course. Initialize values through parameterized constructor. If age of student is not in between 15 and 21 then generate user-defined exception "AgeNotWithinRangeException". If name contains numbers or special symbols raise exception "NameNotValidException". Define the two exception classes. */
import java.util.Scanner;

class AgeNotWithinRangeException_1 extends Exception {
    public AgeNotWithinRangeException_1(String message) {
        super(message);
    }
}

class NameNotValidException_1 extends Exception {
    public NameNotValidException_1(String message) {
        super(message);
    }
}

class Stud {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Stud(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException_1, NameNotValidException_1 {
        this.rollNo = rollNo;
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException_1("Age is not within the range of 15 to 21.");
        }
        this.age = age;
        if (!name.matches("^[a-zA-Z]+$")) {
            throw new NameNotValidException_1("Name contains invalid characters.");
        }
        this.name = name;
        this.course = course;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

public class NameAgeException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter roll number: ");
            int rollNo = scanner.nextInt();

            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = scanner.nextInt();

            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter course: ");
            String course = scanner.nextLine();

            Stud student = new Stud(rollNo, name, age, course);

            System.out.println("\nStudent details:");
            System.out.println("Roll No: " + student.getRollNo());
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Course: " + student.getCourse());
        } catch (AgeNotWithinRangeException_1 e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (NameNotValidException_1 e) {
            System.out.println("Exception: " + e.getMessage());
        }

        scanner.close();
    }
}
