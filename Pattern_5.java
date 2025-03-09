/*
     5 4 3 2 1
     5 4 3 2 1
     5 4 3 2 1
     5 4 3 2 1
     5 4 3 2 1
 */

class Pattern_5{
    public static void main(String[] args) {
        for(byte i=5;i>=1;i=(byte) (i-1) ){
            for (byte j=5;j>=1;j=(byte) (j-1)){
                System.out.printf("%2d",j);
            }
            System.out.print("\n");
        }
    }
}