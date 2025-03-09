/*
     1 1 1 2 1 3
     2 1 2 2 2 3
     3 1 3 2 3 3
     4 1 4 2 4 3
     5 1 5 2 5 3
 */

class Pattern_9{
    public static void main(String[] args) {
        byte n=5;
        byte x;
        for (byte i=1;i<=n;i=(byte) (i+1)){
            x=i;
            for (byte j=1;j<=3;j++){
                System.out.printf("%2d",x);
                System.out.printf("%2d",j);
            }
            System.out.println();
        }
    }
}