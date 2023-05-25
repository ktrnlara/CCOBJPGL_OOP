package May25;

public class ToyotaVIOS extends Car {
    // No additional properties needed

    @Override
    public void drive() {
        System.out.println("Toyota VIOS is being driven.");
    }
}

/*
public class ToyotaVIOS extends Car {
	
    private String tireType;
    
    public ToyotaVIOS(int speed, String color, double price, String tireType) {
        super(speed, color, price);
        this.tireType = tireType;
    }
    
    @Override
    public void stop() {
        System.out.println("Toyota VIOS stopped.");
    }
    
    public void drive() {
        System.out.println("Toyota VIOS is driving.");
    }

    public String getTireType() {
        return tireType;
    }
    
}
*/