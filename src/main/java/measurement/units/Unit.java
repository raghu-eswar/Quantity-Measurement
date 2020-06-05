package measurement.units;

public abstract class Unit {
    public double value;
    public Units unitType;
    protected static Units[] validUnits;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit that = (Unit) o;
        double d = that.getUnitValue();
        double d1 = this.getUnitValue();
        return (Double.compare(that.getUnitValue(), this.getUnitValue()) == 0);
    }

    public abstract double getUnitValue();

    public abstract Unit add(Unit unit);

    public abstract Unit convertTo(Units type);

}
