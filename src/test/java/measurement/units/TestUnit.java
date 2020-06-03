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

    @Test
    public void givenValidMeter_thenAdd_shouldAddCentimeter() {
        Meter meter = new Meter(1);
        meter.add(new Centimeter(100));
        Assert.assertEquals(2.00, meter.value, 0.0);
        Assert.assertEquals(LengthUnits.METER, meter.unitType);
    }

    @Test
    public void givenValidMeter_thenAdd_shouldAddMeter() {
        Meter meter = new Meter(1);
        meter.add(new Meter(1));
        Assert.assertEquals(2.00, meter.value, 0.0);
        Assert.assertEquals(LengthUnits.METER, meter.unitType);
    }

    @Test
    public void givenValidMeter_thenAdd_shouldAddYard() {
        Meter meter = new Meter(1);
        meter.add(new Yard(1));
        Assert.assertEquals(1.91, meter.value, 0.0);
        Assert.assertEquals(LengthUnits.METER, meter.unitType);
    }

}



