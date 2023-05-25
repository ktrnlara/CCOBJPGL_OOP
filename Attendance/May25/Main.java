package May25;

public class Main {
    public static void main(String[] args) {
        ToyotaVIOS toyota = new ToyotaVIOS();
        toyota.setColor("Red");
        toyota.setPrice(20000);
        toyota.setSpeed(120);
        toyota.setTireType("Tubeless");

        System.out.println("Toyota VIOS details:");
        System.out.println("Color: " + toyota.getColor());
        System.out.println("Price: " + toyota.getPrice());
        System.out.println("Speed: " + toyota.getSpeed());
        System.out.println("Tire Type: " + toyota.getTireType());

       
        toyota.drive();
        toyota.stop();

        U2SpyPlane spyPlane = new U2SpyPlane();
        spyPlane.setColor("Black");
        spyPlane.setPrice(1000000);
        spyPlane.setSpeed(500);
        spyPlane.setWingspan(80.5);

        System.out.println("\nU-2 Spy Plane details:");
        System.out.println("Color: " + spyPlane.getColor());
        System.out.println("Price: " + spyPlane.getPrice());
        System.out.println("Speed: " + spyPlane.getSpeed());
        System.out.println("Wingspan: " + spyPlane.getWingspan());

        
        spyPlane.fly();
        spyPlane.stop();

        FandangoYacht yacht = new FandangoYacht();
        yacht.setColor("White");
        yacht.setPrice(500000);
        yacht.setSpeed(30);
        yacht.setMainSailColor("Blue");

        System.out.println("\nFandango Yacht details:");
        System.out.println("Color: " + yacht.getColor());
        System.out.println("Price: " + yacht.getPrice());
        System.out.println("Speed: " + yacht.getSpeed());
        System.out.println("Main Sail Color: " + yacht.getMainSailColor());

        yacht.floatBoat();
        yacht.stop();
    }
}
/*
public class Main {
	
    public static void main(String[] args) {
        ToyotaVIOS toyota = new ToyotaVIOS();
        toyota.setColor("Red");
        toyota.setPrice(20000);
        toyota.setSpeed(120);
        toyota.setTireType("Tubeless");
        toyota.stop();
        toyota.drive();
        
        U2SpyPlane spyPlane = new U2SpyPlane();
        spyPlane.setColor("Black");
        spyPlane.setPrice(1000000);
        spyPlane.setSpeed(500);
        spyPlane.setWingspan(80.5);
        spyPlane.stop();
        spyPlane.fly();
        
        FandangoYacht yacht = new FandangoYacht();
        yacht.setColor("White");
        yacht.setPrice(500000);
        yacht.setSpeed(30);
        yacht.setMainSailColor("Blue");
        yacht.stop();
        yacht.floatBoat();
    }
}
*/

/*
Vehicle class:

Represents the base class for different vehicles.
Contains private instance variables speed, color, and price to represent vehicle properties.
Provides a constructor Vehicle(int speed, String color, double price) to initialize the vehicle properties.
Defines a stop() method that prints "Vehicle stopped."
Car class:

Inherits from the Vehicle class.
Provides a constructor Car(int speed, String color, double price) that calls the superclass constructor to initialize the car properties.
ToyotaVIOS class:

Inherits from the Car class.
Adds an additional private instance variable tireType to represent the tire type of the Toyota VIOS.
Provides a constructor ToyotaVIOS(int speed, String color, double price, String tireType) that calls the superclass constructor and initializes the tireType property.
Overrides the stop() method from the superclass to print "Toyota VIOS stopped."
Adds a drive() method that prints "Toyota VIOS is driving."
Implements a getTireType() method to retrieve the tire type of the Toyota VIOS.
Main class:

Contains the main method where the execution starts.
Creates an instance of ToyotaVIOS named vios with specific property values.
Calls the getter methods (getSpeed(), getColor(), getPrice(), and getTireType()) to retrieve the vehicle properties and the tire type.
Prints the retrieved values.
Calls the stop() and drive() methods on the vios instance.
When you run the Main class, it creates a Toyota VIOS object, retrieves and prints its speed, color, price, and tire type using the getter methods. It then calls the overridden stop() method, which prints "Toyota VIOS stopped," and the drive() method, which prints "Toyota VIOS is driving."

This code demonstrates the use of inheritance and overriding in Java to represent different means of transportation and specific properties and behaviors of a Toyota VIOS vehicle.
*/
