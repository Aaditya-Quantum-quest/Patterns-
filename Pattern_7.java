/*
     1  3  5  7  9
    11 13 15 17 19
    21 23 25 27 29
    31 33 35 37 39
    41 43 45 47 49
 */

class Pattern_7{
    public static void main(String[] args) {
        byte x=1;
        byte n=5;
        for (byte i=1;i<=n;i++){
            for (byte j=1;j<=n;j++){
                System.out.printf("%3d",x);
                x=(byte)(x+2);
            }
            System.out.print("\n");
        }
    }
}