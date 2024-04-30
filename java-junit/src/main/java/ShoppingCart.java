import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Double> items = new HashMap<>();

    public void addItems(String item, double price){
        this.items.put(item, price);
    }

    public double calculateTotal(){
        return 0.0;
    }

    public Map<String, Double> getItems() {
        return this.items;
    }
}
