public class SearchInsert {
    public int searchInsert(int[] nums, int target) {

        //use 2 pointers to track
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) /2;
            if( target < nums[mid]){
                end = mid - 1;

            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        //in case cannot find integer
        return end + 1;

    }
}
