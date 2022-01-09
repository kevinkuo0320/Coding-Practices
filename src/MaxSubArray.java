public class MaxSubArray {
    public int maxSubArray(int[] nums) {

        int len = nums.length;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        //use sum and max as counters to keep track
        //update max value every loop ends

        for(int i = 0; i < len; i++){
            sum += nums[i];
            max = Math.max(sum, max);

            //no need keep negative sum
            if(sum < 0) {
                sum = 0;
            }

        }

        return max;


    }
}
