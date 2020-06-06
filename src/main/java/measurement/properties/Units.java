package measurement.properties;

public enum Units {

    //    Length unite.....
    INCH(25.4, "LENGTH"), FEET(304.8, "LENGTH"), YARD(914.4, "LENGTH"),
    MILLIMETER(1, "LENGTH"), MILE( 1609344, "LENGTH"), CENTIMETER( 10,"LENGTH"),
    METER( 1000, "LENGTH"), KILOMETER( 1000000, "LENGTH"),

    //    Temperature unite.....
    CELSIUS(273.15, "TEMPERATURE"), KELVIN(0, "TEMPERATURE"),
    FAHRENHEIT(255.37222222222, "TEMPERATURE"),

    //    Volume unite.....
    CUBIC_INCH(16387.064, "VOLUME"), CUBIC_FEET(28316846.6, "VOLUME"), CUBIC_MILLIMETER(1, "VOLUME"),
    CUBIC_CENTIMETER( 1000,"VOLUME"), CUBIC_METER( 1000000000, "VOLUME"), MILLI_LITERS(1000, "VOLUME"),
    LITER(1000000, "VOLUME"), GALLON(3785412  , "VOLUME");

    public double conversionFactor;
    public String type;

    Units(double conversionFactor, String type) {
        this.conversionFactor = conversionFactor;
        this.type = type;
    }

}
