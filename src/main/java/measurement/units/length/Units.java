package measurement.units.length;

import measurement.units.Unit;

public enum LengthUnits {
    INCH(Inch.class), FEET(Feet.class), YARD(Yard.class), MILLIMETER(Millimeter.class), MILE(Mile.class),
    CENTIMETER(Centimeter.class), METER(Meter.class), KILOMETER(Kilometre.class);
    public Class<? extends Unit> _class;

    LengthUnits(Class<? extends Unit> _class) {
        this._class = _class;
    }

}
