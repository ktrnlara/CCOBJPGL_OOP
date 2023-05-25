package May25;

public class Car extends Vehicle {
	private String tireType;

	public void drive() {
		System.out.println("Car is being driven.");
	}

	// Getter and Setter for tireType

	public String getTireType() {
		return tireType;
	}

	public void setTireType(String tireType) {
		this.tireType = tireType;
	}

	// Method overriding
	@Override
	public void stop() {
		System.out.println("Car has stopped.");
	}
}

/*
public class Car extends Vehicle {
	
    public Car(int speed, String color, double price) {
        super(speed, color, price);
    }
    
}

*/