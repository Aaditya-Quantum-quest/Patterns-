/*
     1 2 3 4 5
     1 2 3 4 5
     1 2 3 4 5
     1 2 3 4 5
     1 2 3 4 5
 */

class Pattern_3{
    public static void main(String[] args) {
        for(byte i=1;i<=5;i=(byte) (i+1) ){
            for (byte j=1;j<=5;j=(byte) (j+1)){
                System.out.printf("%2d",j);
            }
            System.out.print("\n");
        }
    }
}