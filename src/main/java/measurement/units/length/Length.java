package measurement.units.length;

import measurement.units.Unit;

public class Length extends Unit {
    protected final double conversionFactor;
    protected LengthUnits unitType;

    protected Length(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    protected double getUnitValue() {
        return Math.round((this.value * this.conversionFactor) * 100.0)/100.0;
    }
}
