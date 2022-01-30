import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        //from array to string => new String(array)
        //from string to array => string.toCharArray()
        //key is to sort the string as chararray to identify the anagram

        HashMap<String, List<String>> hm = new HashMap<>();
        for(String string : strs) {
            char[] arr = string.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(hm.get(key) == null) {
                hm.put(key, new ArrayList<>(Arrays.asList(string)) );

            } else {
                hm.get(key).add(string);
            }
        }

        return new ArrayList<>(hm.values());



    }
}
