import java.util.Scanner;
class Vehicle 
{
int noOfWheels;
public Vehicle(int noOfWheels)
{
this.noOfWheels = noOfWheels;
}
public void displayValues() 
{
System.out.println("Vehicle NoOfWheels: " + noOfWheels);
}
}
class TwoWheeler extends Vehicle 
{
public TwoWheeler(int noOfWheels) 
{
super(noOfWheels);
}
public void displayValues() 
{
super.displayValues();
System.out.println("Two Wheeler: " + noOfWheels + " wheel(s)");
}
}
class FourWheeler extends Vehicle 
{
public FourWheeler(int noOfWheels) 
{
super(noOfWheels);
}
public void displayValues() 
{
super.displayValues();
System.out.println("Four Wheeler: " + noOfWheels + " wheel(s)");
}
}
class Bike extends TwoWheeler 
{
public Bike()
{
super(2);
}
public void displayValues() 
{
super.displayValues();
System.out.println("This is a bike");
}
}
class Car extends FourWheeler 
{
public Car() 
{
super(4);
}
public void displayValues() 
{
super.displayValues();
System.out.println("This is a car");
}
}
class prac26
{
public static void main(String[] args) 
{
Vehicle[] vehicles = new Vehicle[4];
vehicles[0] = new Bike();
vehicles[1] = new Car();
vehicles[2] = new TwoWheeler(3);
vehicles[3] = new FourWheeler(6);
for (Vehicle vehicle : vehicles) 
{
vehicle.displayValues();
}
}
}