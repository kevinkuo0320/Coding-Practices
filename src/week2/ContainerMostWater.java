public class ContainerMostWater {
    public int maxAreas(int[] height) {

        int maxArea = 0;

        //set two pointers to keep track the width
        int left = 0;
        int right = height.length - 1;


        while(right > left){


            maxArea = Math.max(maxArea, (right-left) * Math.min(height[left], height[right]));


            //if one pointer smaller than the other, move to the other side to hope get higher length
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }

        }
        return maxArea;

    }
}
