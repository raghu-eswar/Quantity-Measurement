package measurement.units.length;

import measurement.units.Unit;
import measurement.units.Units;

import java.util.Arrays;
import static measurement.units.Units.*;

public class Length extends Unit {
    private double conversionFactor;
    protected static Units[] validUnits = {INCH, FEET, YARD, MILLIMETER, MILE, CENTIMETER, METER, KILOMETER};

    public Length(double value, Units unitType) {
        if (Arrays.stream(validUnits).noneMatch(unitType::equals))
            throw new RuntimeException(unitType+" is not a unit of Length");
        this.value = value;
        this.unitType = unitType;
        this.conversionFactor = unitType.conversionFactor;
    }

    @Override
    public Length convertTo(Units type) {
        if (Arrays.stream(validUnits).noneMatch(type::equals))
            throw new RuntimeException("can not convert "+this.unitType+" to "+type);
        this.value = Math.round((this.getUnitValue() / (this.conversionFactor = type.conversionFactor)) * 100.00)/100.00;
        this.unitType = type;
        return this;
    }

    @Override
    public Unit add(Unit unit) {
        if (Arrays.stream(validUnits).noneMatch(unit.unitType::equals))
            throw new RuntimeException("can not add "+unit.unitType+" to "+this.unitType);
        unit = unit.convertTo(this.unitType);
        this.value = Math.round((this.value+ unit.value)*100.00)/100.00;
        return this;
    }

    public double getUnitValue() {
        return Math.round((this.value * this.conversionFactor) * 100.00)/100.00;
    }

}







