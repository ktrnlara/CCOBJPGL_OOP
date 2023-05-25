package May25_2;

public class Main {
    public static void main(String[] args) {
        ToyotaVios toyota = new ToyotaVios();
        toyota.setColor("Red");
        toyota.setPrice(1005000);
        toyota.setSpeed(150);
        toyota.setTireType("Tubeless");

//        System.out.println("Toyota Vios details:");
//        System.out.println("Color: " + toyota.getColor());
//        System.out.println("Price: " + toyota.getPrice());
//        System.out.println("Speed: " + toyota.getSpeed());
//        System.out.println("Tire Type: " + toyota.getTireType());

        toyota.drive();
        toyota.stop();

        U2SpyPlane spyPlane = new U2SpyPlane();
        spyPlane.setColor("Black");
        spyPlane.setPrice(120000000);
        spyPlane.setSpeed(805);
        spyPlane.setWingspan(104.10);

//        System.out.println("\nU-2 Spy Plane details:");
//        System.out.println("Color: " + spyPlane.getColor());
//        System.out.println("Price: " + spyPlane.getPrice());
//        System.out.println("Speed: " + spyPlane.getSpeed());
//        System.out.println("Wingspan: " + spyPlane.getWingspan());

        spyPlane.fly();
        spyPlane.stop();

        FandangoYacht yacht = new FandangoYacht();
        yacht.setColor("White");
        yacht.setPrice(50000000);
        yacht.setSpeed(24);
        yacht.setMainSailColor("Blue");

//        System.out.println("\nFandango Yacht details:");
//        System.out.println("Color: " + yacht.getColor());
//        System.out.println("Price: " + yacht.getPrice());
//        System.out.println("Speed: " + yacht.getSpeed());
//        System.out.println("Main Sail Color: " + yacht.getMainSailColor());

        yacht.floatBoat();
        yacht.stop();
    }
}
