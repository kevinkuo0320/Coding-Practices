package week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] arr) {

        //O(N^2) by using 3 pointers
        Arrays.sort(arr);

        List<List<Integer>> ls = new ArrayList<>();

        for (int i = 0; i<arr.length-2; i++) {
            if (i == 0 || (i>0 && arr[i-1]!=arr[i])) {
                int start = i+1;
                int end = arr.length-1;
                int sum = 0-arr[i];

                while (start<end) {
                    if (arr[start] + arr[end] == sum) {
                        ls.add(Arrays.asList(arr[i], arr[start], arr[end]));

                        while (start<end && arr[start] == arr[start+1]) start++;//avoid all the same values
                        while (start<end && arr[end] == arr[end-1]) end--;//avoid all the same values

                        start++;
                        end--;
                    } else if (arr[start] + arr[end] < sum) {
                        start++;
                    } else end--;
                }
            }
        }

        return ls;
    }
}
