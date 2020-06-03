package measurement.units;

public abstract class Unit {
    public double value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass().getSuperclass() != o.getClass().getSuperclass()) return false;
        Unit that = (Unit) o;
        double temp1 = that.getUnitValue();
        double temp2 = this.getUnitValue();
        return (Double.compare(that.getUnitValue(), this.getUnitValue()) == 0);
    }

    protected abstract double getUnitValue();
}
