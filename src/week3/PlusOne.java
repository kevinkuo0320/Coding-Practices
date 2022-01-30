public class PlusOne {
    public int[] plusOne(int[] nums) {


        //if last digit is less than 9 can just simply return array
        if (nums[nums.length - 1] < 9) {
            nums[nums.length - 1]++;
            return nums;
        }

        //add one for each number in the array
        //last digit is 0
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                break;
            }
            nums[i] = 0;
        }

        //create new array that increases length + 1
        if (nums[0] == 0) {
            int[] newNums = new int[nums.length + 1];
            newNums[0] = 1;
            System.arraycopy(nums, 0, newNums, 1, nums.length);
            return newNums;
        }

        return nums;

    }
}
