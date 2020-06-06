package measurement.properties;

public enum Units {
    INCH(25.4, "LENGTH"), FEET(304.8, "LENGTH"), YARD(914.4, "LENGTH"),
    MILLIMETER(1, "LENGTH"), MILE( 1609344, "LENGTH"), CENTIMETER( 10,"LENGTH"),
    METER( 1000, "LENGTH"), KILOMETER( 1000000, "LENGTH"),
    CELSIUS(273.15, "TEMPERATURE"), KELVIN(0, "TEMPERATURE"), FAHRENHEIT(255.37222222222, "TEMPERATURE"),;
    public double conversionFactor;
    public String type;

    Units(double conversionFactor, String type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
    }

}
