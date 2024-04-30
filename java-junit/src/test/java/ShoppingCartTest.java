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
        sc.addItems("Orange",0.3);
        sc.addItems("hot dogs",1.4);

        //Assert
        assertEquals(4, sc.getItems().size());
        assertEquals(0.5, sc.getItems().get("apple"));
        assertEquals(0.3, sc.getItems().get("Orange"));
        assertEquals(1.4, sc.getItems().get("hot dogs"));



    }

    @Test
    void calculateTotal() {
        //Assign

        //Act

        //Assert
    }
}