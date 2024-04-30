public class StringManipulator {
    public String reverseString(String input) {
        // TODO: Implement the logic to reverse the input string
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    public boolean isPalindrome(String input) {
        // TODO: Implement the logic to check if the input string is a palindrome
        // (A palindrome = same forwards as backwards)
        for(int i=0;i<input.length()/2;i++){
            if(input.charAt(i) == input.charAt(input.length()-i)){

               // return true;
            }
        } return false;
    }
}