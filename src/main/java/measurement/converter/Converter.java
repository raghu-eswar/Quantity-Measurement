package measurement.converter;

import measurement.properties.Property;

public class Converter {

    public boolean areEqual(Property property1, Property property2) {
        if (property1 == null)
            return false;
        return property1.equals(property2);
    }

}




