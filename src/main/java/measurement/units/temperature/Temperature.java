package measurement.units.temperature;

import measurement.units.Unit;
import measurement.units.Units;

public class Temperature extends Unit {

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
    public Temperature add(Unit unit) {
        if (!unit.unitType.type.equals("TEMPERATURE"))
            throw new RuntimeException("can not add "+ unit.unitType+" to "+this.unitType);
        unit = unit.convertTo(this.unitType);
        this.value = (this.value + unit.value) / 2;
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
