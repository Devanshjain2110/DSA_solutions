package Pattern;

/*
     *
    **
   ***
  ****
 *****
*/
public class Pat6 {
    public static void main(String[] args) {
        for(int i = 4; i>= 0; i--){
            for(int j = 0; j <= i-1; j++){
                System.out.print(" ");
            }
            for(int x = i; x<=4; x++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
