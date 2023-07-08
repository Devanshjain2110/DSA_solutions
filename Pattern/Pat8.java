package Pattern;
/*
     *
    ***
   *****
  *******
 *********
*/
public class Pat8 {
    public static void main(String[] args) {
        for (int i = 0; i < 5 ; i++) {
                 for (int x = 4; x > i; x--){
                     System.out.print(" ");
                 }

                 for(int y =0 ; y <= 2*i; y++ ){
                     System.out.print("*");
                 }
            for (int z = 4; z > i; z--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
