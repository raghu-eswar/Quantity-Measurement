package measurement.properties.length;

import measurement.properties.Property;
import measurement.properties.Units;

public class Length extends Property {
    private double conversionFactor;

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
        this.value = Math.round((this.getUnitValue() / (this.conversionFactor = type.conversionFactor)) * 100.00)/100.00;
        this.unitType = type;
        return this;
    }

    @Override
    public Length add(Property property) {
        if (!property.unitType.type.equals("LENGTH"))
            throw new RuntimeException("can not add "+ property.unitType+" to "+this.unitType);
        property = property.convertTo(this.unitType);
        this.value = Math.round((this.value+ property.value)*100.00)/100.00;
        return this;
    }

    @Override
    public double getUnitValue() {
        return Math.round((this.value * this.conversionFactor) * 100.00)/100.00;
    }

}







