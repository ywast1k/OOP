package domen;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(
        long id, String name, double price,
         int place, int temperature) {
        super(id, name, price, place);
        this.temperature = temperature;
    }

    public int getTemperatur() {
        return temperature;
    }

    public void setTemperatur(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink [" + super.toString() + "temperature= " + temperature + "]";
    }    
}
