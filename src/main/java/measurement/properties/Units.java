package measurement.properties;

public enum Units {

    //    Length unite.....
    INCH(25.4,  "LENGTH"), FEET(304.8,  "LENGTH"), YARD(914.4,  "LENGTH"),
    MILLIMETER(1,  "LENGTH"), MILE( 1609344,  "LENGTH"), CENTIMETER( 10, "LENGTH"),
    METER( 1000,  "LENGTH"), KILOMETER( 1000000,  "LENGTH"),

    //    Temperature unite.....
    CELSIUS(1, 273.15, "TEMPERATURE"), KELVIN(1, 0, "TEMPERATURE"),
    FAHRENHEIT(0.5555555556, 255.37222222222, "TEMPERATURE"),

    //    Volume unite.....
    CUBIC_INCH(16.387064,"VOLUME"), CUBIC_FEET(28316.84659322726,"VOLUME"), CUBIC_MILLIMETER(0.001,"VOLUME"),
    CUBIC_CENTIMETER( 1, 0, "VOLUME"), CUBIC_METER( 1000000,"VOLUME"), MILLI_LITERS(1,"VOLUME"),
    LITER(1000,"VOLUME"), GALLON(3785.41  ,"VOLUME"),

    //    Weight unite.....
    GRAM(1000, "WEIGHT"), KILOGRAM(1000000, "WEIGHT"), MILLIGRAM(1, "WEIGHT"),
    POUND( 453592.33 ,"WEIGHT"), OUNCE( 28349.5, "WEIGHT"), TONNE(1000000000, "WEIGHT");

    public double multiplicand;
    public double addends;
    public String type;

    Units(double multiplicand, double addends, String type) {
        this(multiplicand, type);
        this.addends = addends;
    }

    Units(double multiplicand, String type) {
        this.multiplicand = multiplicand;
        this.type = type;
    }

}
