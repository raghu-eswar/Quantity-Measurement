package measurement.units.length;

public final class Yard extends Length{
    private static final double CONVERSION_FACTOR = 914.4;

    public Yard(double value) {
        super(CONVERSION_FACTOR);
        this.value = value;
        this.unitType = LengthUnits.YARD;
    }

    public Yard() {
        this(1);
    }
}
