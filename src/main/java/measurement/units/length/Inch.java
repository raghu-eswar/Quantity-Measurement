package measurement.units.length;

public final class Inch extends Length {
    private static final double CONVERSION_FACTOR = 25.4;

    public Inch(double value) {
        super(CONVERSION_FACTOR);
        this.value = value;
        this.unitType = LengthUnits.INCH;
    }

    public Inch() {
        this(1);
    }

}
