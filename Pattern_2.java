/*
     1 1 1 1 1
     2 2 2 2 2
     3 3 3 3 3
     4 4 4 4 4
     5 5 5 5 5
 */

class Pattern_2{
    public static void main(String[] args) {
        for(byte i=1;i<=5;i=(byte) (i+1) ){
            for (byte j=0;j<=5;j=(byte) (j+1)){
                System.out.printf("%2d",i);
            }
            System.out.print("\n");
        }
    }
}