package measurement.properties.volume;

import measurement.properties.ExtensiveProperty;
import measurement.properties.Property;
import measurement.properties.Units;

public class Volume extends ExtensiveProperty {

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
        return (Volume) super.add(property);
    }

    @Override
    public Volume convertTo(Units type) {
        if (!type.type.equals("VOLUME"))
            throw new RuntimeException("can not convert "+this.unitType+" to "+type);
       return (Volume) super.convertTo(type);
    }
}
