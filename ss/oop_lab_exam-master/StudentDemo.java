package programs;

import java.io.*;
import java.util.*;

class AgeNotWithInRangeException extends Exception {
    @Override
    public String getMessage() {
        return "Age is not between 15 and 21. Please ReEnter the Age";
    }
}

class NameNotValidException extends Exception {
    @Override
    public String getMessage() {
        return "Name is not Valid. Please ReEnter the Name";
    }
}

class Student_1 {
    int roll, age;
    String name, course;

    Student_1() {
        roll = 0;
        name = null;
        age = 0;
        course = null;
    }

    Student_1(int r, String n, int a, String c) {
        roll = r;
        course = c;
        int l, temp = 0;
        l = n.length();
        for (int i = 0; i < l; i++) {
            char ch;
            ch = n.charAt(i);
            if (ch < 'A' || ch > 'Z' && ch < 'a' || ch > 'z')
                temp = 1;
        }
        /* ———-Checking Name——————– */
        try {
            if (temp == 1)
                throw new NameNotValidException();
            else
                name = n;
        } catch (NameNotValidException e2) {
            System.out.println(e2.getMessage());
        }
        /* ———-Checking Age——————– */
        try {
            if (a >= 15 && a <= 21)
                age = a;
            else
                throw new AgeNotWithInRangeException();
        } catch (AgeNotWithInRangeException e1) {
            System.out.println(e1.getMessage());
        }
    }

    void display() {
        System.out.println("Roll\tName\tAge\tCourse");
        System.out.println("----------------------------------");
        System.out.println(roll + "\t" + name + "\t" + age + "\t" + course);
    }
}

class StudentDemo {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int r, a;
        String n, c;

        System.out.println("Enter roll, name, age, course");
        r = sc.nextInt();
        sc.nextLine();
        n = sc.nextLine();
        a = sc.nextInt();
        sc.nextLine();
        c = sc.nextLine();
        Student_1 s = new Student_1(r, n, a, c);
        s.display();
    }
}
