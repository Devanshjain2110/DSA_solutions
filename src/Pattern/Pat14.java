package Pattern;
/*
 *********
  *     *
   *   *
    * *
     *
 */
public class Pat14 {
    public static void main(String[] args) {
        for (int i = 0; i <9 ; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 4; i > 0 ; i--) {
            for (int j = 4-i; j >= 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 2*i-1; j > 0; j--) {
                if(j==1 || j==2*i-1){
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            for (int j = 4-i; j >= 0 ; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
