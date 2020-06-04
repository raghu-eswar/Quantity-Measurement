package measurement.units;

import measurement.units.length.*;
import org.junit.Assert;
import org.junit.Test;

import static measurement.units.length.Units.*;

public class TestUnit {

    @Test
    public void givenValidFeet_thenConvertTo_shouldConvertToCentiMeter() {
        Length feet = new Length(1, FEET);
        Length centimeter = feet.convertTo(CENTIMETER);
        Assert.assertEquals(30.48, centimeter.value, 0.0);
        Assert.assertEquals(CENTIMETER, centimeter.unitType);
    }

    @Test
    public void givenValidYard_thenConvertTo_shouldConvertToCentiMeter() {
        Length yard = new Length(1, YARD);
        Length centimeter = yard.convertTo(CENTIMETER);
        Assert.assertEquals(91.44, centimeter.value, 0.0);
        Assert.assertEquals(CENTIMETER, centimeter.unitType);
    }

    @Test
    public void givenValidMile_thenConvertTo_shouldConvertToKilometer() {
        Length mile = new Length(1, MILE);
        Length kilometre = mile.convertTo(KILOMETER);
        Assert.assertEquals(1.61, kilometre.value, 0.0);
        Assert.assertEquals(KILOMETER, kilometre.unitType);
    }

    @Test
    public void givenValidMeter_thenAdd_shouldAddCentimeter() {
        Length meter = new Length(1, METER);
        meter.add(new Length(100, CENTIMETER));
        Assert.assertEquals(2.00, meter.value, 0.0);
        Assert.assertEquals(METER, meter.unitType);
    }

    @Test
    public void givenValidMeter_thenAdd_shouldAddMeter() {
        Length meter = new Length(1, METER);
        meter.add(new Length(1, METER));
        Assert.assertEquals(2.00, meter.value, 0.0);
        Assert.assertEquals(METER, meter.unitType);
    }

    @Test
    public void givenValidMeter_thenAdd_shouldAddYard() {
        Length meter = new Length(1, METER);
        meter.add(new Length(1, YARD));
        Assert.assertEquals(1.91, meter.value, 0.0);
        Assert.assertEquals(METER, meter.unitType);
    }

}



