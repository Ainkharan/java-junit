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
        sc.addItems("orange",0.3);
        sc.addItems("hot dogs",1.4);

        //Assert
        assertEquals(4, sc.getItems().size());
        assertEquals(0.5, sc.getItems().get("apple"));
        assertEquals(0.3, sc.getItems().get("orange"));
        assertEquals(1.4, sc.getItems().get("hot dogs"));



    }

    @Test
    void calculateTotal() {
        //Assign
        ShoppingCart[] carts = new ShoppingCart[4];
        for (int i = 0; i < carts.length; i++) {
            carts[i] = new ShoppingCart();
            populateCart(carts[i], i + 1);
        }
        double expectedOutputOne = 0.5;
        double expectedOutputTwo = 1.0;
        double expectedOutputThree = 1.5;
        double expectedOutputFour = 2.0;

        //Act
        double actualOutputOne = carts[0].calculateTotal();
        double actualOutputTwo = carts[1].calculateTotal();
        double actualOutputThree = carts[2].calculateTotal();
        double actualOutputFour = carts[3].calculateTotal();

        //Assert
        assertAll(() -> {   assertEquals(expectedOutputOne, actualOutputOne);
                            assertEquals(expectedOutputTwo, actualOutputTwo);
                            assertEquals(expectedOutputThree, actualOutputThree);
                            assertEquals(expectedOutputFour, actualOutputFour);
        });

    }

    private void populateCart(ShoppingCart sc, int items) {
        for (int i = 0; i < items; i++) {
            sc.addItems(""+i, 0.5);
        }
    }
}