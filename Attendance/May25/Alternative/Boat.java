package May25;

public class Boat extends Vehicle {
    private String mainSailColor;

    public void floatBoat() {
        System.out.println("Boat is floating.");
    }

    public String getMainSailColor() {
        return mainSailColor;
    }

    public void setMainSailColor(String mainSailColor) {
        this.mainSailColor = mainSailColor;
    }

    @Override
    public void stop() {
        System.out.println("Boat has stopped.");
    }
}
