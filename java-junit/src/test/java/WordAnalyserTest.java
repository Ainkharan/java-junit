import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyserTest {

    @Test
    void findLongestWords() {
        // Arrange
        String str = "Hellow how are you";
        String[] expectedOutput = {"Hellow"};
        WordAnalyser wa = new WordAnalyser();

        //Act
        String[] actualOutput = wa.findLongestWords(str);

        //Assert
        assertArrayEquals(expectedOutput,actualOutput);
        assertAll(()->{ assertArrayEquals({"programming"},"Java is the best progamming language"));
                        assertArrayEquals(String[]{"weeks"},"Day of the weeks"));
                        assertArrayEquals(String[]{"London"},"City of London"));
        });


    }

    @Test
    void calculateLetterFrequency() {
    }
}