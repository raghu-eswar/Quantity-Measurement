package measurement.units.length;

public final class Feet extends Length {
    private static final double CONVERSION_FACTOR = 304.8;

    public Feet(double value) {
        super(CONVERSION_FACTOR);
        this.value = value;
        this.unitType = LengthUnits.FEET;
    }

    public Feet() {
        this(1);
    }

}
