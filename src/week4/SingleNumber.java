import java.util.HashMap;

public class SingleNumber {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int res = 0;

        for(int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if(hm.containsKey(curr)){
                hm.put(curr, hm.get(curr) + 1);
            }
            else {
                hm.put(curr, 1);
            }
        }

        for(int i : nums){
            if(hm.get(i) == 1){
                res = i;
            }
        }
        return res;

    }
}
