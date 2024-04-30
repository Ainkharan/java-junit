import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordAnalyser {
    public String[] findLongestWords(String text) {
        // TODO: Implement the logic to find the longest word(s) in the given text
        if (text.isBlank()) return new String[]{};
        int longestWord = 0;
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord) {
                longestWord = words[i].length();
            }
        }
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == longestWord) {
                count++;
            }
        }
        String[] output = new String[count];
        int insertionIndex = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == longestWord) {
                output[insertionIndex++] = words[i];
            }
        }
        return output;
    }

    public Map<Character, Integer> calculateLetterFrequency(String text) {
        // TODO: Implement the logic to calculate the frequency of each letter in the given text

        Map <Character, Integer> output = new HashMap<>();
        String strippedString = text.replace(" ","");
        for (int i = 0; i < strippedString.length(); i++) {
            if(isLetter(strippedString.charAt(i))) {
                output.put(strippedString.charAt(i), output.getOrDefault(strippedString.charAt(i), 0) + 1);
            }
        }
        return output;
    }

    private boolean isLetter(char c){
        return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);
    }
}
