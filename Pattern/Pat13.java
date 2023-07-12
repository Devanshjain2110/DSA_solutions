package Pattern;
/*
     *
    * *
   *   *
  *     *
 *********
 */
public class Pat13 {
    public static void main(String[] args) {
        for (int i = 0; i <4 ; i++) {
            for (int j = 4-i; j > 0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 2*i; j++) {
                if(j==0 || j==2*i){
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            for (int j = 4-i; j > 0 ; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i <9 ; i++) {
            System.out.print("*");
        }
    }
}
