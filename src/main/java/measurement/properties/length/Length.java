package measurement.properties.length;

import measurement.properties.ExtensiveProperty;
import measurement.properties.Property;
import measurement.properties.Units;

public class Length extends ExtensiveProperty {

    public Length(double value, Units unitType) {
        if (!unitType.type.equals("LENGTH"))
            throw new RuntimeException(unitType+" is not a unit of Length");
        this.value = value;
        this.unitType = unitType;
        this.conversionFactor = unitType.conversionFactor;
    }

    @Override
    public Length convertTo(Units type) {
        if (!type.type.equals("LENGTH"))
            throw new RuntimeException("can not convert "+this.unitType+" to "+type);
        return (Length) super.convertTo(type);
    }

    @Override
    public Length add(Property property) {
        if (!property.unitType.type.equals("LENGTH"))
            throw new RuntimeException("can not add "+ property.unitType+" to "+this.unitType);
        return (Length) super.add(property);
    }

    @Override
    public double getUnitValue() {
        return Math.round((this.value * this.conversionFactor) * 1000.00)/1000.00;
    }

}