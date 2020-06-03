package measurement.units;

public class Feet extends Unit {
    static final double CONVERSION_FACTOR = 12;

    public Feet(double value) {
        this.value = value;
        this.unitType = LengthUnits.FOOT;
    }

    public Feet() {
        this(1);
    }

    @Override
    public double getUnitValue() {
        return this.value * CONVERSION_FACTOR;
    }

}
