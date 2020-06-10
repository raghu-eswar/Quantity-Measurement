package measurement.properties;

public abstract class Property {
    public double value;
    public Units unitType;
    protected double multiplicand;
    protected double addend;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property that = (Property) o;
        return Math.abs(that.getUnitValue() - this.getUnitValue()) <= Math.min(4, (Math.min(that.getUnitValue(), this.getUnitValue()) * 0.0001));
    }

    public double getUnitValue()  {
        return (this.multiplicand * this.value) + this.addend;
    }

    public Property add(Property property) {
        property = property.convertTo(this.unitType);
        this.value = this.unitType.type.equals("TEMPERATURE")? (this.value + property.value) / 2 : this.value+ property.value;
        return this;
    }

    public Property convertTo(Units type) {
        if (!type.type.equals(this.unitType.type))
            throw new RuntimeException("can not convert "+this.unitType+" to "+type);
        this.value = (this.getUnitValue() - (this.addend = type.addend)) /
                (this.multiplicand = type.multiplicand);
        this.unitType = type;
        return this;
    }

}