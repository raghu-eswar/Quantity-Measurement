package measurement.units.length;

public final class Kilometre extends Length{
    private static final double CONVERSION_FACTOR = 1000000;

    public Kilometre(double value) {
        super(CONVERSION_FACTOR);
        this.value = value;
        this.unitType = LengthUnits.KILOMETER;
    }

    public Kilometre() {
        this(1);
    }
}
