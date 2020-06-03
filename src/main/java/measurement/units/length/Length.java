package measurement.units.length;

import measurement.units.Unit;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Length extends Unit {
    protected final double conversionFactor;
    public LengthUnits unitType;

    protected Length(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public  <T extends Unit> T convertTo(LengthUnits type) {
        Class<T> aClass = (Class<T>) type._class;
        double unitValue = this.getUnitValue();
        T t = null;
        try {
            Constructor<T> constructor = aClass.getConstructor(double.class);
            t = constructor.newInstance(1);
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException | IllegalAccessException e) {
            e.printStackTrace();
        }
        assert t != null;
        double unitValue1 = t.getUnitValue();
        t.value = Math.round((unitValue / unitValue1) * 100.0)/100.0;
        return t;
    }

    public Length add(Length unit) {
        unit = unit.convertTo(this.unitType);
        this.value = Math.round((this.value+ unit.value)*100)/100.0;
        return this;
    }


    public double getUnitValue() {
        return Math.round((this.value * this.conversionFactor) * 100.0)/100.0;
    }

}
