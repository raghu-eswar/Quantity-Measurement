package measurement.units;

import measurement.units.length.Length;

public class Feet extends Length {
    static final double CONVERSION_FACTOR = 12;

    public Feet(double value) {
        super(CONVERSION_FACTOR);
        this.value = value;
        this.unitType = LengthUnits.FOOT;
    }

    public Feet() {
        this(1);
    }

}
