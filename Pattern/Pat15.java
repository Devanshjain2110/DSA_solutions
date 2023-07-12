package Pattern;
/*
     *
    * *
   *   *
  *     *
 *       *
  *     *
   *   *
    * *
     *
 */
public class Pat15 {
    public static void main(String[] args) {
        patTop();
        PatBot();
    }

    static void patTop(){
        for (int i = 0; i <=4 ; i++) {
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
    }

    static void PatBot(){
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
