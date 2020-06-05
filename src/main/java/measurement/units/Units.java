package measurement.units;

public enum Units {
    INCH(25.4), FEET(304.8), YARD(914.4), MILLIMETER(1),
    MILE( 1609344), CENTIMETER( 10), METER( 1000),
    KILOMETER( 1000000),CELSIUS(273.15), KELVIN(0), FAHRENHEIT(255.37222222222);
    public double conversionFactor;

    Units(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

}
