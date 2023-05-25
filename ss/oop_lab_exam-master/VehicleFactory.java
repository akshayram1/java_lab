package programs;

/*A Company manufactures Vehicles, which could be a Helicopter, a Car, or a Train depending on the customer’s demand. Each Vehicle instance has a method called move, which prints on the console the nature of movement of the vehicle. For example, the Helicopter Flies in Air, the Car Drives on Road and the Train Runs on Track. Write a program that accepts input from the user on the kind of vehicle the user wants to order, and the system should print out nature of movement. Implement all Java coding best practices to implement this program. */
import java.util.Scanner;

abstract class Vehicle {
    public abstract void move();
}

class Car extends Vehicle {
    public void move() {
        System.out.println("The car moves on the road.");
    }
}

class Helicopter extends Vehicle {
    public void move() {
        System.out.println("The helicopter moves in the air.");
    }
}

class Train extends Vehicle {
    public void move() {
        System.out.println("The train moves on the tracks.");
    }
}

public class VehicleFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the type of vehicle you want to order (car/helicopter/train): ");
        String vehicleType = scanner.nextLine().toLowerCase(); // Convert input to lowercase

        Vehicle vehicle = null;

        switch (vehicleType) {
            case "car":
                vehicle = new Car();
                break;
            case "helicopter":
                vehicle = new Helicopter();
                break;
            case "train":
                vehicle = new Train();
                break;
            default:
                System.out.println("Invalid vehicle type entered.");
                break;
        }

        if (vehicle != null) {
            vehicle.move();
        }
    }
}
