package measurement.units;

import measurement.units.length.*;
import measurement.units.temperature.Temperature;
import org.junit.Test;

import static measurement.units.Units.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestUnit {

    @Test
    public void givenZeroValuesOfFeetAndInch_shouldBeEqual() {
        assertEquals(new Length(0, FEET), new Length(0, INCH));
    }

    @Test
    public void givenNullValueOfUnits_shouldNotEqual() {
        assertNotEquals(null, new Length(12, INCH));
    }

    @Test
    public void givenSameReferenceOfUnits_shouldBeEqual() {
        Length feet = new Length(10, FEET);
        assertEquals(feet, feet);
    }

    @Test
    public void givenEquivalentValuesOfFeetAndInch_shouldBeEqual() {
        assertEquals(new Length(1,FEET), new Length(12.00, INCH));
    }

    @Test
    public void givenEquivalentValuesOfInchAndFeet_shouldBeEqual() {
        assertEquals(new Length(12, INCH), new Length(1, FEET));

    }

    @Test
    public void givenNonEquivalentValuesOfFeetAndInch_shouldBeEqual() {
        assertNotEquals(new Length(1, FEET), new Length(1, INCH));

    }

    @Test
    public void givenNonEquivalentValuesOfInchAndFeet_shouldBeEqual() {
        assertNotEquals(new Length(1, INCH), new Length(1, FEET));

    }

    @Test
    public void givenEquivalentValuesOfFeetAndYard_shouldBeEqual() {
        assertEquals(new Length(3, FEET), new Length(1, YARD));

    }

    @Test
    public void givenEquivalentValuesOfInchAndYard_shouldBeEqual() {
        assertEquals(new Length(36, INCH), new Length(1, YARD));

    }

    @Test
    public void givenNonEquivalentValuesOfFeetAndYard_shouldBeEqual() {
        assertNotEquals(new Length(1, FEET), new Length(1, YARD));

    }

    @Test
    public void givenNonEquivalentValuesOfInchAndYard_shouldBeEqual() {
        assertNotEquals(new Length(1, INCH), new Length(1, YARD));

    }

    @Test
    public void givenValidFeet_thenConvertTo_shouldConvertToCentiMeter() {
        Length feet = new Length(1, FEET);
        assertEquals(new Length(30.48, CENTIMETER), feet.convertTo(CENTIMETER));
    }

    @Test
    public void givenValidYard_thenConvertTo_shouldConvertToCentiMeter() {
        Length yard = new Length(1, YARD);
        assertEquals(new Length(91.44, CENTIMETER), yard.convertTo(CENTIMETER));
    }

    @Test
    public void givenValidMile_thenConvertTo_shouldConvertToKilometer() {
        Length mile = new Length(1, MILE);
        assertEquals(new Length(1.61, KILOMETER), mile.convertTo(KILOMETER));
    }

    @Test
    public void givenValidMeter_thenAdd_shouldAddCentimeter() {
        Length meter = new Length(1, METER);
        assertEquals(new Length(3, METER),meter.add(new Length(200, CENTIMETER)));
    }

    @Test
    public void givenValidMeter_thenAdd_shouldAddMeter() {
        Length meter = new Length(1, METER);
        assertEquals(new Length(2, METER), meter.add(new Length(1, METER)));
    }

    @Test
    public void givenValidMeter_thenAdd_shouldAddYard() {
        Length meter = new Length(1, METER);
        assertEquals(new Length(1.91, METER), meter.add(new Length(1, YARD)));
    }

    @Test
    public void givenZeroValuesOfCelsiusAndKelvin_shouldNotEqual() {
        assertNotEquals(new Temperature(0, CELSIUS), new Temperature(0, KELVIN));
    }

    @Test
    public void givenZeroValuesOfCelsiusAndFahrenheit_shouldNotEqual() {
        assertNotEquals(new Temperature(0, CELSIUS), new Temperature(0, FAHRENHEIT));
    }

    @Test
    public void givenEquivalentZeroValuesOfCelsiusAndFahrenheit_shouldBeEqual() {
        assertEquals(new Temperature(0, CELSIUS), new Temperature(32, FAHRENHEIT));
    }

    @Test
    public void givenEquivalentZeroValuesOfFahrenheit_shouldBeEqual() {
        assertEquals(new Temperature(0, FAHRENHEIT), new Temperature(0, FAHRENHEIT));
    }

    @Test
    public void givenEquivalentZeroValuesOfCelsiusAndKelvin_shouldBeEqual() {
        assertEquals(new Temperature(0, CELSIUS), new Temperature(273.15, KELVIN));
    }

    @Test
    public void givenEquivalentValuesOfCelsiusAndKelvin_shouldBeEqual() {
        assertEquals(new Temperature(2, CELSIUS), new Temperature(275.15, KELVIN));
    }

    @Test
    public void givenEquivalentValuesOfCelsiusAndFahrenheit_shouldBeEqual() {
        assertEquals(new Temperature(2, CELSIUS), new Temperature(35.6, FAHRENHEIT));
    }

    @Test
    public void givenEquivalentValuesOfKelvinAndFahrenheit_shouldBeEqual() {
        assertEquals(new Temperature(2, KELVIN), new Temperature(-456.07, FAHRENHEIT));
    }

    @Test
    public void givenEquivalentValuesOfFahrenheitAndKelvin_shouldBeEqual() {
        assertEquals(new Temperature(1, FAHRENHEIT), new Temperature(255.93, KELVIN));
    }

    @Test
    public void givenNonEquivalentValuesOfKelvinAndFahrenheit_shouldNotEqual() {
        assertNotEquals(new Temperature(2, KELVIN), new Temperature(456.07, FAHRENHEIT));
    }

    @Test
    public void givenNonEquivalentValuesOfCelsiusAndKelvin_shouldNotEqual() {
        assertNotEquals(new Temperature(32, CELSIUS), new Temperature(275.15, KELVIN));
    }

}



