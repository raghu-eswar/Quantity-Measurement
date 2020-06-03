package measurement.units.length;

public class Inch extends Length {
    static final double CONVERSION_FACTOR = 1;

    public Inch(double value) {
        super(CONVERSION_FACTOR);
        this.value = value;
        this.unitType = LengthUnits.INCH;
    }

    public Inch() {
        this(1);
    }

}
