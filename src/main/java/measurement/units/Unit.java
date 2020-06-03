package measurement.units;

public abstract class Unit {
    protected double value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass().getSuperclass() != o.getClass().getSuperclass()) return false;
        Unit that = (Unit) o;
        return (Double.compare(that.getUnitValue(), this.getUnitValue()) == 0);
    }

    protected abstract double getUnitValue();
}
