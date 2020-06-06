package measurement.properties.volume;

import measurement.properties.Property;
import measurement.properties.Units;

public class Volume extends Property {

    private double conversionFactor;

    public Volume(double value, Units unitType) {
        if (!unitType.type.equals("VOLUME"))
            throw new RuntimeException(unitType+" is not a unit of Length");
        this.value = value;
        this.unitType = unitType;
        this.conversionFactor = unitType.conversionFactor;
    }

    @Override
    public double getUnitValue() {
        double d1 = this.value * this.conversionFactor;
        return Math.round((this.value * this.conversionFactor) / 1000.00)*1000.00;
    }

    @Override
    public Property add(Property property) {
        return null;
    }

    @Override
    public Property convertTo(Units type) {
        return null;
    }
}
