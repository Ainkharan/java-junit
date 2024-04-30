import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    void reverseString() {
        // Arrange
        StringManipulator sm = new StringManipulator();
        String input = "northcoders";
        String expectedOutput = "sredochtron";

        // Act
        String actualOutput = sm.reverseString(input);

        // Assert
        assertEquals(expectedOutput, actualOutput);
        assertAll(() -> assertEquals("tac", sm.reverseString("cat")),
                () -> assertEquals("retsehcnam", sm.reverseString("manchester")),
                () -> assertEquals("sdeel", sm.reverseString("leeds")),
                () -> assertEquals("mahgnimrib", sm.reverseString("birmingham")),
                () -> assertEquals("eltsacwen", sm.reverseString("newcastle"))
        );
    }

    @Test
    void isPalindrome() {
        // Arrange
        String input = "abba";
        StringManipulator palindrom = new StringManipulator();
        assertTrue(palindrom.isPalindrome(input));

        assertAll(() -> { assertTrue(palindrom.isPalindrome("madam"));
                          assertFalse(palindrom.isPalindrome("london"));
                          assertFalse(palindrom.isPalindrome("Birmingham"));
                          assertTrue(palindrom.isPalindrome("civic"));
                          assertTrue(palindrom.isPalindrome("noon"));}
                );




    }
}