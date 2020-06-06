package measurement.properties.temperature;

public enum TemperatureConversionFactors {
    CELSIUS(1), KELVIN(1), FAHRENHEIT(0.5555555556);
    public double conversionFactor;

    TemperatureConversionFactors(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }
}
