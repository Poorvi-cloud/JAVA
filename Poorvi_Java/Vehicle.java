import Java.util.Scanner;
class Vehicle {
public static void main(String[] args) {
    int noOfWheels;

    public Vehicle(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }
}
    public int getNoOfWheels() {
        return noOfWheels;
    }
}

class TwoWheeler extends Vehicle {
    public TwoWheeler(int noOfWheels) {
        super(noOfWheels);
    }
}

class Bike extends TwoWheeler {
    public Bike() {
        super(2);
    }
}

class Scooter extends TwoWheeler {
    public Scooter() {
        super(2);
    }
}

class FourWheeler extends Vehicle {
    public FourWheeler(int noOfWheels) {
        super(noOfWheels);
    }
}

class Car extends FourWheeler {
    public Car() {
        super(4);
    }
}

class Truck extends FourWheeler {
    public Truck() {
        super(4);
    }
}

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Scooter scooter = new Scooter();
        Car car = new Car();
        Truck truck = new Truck();

        System.out.println("Bike: Number of wheels - " + bike.getNoOfWheels());
        System.out.println("Scooter: Number of wheels - " + scooter.getNoOfWheels());
        System.out.println("Car: Number of wheels - " + car.getNoOfWheels());
        System.out.println("Truck: Number of wheels - " + truck.getNoOfWheels());
    }
}
