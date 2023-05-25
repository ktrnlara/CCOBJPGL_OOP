package May25;

public class Car extends Vehicle {
	private String tireType;

	public void drive() {
		System.out.println("Car is being driven.");
	}

	public String getTireType() {
		return tireType;
	}

	public void setTireType(String tireType) {
		this.tireType = tireType;
	}

	@Override
	public void stop() {
		System.out.println("Car has stopped.");
	}
}

