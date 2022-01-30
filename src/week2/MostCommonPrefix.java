public class MostCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        //pointer to track
        int index = 0;

        //outer loop at most strs[0] size
        OUTER: while (index < strs[0].length()) {
            char ch = strs[0].charAt(index);
            for ( String str: strs) {
                //if the char not equal to any char of the string in array
                // or too long then break
                if (index >= str.length() || str.charAt(index) != ch) {
                    break OUTER;
                }
            }
            index++;
        }

        return strs[0].substring(0, index);
    }
}
