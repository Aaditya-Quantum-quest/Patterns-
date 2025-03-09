/*
    * * * * *
    * * * * *
    * * * * *
    * * * * *
    * * * * *
 */

class Pattern_1{
    public static void main(String[] args) {
        for(byte i=0; i<=5;i=(byte) (i+1)){
            for(byte j=0;j<=5;j=(byte) (j+1)){
                System.out.printf("* ");
            }
            System.out.print("\n");
        }
    }
}