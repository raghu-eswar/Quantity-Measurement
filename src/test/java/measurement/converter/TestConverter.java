package measurement.converter;

import measurement.units.Feet;
import measurement.units.Inch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestConverter {
    Converter converter;

    @Before
    public void setUp() {
        converter = new Converter();
    }

    @Test
    public void givenZeroValuesOfFeetAndInch_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Feet(0), new Inch(0));
        Assert.assertTrue(status);
    }

    @Test
    public void givenNullValueOfUnits_thenAreEqual_shouldReturnFalse() {
        boolean status = converter.areEqual(null, new Inch(12));
        Assert.assertFalse(status);
    }

    @Test
    public void givenSameReferenceOfUnits_thenAreEqual_shouldReturnTrue() {
        Feet feet = new Feet(10);
        boolean status = converter.areEqual(feet, feet);
        Assert.assertTrue(status);
    }

    @Test
    public void givenEquivalentValuesOfFeetAndInch_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Feet(2), new Inch(24));
        Assert.assertTrue(status);
    }

}



