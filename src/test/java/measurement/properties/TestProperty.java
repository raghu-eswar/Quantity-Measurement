package measurement.properties;

import measurement.properties.length.*;
import measurement.properties.temperature.Temperature;
import measurement.properties.volume.Volume;
import org.junit.Test;

import static measurement.properties.Units.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestProperty {

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

    @Test
    public void givenValidFahrenheit_thenConvertTo_shouldConvertToKelvin() {
        Temperature fahrenheit = new Temperature(1, FAHRENHEIT);
        assertEquals(new Temperature(255.93, KELVIN), fahrenheit.convertTo(KELVIN));
    }

    @Test
    public void givenValidFahrenheit_thenConvertTo_shouldConvertToCelsius() {
        Temperature fahrenheit = new Temperature(400, FAHRENHEIT);
        assertEquals(new Temperature(204.44, CELSIUS), fahrenheit.convertTo(CELSIUS));
    }

    @Test
    public void givenValidKelvin_thenConvertTo_shouldConvertToCelsius() {
        Temperature kelvin = new Temperature(1, KELVIN);
        assertEquals(new Temperature(-272.15, CELSIUS), kelvin.convertTo(CELSIUS));
    }

    @Test
    public void givenInvalidTemperatureConversionType_constructor_shouldThrowException() {
        try{
            new Temperature(1, METER);
        } catch (RuntimeException e) {
            assertEquals("METER is not a unit of Temperature", e.getMessage());
        }
    }

    @Test
    public void givenInvalidLengthConversionType_constructor_shouldThrowException() {
        try{
            new Temperature(1, CELSIUS);
        } catch (RuntimeException e) {
            assertEquals("CELSIUS is not a unit of Length", e.getMessage());
        }
    }

    @Test
    public void givenInvalidTemperatureConversionType_thenConvertTo_shouldThrowException() {
        try{
            new Temperature(1, CELSIUS).convertTo(METER);
        } catch (RuntimeException e) {
            assertEquals("can not convert CELSIUS to METER", e.getMessage());
        }
    }

    @Test
    public void givenInvalidLengthConversionType_thenConvertTo_shouldThrowException() {
        try{
            new Length(1, METER).convertTo(CELSIUS);
        } catch (RuntimeException e) {
            assertEquals("can not convert METER to CELSIUS", e.getMessage());
        }
    }

    @Test
    public void givenInvalidLengthConversionType_thenAdd_shouldThrowException() {
        try{
            new Length(1, METER).add(new Temperature(1, CELSIUS));
        } catch (RuntimeException e) {
            assertEquals("can not add CELSIUS to METER", e.getMessage());
        }
    }

    @Test
    public void givenValidCelsius_thenAdd_shouldAddCelsius() {
        Temperature celsius = new Temperature(20, CELSIUS);
        assertEquals(new Temperature(25, CELSIUS), celsius.add(new Temperature(30, CELSIUS)));
    }

    @Test
    public void givenValidCelsius_thenAdd_shouldAddKelvin() {
        Temperature celsius = new Temperature(20, CELSIUS);
        assertEquals(new Temperature(25, CELSIUS), celsius.add(new Temperature(303.15, KELVIN)));
    }

    @Test
    public void givenValidFahrenheit_thenAdd_shouldAddKelvin() {
        Temperature fahrenheit = new Temperature(19.99, FAHRENHEIT);
        assertEquals(new Temperature(52.98, FAHRENHEIT), fahrenheit.add(new Temperature(303.15, KELVIN)));
    }

    @Test
    public void givenZeroValuesOfCubicInchAndCubicFeet_shouldBeEqual() {
        assertEquals(new Volume(0, CUBIC_INCH), new Volume(0, CUBIC_FEET));

    }

    @Test
    public void givenEquivalentValuesOfCubicInchAndCubicFeet_shouldBeEqual() {
        assertEquals(new Volume(3456, CUBIC_INCH), new Volume(2, CUBIC_FEET));
    }

    @Test
    public void givenEquivalentValuesOfCubicMeterAndCubicFeet_shouldBeEqual() {
        assertEquals(new Volume(0.0566337, CUBIC_METER), new Volume(2, CUBIC_FEET));
    }

    @Test
    public void givenEquivalentValuesOfLiterAndCubicFeet_shouldBeEqual() {
        assertEquals(new Volume(28.3168, LITER), new Volume(1, CUBIC_FEET));
    }

    @Test
    public void givenEquivalentValuesOfGallonAndCubicLiters_shouldBeEqual() {
        assertEquals(new Volume(1, GALLON), new Volume(3.78541, LITER));
    }

    @Test
    public void givenEquivalentValuesOfLitterAndCubicMilliliters_shouldBeEqual() {
        assertEquals(new Volume(1, LITER), new Volume(1000, MILLI_LITERS));
    }

    @Test
    public void givenValidLiters_thenConvertTo_shouldConvertToMilliliters() {
        Volume volume = new Volume(1, LITER);
        assertEquals(volume.convertTo(MILLI_LITERS), new Volume(1000, MILLI_LITERS));
    }
    @Test
    public void givenValidGallon_thenConvertTo_shouldConvertToLiters() {
        Volume volume = new Volume(1, GALLON);
        assertEquals(volume.convertTo(LITER), new Volume(3.79, LITER));
    }

    @Test
    public void givenValidLiters_thenConvertTo_shouldConvertToCubicInches() {
        Volume volume = new Volume(1, LITER);
        assertEquals(volume.convertTo(CUBIC_INCH), new Volume(61.02, CUBIC_INCH));
    }
}



