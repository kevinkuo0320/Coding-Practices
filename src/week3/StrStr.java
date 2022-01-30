public class StrStr {
    public int strStr(String haystack, String needle) {

        //use substring to find it
        int n = haystack.length();
        int m = needle.length();

        //edge case
        if (m>n){
            return -1;
        }
        if (m==0){
            return 0;
        }

        for(int i = 0; i<n-m+1 ; i++) {
            String sub = haystack.substring(i, i+m);
            if (sub.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
