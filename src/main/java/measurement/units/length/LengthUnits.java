package measurement.units.length;

import measurement.units.Unit;

public enum LengthUnits {
    INCH(Inch.class), FOOT(Feet.class);
    public Class<? extends Unit> _class;

    LengthUnits(Class<? extends Unit> _class) {
        this._class = _class;
    }

}
