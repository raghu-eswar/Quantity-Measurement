package measurement.units.length;

import measurement.units.Unit;
import measurement.units.Units;

public class Length extends Unit {
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
    public Length add(Unit unit) {
        if (!unit.unitType.type.equals("LENGTH"))
            throw new RuntimeException("can not add "+ unit.unitType+" to "+this.unitType);
        unit = unit.convertTo(this.unitType);
        this.value = Math.round((this.value+ unit.value)*100.00)/100.00;
        return this;
    }

    public double getUnitValue() {
        return Math.round((this.value * this.conversionFactor) * 100.00)/100.00;
    }

}







