package May25_2;

public class U2SpyPlane extends Vehicle {
    private double wingspan;

    public void fly() {
        System.out.println("U-2 Spy Plane is flying.");
    }

    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public void stop() {
        System.out.println("U-2 Spy Plane has stopped.");
    }
}
