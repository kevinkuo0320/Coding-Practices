package week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NonOverlappingInterval {
    public int eraseOverlapIntervals(int[][] intervals) {

        List<Pair> lis = new ArrayList<>();
        for(int[] i : intervals) {
            lis.add(new Pair(i[0], i[1]));
            //System.out.println(lis.get(0).end);
        }

        Collections.sort(lis);
        int count = 1;
        int end = lis.get(0).end;

        for(int i = 0; i < lis.size() ; i++) {
            if(lis.get(i).start >= end) {
                end = lis.get(i).end;
                count++;
            }

        }
        return lis.size() - count;

    }
}

class Pair implements Comparable <Pair> {

    public int start;
    public int end;

    Pair(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Pair o) {
        return this.end - o.end;
    }

}
