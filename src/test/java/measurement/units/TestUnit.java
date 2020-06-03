package measurement.units;

import measurement.units.length.*;
import org.junit.Assert;
import org.junit.Test;

public class TestUnit {

    @Test
    public void givenValidFeet_thenConvertTo_shouldConvertToCentiMeter() {
        Feet feet = new Feet(1);
        Centimeter centimeter = feet.convertTo(LengthUnits.CENTIMETER);
        Assert.assertEquals(30.48, centimeter.value, 0.0);
        Assert.assertEquals(LengthUnits.CENTIMETER, centimeter.unitType);
    }

    @Test
    public void givenValidYard_thenConvertTo_shouldConvertToCentiMeter() {
        Yard yard = new Yard(1);
        Centimeter centimeter = yard.convertTo(LengthUnits.CENTIMETER);
        Assert.assertEquals(91.44, centimeter.value, 0.0);
        Assert.assertEquals(LengthUnits.CENTIMETER, centimeter.unitType);
    }

    @Test
    public void givenValidMile_thenConvertTo_shouldConvertToKilometer() {
        Mile mile = new Mile(1);
        Kilometre kilometre = mile.convertTo(LengthUnits.KILOMETER);
        Assert.assertEquals(1.61, kilometre.value, 0.0);
        Assert.assertEquals(LengthUnits.KILOMETER, kilometre.unitType);
    }

}
