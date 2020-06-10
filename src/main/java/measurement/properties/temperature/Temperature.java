package measurement.properties.temperature;

import measurement.properties.Property;
import measurement.properties.Units;

public class Temperature extends Property {

    public Temperature(double value, Units unitType) {
        if (!unitType.type.equals("TEMPERATURE"))
            throw new RuntimeException(unitType+" is not a unit of Temperature");
        this.value = value;
        this.multiplicand = unitType.multiplicand;
        this.addend = unitType.addend;
        this.unitType = unitType;
    }

}