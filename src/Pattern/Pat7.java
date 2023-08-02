package Pattern;
/*
 *****
  ****
   ***
    **
     *
*/

public class Pat7 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int x = 0; x < i  ; x++) {
                System.out.print(" ");
            }
            for (int j = i; j < 5 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
