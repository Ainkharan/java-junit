import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

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
        assertAll(()->{ assertArrayEquals(new String[]{"programming"},wa.findLongestWords("Java is the best programming language"));
                        assertArrayEquals(new String[]{"weeks"},wa.findLongestWords("Day of the weeks"));
                        assertArrayEquals(new String[]{"London"},wa.findLongestWords("City of London"));
                        assertArrayEquals(new String[]{"Three", "Seven"},wa.findLongestWords("One Two Three Four Five Six Seven"));
                        assertArrayEquals(new String[]{},wa.findLongestWords(""));
        });
    }

    @Test
  //  private boolean testMap(){ }
    void calculateLetterFrequency() {
        //Arrange
        String str = "a";
        Map <Character, Integer> expectedOutput = new HashMap<>();
        expectedOutput.put('a',1);
        WordAnalyser wa = new WordAnalyser();

        //Act
        Map<Character, Integer> actualOutput= wa.calculateLetterFrequency(str);

       // Assert
        assertEquals(expectedOutput,actualOutput);


    }
}