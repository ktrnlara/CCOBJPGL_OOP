package May25;

public class FandangoYacht extends Boat {
    // No additional properties needed

    @Override
    public void floatBoat() {
        System.out.println("Fandango Yacht is floating.");
    }
}


/*
public class FandangoYacht extends Boat {
	private String mainSailColor;

	public FandangoYacht(int speed, String color, double price, String mainSailColor) {
		super(speed, color, price);
		this.mainSailColor = mainSailColor;
	}

	// Method to float the FandangoYacht
	public void floatYacht() {
		System.out.println("Fandango Yacht is floating.");
	}
}

*/