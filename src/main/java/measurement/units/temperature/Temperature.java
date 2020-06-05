package measurement.units.temperature;

import measurement.units.Unit;
import measurement.units.Units;

import static measurement.units.Units.*;

public class Temperature extends Unit {

    private final double conversionFactor;
    private final double temperatureConversionFactor;
    protected static Units[] validUnits = {CELSIUS, KELVIN, FAHRENHEIT};

    public Temperature(double value, Units type) {
        this.value = value;
        this.conversionFactor = type.conversionFactor;
        this.temperatureConversionFactor = TemperatureConversionFactors.valueOf(type.name()).conversionFactor;
        this.unitType = type;
    }

    @Override
    public double getUnitValue() {
        return Math.round(((this.temperatureConversionFactor * this.value) + this.conversionFactor) * 100.00)/100.00;
    }

    @Override
    public Unit add(Unit unit) {
        return null;
    }

    @Override
    public Unit convertTo(Units type) {
        return null;
    }
}
