package measurement.properties;

public abstract class Property {
    public double value;
    public Units unitType;
    protected static Units[] validUnits;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property that = (Property) o;
        double d1 = this.getUnitValue();
        double d2 = that.getUnitValue();
        return (Double.compare(that.getUnitValue(), this.getUnitValue()) == 0);
    }

    public abstract double getUnitValue();

    public abstract Property add(Property property);

    public abstract Property convertTo(Units type);

}
