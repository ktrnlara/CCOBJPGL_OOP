package May25_2;

public class FandangoYacht extends Vehicle {
    private String mainSailColor;

    public void floatBoat() {
        System.out.println("Fandango Yacht is floating.");
    }

    public String getMainSailColor() {
        return mainSailColor;
    }

    public void setMainSailColor(String mainSailColor) {
        this.mainSailColor = mainSailColor;
    }

    @Override
    public void stop() {
        System.out.println("Fandango Yacht has stopped.");
    }
}
