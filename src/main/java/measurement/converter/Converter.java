package measurement.converter;

import measurement.units.Unit;
import measurement.units.length.Length;

public class Converter {

    public boolean areEqual(Unit unit1, Unit unit2) {
        if (unit1 == null)
            return false;
        return unit1.equals(unit2);
    }

}




