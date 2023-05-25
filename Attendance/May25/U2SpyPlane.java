package May25;

public class U2SpyPlane extends Plane {
    // No additional properties needed

    @Override
    public void fly() {
        System.out.println("U-2 Spy Plane is flying.");
    }
}


/*
public class U2SpyPlane extends Vehicle {
	
    private double wingsSpan;
    
    public void fly() {
        System.out.println("U-2 Spy Plane is flying.");
    }
    
    // Overriding the stop method from the base class
    @Override
    public void stop() {
        System.out.println("U-2 Spy Plane has stopped.");
    }

	public double getWingsSpan() {
		return wingsSpan;
	}

	public void setWingsSpan(double wingsSpan) {
		this.wingsSpan = wingsSpan;
	}
}
*/