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
    public Volume add(Property property) {
        if (!property.unitType.type.equals("VOLUME"))
            throw new RuntimeException("can not add "+ property.unitType+" to "+this.unitType);
        property = property.convertTo(this.unitType);
        this.value = this.value+ property.value;
        return this;
    }

    @Override
    public Volume convertTo(Units type) {
        if (!type.type.equals("VOLUME"))
            throw new RuntimeException("can not convert "+this.unitType+" to "+type);
        this.value = Math.round((this.getUnitValue() / (this.conversionFactor = type.conversionFactor)) * 100.00)/100.00;
        this.unitType = type;
        return this;
    }
}
