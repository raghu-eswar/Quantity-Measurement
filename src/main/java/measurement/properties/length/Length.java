package measurement.properties.length;

import measurement.properties.Property;
import measurement.properties.Units;

public class Length extends Property {

    public Length(double value, Units unitType) {
        if (!unitType.type.equals("LENGTH"))
            throw new RuntimeException(unitType+" is not a unit of Length");
        this.value = value;
        this.unitType = unitType;
        this.multiplicand = unitType.multiplicand;
    }

}