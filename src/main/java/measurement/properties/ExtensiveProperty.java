package measurement.properties;

public abstract class ExtensiveProperty extends Property{
    protected double conversionFactor;

    @Override
    public ExtensiveProperty add(Property property) {
        property = property.convertTo(this.unitType);
        this.value = this.value+ property.value;
        return this;
    }

    @Override
    public Property convertTo(Units type) {
        this.value = Math.round((this.getUnitValue() / (this.conversionFactor = type.conversionFactor)) * 100.00)/100.00;
        this.unitType = type;
        return this;
    }
}
