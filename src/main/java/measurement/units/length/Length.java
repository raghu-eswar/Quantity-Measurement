package measurement.units.length;

import measurement.units.Unit;
import java.util.Arrays;

import static measurement.units.length.Units.*;

public class Length extends Unit {
    private final double conversionFactor;
    protected static Units[] validUnits = {INCH, FEET, YARD, MILLIMETER, MILE, CENTIMETER, METER, KILOMETER};

    public Length(double value, Units unitType) {
        this.value = value;
        this.unitType = unitType;
        this.conversionFactor = unitType.conversionFactor;
    }

    public Length convertTo(Units type) {
        if (Arrays.stream(validUnits).noneMatch(type::equals))
            throw new RuntimeException("can not convert "+this.unitType+" to "+type);
        this.value = Math.round((this.getUnitValue() / type.conversionFactor) * 100.00)/100.00;
        this.unitType = type;
        return this;
    }

    @Override
    public Unit add(Unit unit) {
        unit = unit.convertTo(this.unitType);
        this.value = Math.round((this.value+ unit.value)*100.00)/100.00;
        return this;
    }

    public double getUnitValue() {
        return Math.round((this.value * this.conversionFactor) * 100.00)/100.00;
    }

}
