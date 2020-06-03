package measurement.converter;

import measurement.units.length.Feet;
import measurement.units.length.Inch;
import measurement.units.length.Yard;
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
        boolean status = converter.areEqual(new Feet(1), new Inch(12));
        Assert.assertTrue(status);
    }

    @Test
    public void givenEquivalentValuesOfInchAndFeet_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Inch(12), new Feet(1));
        Assert.assertTrue(status);
    }

    @Test
    public void givenNonEquivalentValuesOfFeetAndInch_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Feet(1), new Inch(1));
        Assert.assertFalse(status);
    }

    @Test
    public void givenNonEquivalentValuesOfInchAndFeet_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Inch(1), new Feet(1));
        Assert.assertFalse(status);
    }

    @Test
    public void givenEquivalentValuesOfFeetAndYard_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Feet(3), new Yard(1));
        Assert.assertTrue(status);
    }

    @Test
    public void givenEquivalentValuesOfInchAndYard_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Inch(36), new Yard(1));
        Assert.assertTrue(status);
    }

    @Test
    public void givenNonEquivalentValuesOfFeetAndYard_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Feet(1), new Yard(1));
        Assert.assertFalse(status);
    }

    @Test
    public void givenNonEquivalentValuesOfInchAndYard_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Inch(1), new Yard(1));
        Assert.assertFalse(status);
    }

}



