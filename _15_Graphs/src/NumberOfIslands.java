/**
 * NUMBER OF ISLANDS
 *
 * QUESTION : given an m * n 2D binary grid which represents a map of 1's (LAND) and 0's (WATER), return the number of islands. You may assume all four edges of the
 * grid are surrounded by water
 * an island is considered as one if it meets one or all of these conditions :
 *  - surrounded by water
 *  - connected adjacent lands ( horizontally or vertically )
 *
 * @Example input :
 *                       water
 *
 *                  0 | 1   1   0   0
 *       water      1 | 1   0   0   0   water
 *                  2 | 0   0   1   0
 *                  3 | 0   0   0   1
 *
 *                          water
 *
 *  OUTPUT : 3
 *  explanation: at index [0][0] ,[0][1] we have two lands connected horizontally and the land at [0][1] is also surrounded by water
 *               at index [1][0], we have two lands connected vertically and the land at [1][0] is also surrounded by water
 *               so those three 1's(land ) form an island
 *
 *               The other two lands are at index [2][2] and [3][3]... WHY ? because they are surrounded by water
 *
 * SOLUTION: lands can be represented as vertices of graph, and we can use dfs to check if they are connected ( to check for the connected horizontally and vertically conditions) and also check
 * those which are not connected but still meet the other conditions...
 *
 * REMEMBER CONNECTED COMPONENTS OF A GRAPH?
 */
public class NumberOfIslands {

    int numIslands(char[][] grid){

        int m = grid.length; // rows length
        int n = grid[0].length; // column length
        boolean[][] visited = new boolean[m][n];
        int numOfIslands = 0;

        for( int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                if( !visited[i][j] && grid[i][j] == '1'){
                    dfs(grid, i, j, visited);
                    numOfIslands++;
                }
            }
        }

        return numOfIslands;
    }


    void dfs(char[][] grid, int row, int col, boolean[][] visited){
        // BASE CASE
        //the first four conditions makes sure the traversal does not go out of the bounds of our grid
        // the fifth does what it says it does
        //the sixth condition checks if we are in water, if we are in water there is no need going further. we stop our traversal for that direction ( up, down , right or left)
        if( row < 0 || col < 0 || row >= grid.length || col >= grid[0].length ||
            visited[row][col]   ||
                grid[row][col] == '0'
        ) return;

        visited[row][col] = true;
        dfs(grid, row, col-1, visited); // go left
        dfs(grid, row-1, col, visited); // go up
        dfs(grid, row, col + 1, visited); // go right
        dfs(grid, row + 1, col, visited); // go down
    }

    public static void main(String[] args) {
        NumberOfIslands islands = new NumberOfIslands();

        char[][] grid = {
                { '1',   '1',   '0',   '0' },
                { '1',   '0',   '0',   '0' },
                { '0',   '0',   '1',   '0' },
                { '0',   '0',   '0',   '1' }
        };

        int ans = islands.numIslands(grid);
        System.out.println(ans);
    }
}
