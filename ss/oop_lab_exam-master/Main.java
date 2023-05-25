package programs;

/*5.We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes and print the percentage of marks for both the students. */
import java.util.Scanner;

abstract class Marks {
    public abstract double getPercentage();
}

class A extends Marks {
    private double subject1;
    private double subject2;
    private double subject3;

    public A(double subject1, double subject2, double subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    @Override
    public double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3;
        return (totalMarks / 300) * 100;
    }
}

class B extends Marks {
    private double subject1;
    private double subject2;
    private double subject3;
    private double subject4;

    public B(double subject1, double subject2, double subject3, double subject4) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
        this.subject4 = subject4;
    }

    @Override
    public double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3 + subject4;
        return (totalMarks / 400) * 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the marks for Student A:");
        System.out.print("Subject 1: ");
        double subject1A = scanner.nextDouble();
        System.out.print("Subject 2: ");
        double subject2A = scanner.nextDouble();
        System.out.print("Subject 3: ");
        double subject3A = scanner.nextDouble();

        System.out.println("Enter the marks for Student B:");
        System.out.print("Subject 1: ");
        double subject1B = scanner.nextDouble();
        System.out.print("Subject 2: ");
        double subject2B = scanner.nextDouble();
        System.out.print("Subject 3: ");
        double subject3B = scanner.nextDouble();
        System.out.print("Subject 4: ");
        double subject4B = scanner.nextDouble();

        A studentA = new A(subject1A, subject2A, subject3A);
        B studentB = new B(subject1B, subject2B, subject3B, subject4B);

        System.out.println("Percentage of marks obtained by Student A: " + studentA.getPercentage());
        System.out.println("Percentage of marks obtained by Student B: " + studentB.getPercentage());

        scanner.close();
    }
}
