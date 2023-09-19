package Backtracking.NonLeetCodeQue;

// Not a backtracking problem, just a start for it
// Here we imagine a 3x3 maze
public class MazeProblem {
    public static void main(String[] args) {
        path("",3,3);
    }

    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }

        int left = count(r-1, c);
        int right = count(r, c-1);
        return left + right;
    }

// Including Diagonal
    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            path(p+"D", r-1, c);
        }
        if(c>1){
            path(p+"R", r, c-1);
        }
        if(r>1 && c>1){
            path(p+"C", r-1, c-1);
        }
    }
}
