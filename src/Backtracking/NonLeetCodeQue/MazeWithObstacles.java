package Backtracking.NonLeetCodeQue;
// Not a backtracking problem, just a start for it
// Here we imagine a 3x3 maze
public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        path("", 0 , 0 , board);
    }

    static void path(String p,int r, int c, boolean[][] maze){
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length-1){
            path(p+"D", r+1, c,maze);
        }
        if(c<maze[0].length-1){
            path(p+"R", r, c+1,maze);
        }
        if(r>1 && c>1){
            path(p+"C", r+1, c+1,maze);
        }
    }
}
