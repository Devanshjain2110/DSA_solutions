package Pattern;

/*

 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *

 */

public class Pat5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for(int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int x = 3; x >= 0; x--) {
            for (int y = 0; y<=x; y++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
