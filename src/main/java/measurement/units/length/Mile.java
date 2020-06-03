package measurement.units.length;

public final class Mile extends Length{
    private static final double CONVERSION_FACTOR = 1609344;

    public Mile(double value) {
        super(CONVERSION_FACTOR);
        this.value = value;
        this.unitType = LengthUnits.MILE;
    }

    public Mile() {
        this(1);
    }
}
