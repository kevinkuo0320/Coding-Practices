import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {

    public int[][] merge(int[][] intervals) {

        //sort arrays based on the starting elements of each array
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        List<int[]> ansList = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        int e,s;
        int i =0;
        int[] newInterval = intervals[0];
        while(i<intervals.length)
        {
            s = intervals[i][0];
            e = intervals[i][1];
            if(s<=end)
                end = Math.max(end,e);
            else
            {
                ansList.add(new int[]{start,end});
                start = s;
                end =  e;
            }
            i++;
        }
        ansList.add(new int[] {start,end});
        return ansList.toArray(new int[ansList.size()][]);
    }
}
