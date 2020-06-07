package measurement.properties.weight;

import measurement.properties.ExtensiveProperty;
import measurement.properties.Property;
import measurement.properties.Units;

public class Weight extends ExtensiveProperty {

    public Weight(double value, Units unitType) {
        if (!unitType.type.equals("WEIGHT"))
            throw new RuntimeException(unitType+" is not a unit of Length");
        this.value = value;
        this.unitType = unitType;
        this.conversionFactor = unitType.conversionFactor;
    }

    @Override
    public double getUnitValue() {
        return Math.round((this.value * this.conversionFactor) / 1000.00)*1000.00;
    }

    @Override
    public Weight add(Property property) {
        if (!property.unitType.type.equals("WEIGHT"))
            throw new RuntimeException("can not add "+ property.unitType+" to "+this.unitType);
        return (Weight) super.add(property);
    }

    @Override
    public Weight convertTo(Units type) {
        if (!type.type.equals("WEIGHT"))
            throw new RuntimeException("can not convert "+this.unitType+" to "+type);
        return (Weight) super.convertTo(type);
    }
}