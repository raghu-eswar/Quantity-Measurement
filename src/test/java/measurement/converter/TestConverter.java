package measurement.converter;

import measurement.properties.length.Length;
import measurement.properties.temperature.Temperature;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import static measurement.properties.Units.*;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class TestConverter {
    Converter converter;

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Before
    public void setUp() {
        converter = new Converter();
    }

    @Test
    public void givenZeroValuesOfFeetAndInch_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Length(0, FEET), new Length(0, INCH));
        assertTrue(status);
    }

    @Test
    public void givenEquivalentZeroValuesOfCelsiusAndKelvin_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Temperature(0, CELSIUS), new Temperature(273.15, KELVIN));
        assertTrue(status);
    }

}



