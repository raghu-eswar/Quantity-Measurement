package measurement.units.length;

public final class Centimeter extends Length{
    private static final double CONVERSION_FACTOR = 10;

    public Centimeter(double value) {
        super(CONVERSION_FACTOR);
        this.value = value;
        this.unitType = LengthUnits.CENTIMETER;
    }

    public Centimeter() {
        this(1);
    }
}
