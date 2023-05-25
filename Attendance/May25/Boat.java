public class Boat extends Vehicle {
    private String mainSailColor;

    public void floatBoat() {
        System.out.println("Boat is floating.");
    }

    // Getter and Setter for mainSailColor

    public String getMainSailColor() {
        return mainSailColor;
    }

    public void setMainSailColor(String mainSailColor) {
        this.mainSailColor = mainSailColor;
    }

    // Method overriding
    @Override
    public void stop() {
        System.out.println("Boat has stopped.");
    }
}
