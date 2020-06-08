package measurement.properties.volume;

import measurement.properties.Property;
import measurement.properties.Units;

public class Volume extends Property {

    public Volume(double value, Units unitType) {
        if (!unitType.type.equals("VOLUME"))
            throw new RuntimeException(unitType+" is not a unit of Volume");
        this.value = value;
        this.unitType = unitType;
        this.multiplicand = unitType.multiplicand;
    }

}