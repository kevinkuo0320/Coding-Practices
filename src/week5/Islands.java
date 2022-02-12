package week5;

public class Islands {
    public int numIslands(char[][] grid) {

        int count =  0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    visit(i, j, grid);
                    count++;
                }
            }
        }

        return count;

    }

    public void visit(int i, int j, char[][] grid) {
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1') {
            return;
        }

        grid[i][j] = 'v';
        visit(i, j + 1, grid);
        visit(i, j - 1, grid);
        visit(i + 1, j, grid);
        visit(i - 1, j, grid);
    }
}
