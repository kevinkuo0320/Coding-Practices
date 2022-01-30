public class ValidPalindrome {
    public boolean isPalindrome(String s) {


        // use stringbuilder method - reverse()
        //use string method - equalsIgnoreCase
        //use character - isLetterOrDigit()
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) str.append(s.charAt(i));
        }

        return str.toString().equalsIgnoreCase(str.reverse().toString());

    }
}
