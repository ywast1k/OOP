package domen;

public class Bottle extends Product {
    private double value;

    public Bottle(
        long id, String name, 
        double price, int place, double value) {
        super(id, name, price, place);
        this.value = value;
        
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Bottle [" + super.toString() +"value= " + value + "]";
    }
}
