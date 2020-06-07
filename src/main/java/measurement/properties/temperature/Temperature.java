package measurement.properties.temperature;

import measurement.properties.Property;
import measurement.properties.Units;

public class Temperature extends Property {

    private double conversionFactor;
    private double temperatureConversionFactor;

    public Temperature(double value, Units unitType) {
        if (!unitType.type.equals("TEMPERATURE"))
            throw new RuntimeException(unitType+" is not a unit of Temperature");
        this.value = value;
        this.conversionFactor = unitType.conversionFactor;
        this.temperatureConversionFactor = TemperatureConversionFactors.valueOf(unitType.name()).conversionFactor;
        this.unitType = unitType;
    }

    @Override
    public double getUnitValue() {
        return Math.round(((this.temperatureConversionFactor * this.value) + this.conversionFactor) * 100.00)/100.00;
    }

    @Override
    public Temperature add(Property property) {
        if (!property.unitType.type.equals("TEMPERATURE"))
            throw new RuntimeException("can not add "+ property.unitType+" to "+this.unitType);
        property = property.convertTo(this.unitType);
        this.value = (this.value + property.value) / 2;
        return this;
    }

    @Override
    public Temperature convertTo(Units type) {
        if (!type.type.equals("TEMPERATURE"))
            throw new RuntimeException("can not convert "+this.unitType+" to "+type);
        this.value = Math.round(((this.getUnitValue() - (this.conversionFactor = type.conversionFactor)) /
                (this.temperatureConversionFactor = TemperatureConversionFactors.valueOf(type.name()).conversionFactor))*100.00)/100.00;
        this.unitType = type;
        return this;
    }
}