package measurement.units.length;

public final class Millimeter extends Length{
    private static final double CONVERSION_FACTOR = 1;

    public Millimeter(double value) {
        super(CONVERSION_FACTOR);
        this.value = value;
        this.unitType = LengthUnits.MILLIMETER;
    }

    public Millimeter() {
        this(1);
    }
}
