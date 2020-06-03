package measurement.units.length;

public final class Meter extends Length{
    private static final double CONVERSION_FACTOR = 1000;

    public Meter(double value) {
        super(CONVERSION_FACTOR);
        this.value = value;
        this.unitType = LengthUnits.METER;
    }

    public Meter() {
        this(1);
    }
}
