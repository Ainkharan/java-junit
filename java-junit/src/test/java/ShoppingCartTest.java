import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void addItems() {
        //Assign
        String item = "apple";
        double price = 0.5;
        ShoppingCart sc = new ShoppingCart();

        //Act
        sc.addItems(item, price);
        sc.addItems("hot dogs", 1.0);
        sc.addItems("beans", 1.5);

        //Assert
        assertEquals(3, sc.getItems().size());
        assertEquals(0.5, sc.getItems().get("apple"));
    }

    @Test
    void calculateTotal() {
        //Assign

        //Act

        //Assert
    }
}