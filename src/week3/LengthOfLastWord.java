public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {

        //remove lastspace using trim method
        s = s.trim();

        int count=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==' ')
                break;
            else
                count++;
        }
        return count;

    }
}
