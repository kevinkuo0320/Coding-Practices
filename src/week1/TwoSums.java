package week1;

import java.util.HashMap;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {


        /* O(n^2) solution
        int[] res = new int[2];

        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {

                if(nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }

            }

        }
        return res;
        */

        //hashmap O(n) solution
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            Integer requiredNum = (target - nums[i]);
            if(indexMap.containsKey(requiredNum)){
                int[] res = {indexMap.get(requiredNum), i};
                return res;
            }

            indexMap.put(nums[i], i);
        }
        return null;
    }
}
