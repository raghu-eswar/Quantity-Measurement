package measurement.converter;

import measurement.properties.Property;
import measurement.properties.Units;

import java.util.Arrays;

public class Converter {

    public boolean areEqual(Property property1, Property property2) {
        if (property1 == null)
            return false;
        return property1.equals(property2);
    }

    public Property add(Property ... properties) {
        return Arrays.stream(properties).reduce(Property::add).get();
    }

    public Property convert(Units unit, Property... properties){
        return add(properties).convertTo(unit);
    }

}




