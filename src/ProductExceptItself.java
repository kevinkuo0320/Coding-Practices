import java.util.Arrays;

public class ProductExceptItself {
    public int[] productExceptSelf(int[] nums) {

        //Only need to care about zero count = 1 or 0
        //if 0 => then simple division
        //if 1 => need to track the zero index
        //if more than 1 => array with all zero

        int zeroCount = 0;
        int zeroIndex = 0;
        int totalProduct = 1;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 0){
                zeroCount++;
                zeroIndex = i;
            } else {
                totalProduct *= nums[i];
            }

        }

        if(zeroCount == 0) {
            for(int i  = 0; i < nums.length; i++){
                nums[i] = totalProduct/ nums[i];
            }
        } else {
            Arrays.fill(nums, 0);
            if(zeroCount == 1){
                nums[zeroIndex] = totalProduct;
            }

        }

        return nums;

    }
}
