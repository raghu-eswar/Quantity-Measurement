package measurement.converter;

import measurement.units.length.Length;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static measurement.units.length.Units.*;

@RunWith(MockitoJUnitRunner.class)
public class TestConverter {
    Converter converter;

    @Before
    public void setUp() {
        converter = new Converter();
    }

    @Test
    public void givenZeroValuesOfFeetAndInch_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Length(0, FEET), new Length(0, INCH));
        Assert.assertTrue(status);
    }

    @Test
    public void givenNullValueOfUnits_thenAreEqual_shouldReturnFalse() {
        boolean status = converter.areEqual(null, new Length(12, INCH));
        Assert.assertFalse(status);
    }

    @Test
    public void givenSameReferenceOfUnits_thenAreEqual_shouldReturnTrue() {
        Length feet = new Length(10, FEET);
        boolean status = converter.areEqual(feet, feet);
        Assert.assertTrue(status);
    }

    @Test
    public void givenEquivalentValuesOfFeetAndInch_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Length(1,FEET), new Length(12, INCH));
        Assert.assertTrue(status);
    }

    @Test
    public void givenEquivalentValuesOfInchAndFeet_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Length(12, INCH), new Length(1, FEET));
        Assert.assertTrue(status);
    }

    @Test
    public void givenNonEquivalentValuesOfFeetAndInch_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Length(1, FEET), new Length(1, INCH));
        Assert.assertFalse(status);
    }

    @Test
    public void givenNonEquivalentValuesOfInchAndFeet_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Length(1, INCH), new Length(1, FEET));
        Assert.assertFalse(status);
    }

    @Test
    public void givenEquivalentValuesOfFeetAndYard_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Length(3, FEET), new Length(1, YARD));
        Assert.assertTrue(status);
    }

    @Test
    public void givenEquivalentValuesOfInchAndYard_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Length(36, INCH), new Length(1, YARD));
        Assert.assertTrue(status);
    }

    @Test
    public void givenNonEquivalentValuesOfFeetAndYard_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Length(1, FEET), new Length(1, YARD));
        Assert.assertFalse(status);
    }

    @Test
    public void givenNonEquivalentValuesOfInchAndYard_thenAreEqual_shouldReturnTrue() {
        boolean status = converter.areEqual(new Length(1, INCH), new Length(1, YARD));
        Assert.assertFalse(status);
    }

}



