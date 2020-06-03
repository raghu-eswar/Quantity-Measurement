package measurement.units;

public class Inch extends Unit {
    static final double CONVERSION_FACTOR = 1;

    public Inch(double value) {
        this.value = value;
        this.unitType = LengthUnits.INCH;
    }

    public Inch() {
        this(1);
    }

    @Override
    public double getUnitValue() {
        return this.value * CONVERSION_FACTOR;
    }
}
