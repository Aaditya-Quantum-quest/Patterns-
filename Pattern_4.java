/*
     5 5 5 5 5
     4 4 4 4 4
     3 3 3 3 3
     2 2 2 2 2
     1 1 1 1 1
 */

class Pattern_4{
    public static void main(String[] args) {
        for(byte i=5;i>=1;i=(byte) (i-1) ){
            for (byte j=1;j<=5;j=(byte) (j+1)){
                System.out.printf("%2d",i);
            }
            System.out.print("\n");
        }
    }
}