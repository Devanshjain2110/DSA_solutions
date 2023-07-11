package Pattern;

/*
 * * * * *
  * * * *
   * * *
    * *
     *
 */
public class Pat11 {
    public static void main(String[] args) {
        for(int index  = 0; index<=4; index++){
            for(int i = index; i > 0; i--){
                System.out.print(" ");
            }

            for(int i = 9-index*2; i>0; i--){
                if(i%2==0){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            for(int i = index; i > 0; i--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
