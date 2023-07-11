package Pattern;
/*
 * * * * *
  * * * *
   * * *
    * *
     *
     *
    * *
   * * *
  * * * *
 * * * * *

 */
public class Pat12 {
    public static void main(String[] args) {
        pat2();
        pat1();
    }

    static void pat1(){
        for(int index= 4; index >=0; index--){
            for(int i = index; i >0; i--){
                System.out.print(" ");
            }
            for(int i = 9 - index*2; i>0; i--){
                if(i%2==0) {System.out.print(" ");}
                else{
                    System.out.print("*");
                }
            }
            for(int i = index; i >0; i--){
                System.out.print(" ");
            }
            System.out.println();
        }}

        static void pat2(){
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

