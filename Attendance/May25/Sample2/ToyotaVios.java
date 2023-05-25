package May25_2;

public class ToyotaVios extends Vehicle {
    private String tireType;

    public void drive() {
        System.out.println("Toyota Vios is being driven.");
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        this.tireType = tireType;
    }

    @Override
    public void stop() {
        System.out.println("Toyota Vios has stopped.");
    }
}
