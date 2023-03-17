package jay.leetcode.dynamic;

public class no63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1)
            return 0;
        int[][] path = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i = 0; i < obstacleGrid.length; ++i){
            if(obstacleGrid[i][0]!=1)
                path[i][0] = 1;
            else
                break;
        }
        for(int j = 0; j < obstacleGrid[0].length; ++j){
            if(obstacleGrid[0][j]!=1)
                path[0][j] = 1;
            else
                break;
        }
        for(int i = 1; i < obstacleGrid.length; ++i){
            for(int j = 1; j < obstacleGrid[0].length; ++j){
                if(obstacleGrid[i][j]==1){
                    path[i][j] = 0;
                    continue;
                }
                path[i][j] = path[i-1][j] + path[i][j-1];
            }
        }

        return path[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }

    public static void main(String[] args) {
        no63 no63 = new no63();
        System.out.println(no63.uniquePathsWithObstacles(new int[][]{{0, 0}, {1, 1,}, {0, 0}}));
    }
}
