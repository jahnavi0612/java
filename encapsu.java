import java.util.*;

class Vehicle {
    private String model;
    private int speed;
    private final int MAX_SPEED = 120;

    public Vehicle(String model) {
        this.model = model;
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    // Method to increase the speed
    public void accelerate(int increment) {
        if (speed + increment <= MAX_SPEED) {
            speed += increment;
            System.out.println("Increased speed by " + increment + " km/h");
        } else {
            speed = MAX_SPEED;
            System.out.println("Reached maximum speed: " + MAX_SPEED + " km/h");
        }
    }

    // Method to decrease the speed
    public void brake(int decrement) {
        if (speed - decrement >= 0) {
            speed -= decrement;
            System.out.println("Braked by " + decrement + " km/h");
        } else {
            speed = 0;
            System.out.println("Vehicle has stopped");
        }
    }

    public String getModel() {
        return model;
    }
}

public class Encapsu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the model name: ");
        String model = sc.nextLine();

        Vehicle car = new Vehicle(model);
        System.out.println("Current speed: " + car.getSpeed() + " km/h");

        System.out.print("Enter the speed to accelerate: ");
        int acc = sc.nextInt();
        car.accelerate(acc);
        System.out.println("Current speed: " + car.getSpeed() + " km/h");

        System.out.print("Enter the speed to brake: ");
        int brake = sc.nextInt();
        car.brake(brake);
        System.out.println("Current speed: " + car.getSpeed() + " km/h");

        sc.close();
    }
}
