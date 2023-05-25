package May25;

public class Plane extends Vehicle {
	private double wingspan;

	public void fly() {
		System.out.println("Plane is flying.");
	}

	public double getWingspan() {
		return wingspan;
	}

	public void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}

	@Override
	public void stop() {
		System.out.println("Plane has stopped.");
	}
}
