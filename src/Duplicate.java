import java.util.HashMap;

public class Duplicate {
    public boolean containsDuplicate(int[] nums) {

        //O(n) solution, same concept as Two Sum Questions
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){

            if(hm.containsKey(nums[i])){
                return true;
            } else {
                hm.put(nums[i], i);
            }

        }
        return false;

    }
}
