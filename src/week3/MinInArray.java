public class MinInArray {
    public int findMin(int[] nums) {

        int min = 5000;
        for(int i : nums){
            min = Math.min(i, min);
        }

        return min;

    }
}
