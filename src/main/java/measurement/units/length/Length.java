package measurement.units.length;

import measurement.units.LengthUnits;
import measurement.units.Unit;

public class Length extends Unit {
    protected final double conversionFactor;
    protected LengthUnits unitType;

    protected Length(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    protected double getUnitValue() {
        return this.value * this.conversionFactor;
    }
}
