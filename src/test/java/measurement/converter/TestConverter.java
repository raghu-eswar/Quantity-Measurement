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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

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

    @Test
    public void givenValidYard_thenAdd_shouldAddYard() {
        Length meter = mock(Length.class);
        when(meter.add(any())).thenReturn(new Length(1.9144, METER));
        assertEquals(new Length(1.9144, METER), converter.add(meter, new Length(1, YARD)));
        verify(meter).add(any());
    }

    @Test
    public void givenValidMile_thenConvert_shouldConvertToKilometer() {
        Length mile = mock(Length.class);
        when(mile.convertTo(KILOMETER)).thenReturn(new Length(1.60934, KILOMETER));
        assertEquals(new Length(1.60934, KILOMETER), converter.convert(KILOMETER, mile));
        verify(mile).convertTo(KILOMETER);
    }

}



