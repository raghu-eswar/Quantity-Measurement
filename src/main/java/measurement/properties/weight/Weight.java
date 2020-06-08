package measurement.properties.weight;

import measurement.properties.Property;
import measurement.properties.Units;

public class Weight extends Property {

    public Weight(double value, Units unitType) {
        if (!unitType.type.equals("WEIGHT"))
            throw new RuntimeException(unitType+" is not a unit of Length");
        this.value = value;
        this.unitType = unitType;
        this.multiplicand = unitType.multiplicand;
    }

}