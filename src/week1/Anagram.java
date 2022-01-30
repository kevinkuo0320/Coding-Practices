package week1;

import java.util.HashMap;

class Anagram {
    public boolean isAnagram(String s, String t) {
        /* using array O(n) time
            use single array ++ and -- to keep track of difference

        boolean res = true;

        if(s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < 26; i ++) {
            if(arr[i] != 0) {
                res = false;
            }

        }

        return res;

        } */

        //Hashmap solution

        if(s.length() != t.length()) {
            return false;
        }

        int count = 1;

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for(int i  = 0; i < s.length(); i++){
            if(hm1.containsKey(s.charAt(i))){
                int num = hm1.get(s.charAt(i));
                hm1.replace(s.charAt(i), ++num);
            } else {
                hm1.put(s.charAt(i), count);
            }

            if(hm2.containsKey(t.charAt(i))){
                int num = hm2.get(t.charAt(i));
                hm2.replace(t.charAt(i), ++num);
            } else {
                hm2.put(t.charAt(i), count);
            }

        }

        return hm1.equals(hm2);
    }



}
