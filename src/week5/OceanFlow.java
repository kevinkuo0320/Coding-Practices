package week5;

import java.util.ArrayList;
import java.util.List;

public class OceanFlow {
    boolean pacific;
    boolean atlantic;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i < heights.length; i++) {
            for(int j = 0; j < heights[0].length; j++) {
                pacific = false;
                atlantic = false;
                canFlow(i, j, heights, new boolean[heights.length][heights[0].length], Integer.MAX_VALUE);
                if(pacific && atlantic) {
                    List<Integer> lis = new ArrayList<>();
                    lis.add(i);
                    lis.add(j);
                    res.add(lis);
                }
            }
        }
        return res;
    }

    public void canFlow(int i,int j,int[][] heights, boolean[][] visited, int prev) {

        if(i < 0 || j < 0 || i >= heights.length || j >= heights[0].length || visited[i][j] || heights[i][j] > prev || (pacific && atlantic))
            return;
        if(i == 0 || j == 0) {
            pacific = true;
        }
        if(heights.length - 1== i || heights[0].length - 1 == j ) {
            atlantic = true;
        }

        visited[i][j] = true;
        int curr = heights[i][j];

        canFlow(i+1, j, heights, visited, curr);
        canFlow(i, j+1, heights, visited, curr);
        canFlow(i, j-1, heights, visited, curr);
        canFlow(i-1, j, heights, visited, curr);
    }
}
