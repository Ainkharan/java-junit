import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Double> items = new HashMap<>();

    public void addItems(String item, double price){
        this.items.put(item, price);
    }

    public double calculateTotal(){
        double total = 0.0;
        for (double d : this.items.values()) {
            total+=d;
        }
        return total;
    }

    public Map<String, Double> getItems() {
        return this.items;
    }
}
