package Pattern;

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5

public class Pat4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++  ){
                System.out.print( j+1 + " ");
            }
            System.out.println();
        }
    }
}
