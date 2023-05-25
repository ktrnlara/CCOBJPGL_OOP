package May25;

public class Vehicle {
	
    private int speed;
    private String color;
    private double price;

    public void stop() {
        System.out.println("Vehicle has stopped.");
    }

    // Getters and Setters

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}


/*
public class Vehicle {
	
    private int speed;
    private String color;
    private double price;
    
    public Vehicle(int speed, String color, double price) {
        this.speed = speed;
        this.color = color;
        this.price = price;
    }
    
    public void stop() {
        System.out.println("Vehicle stopped.");
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getPrice() {
        return price;
    }
    
}
*/