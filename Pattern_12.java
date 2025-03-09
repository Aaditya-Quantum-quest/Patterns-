/*
    5 10 15 20 25
    4  9  14 19 24
    3  8  13 18 23
    2  7  12 17 22
    1  6  11 16 21
*/

class Pattern_12{
    public static void main(String[] args) {
        byte i , j;
        for (i=5;i>=1;i--){
            byte x=i;
            for (j=1; j<=5; j++){
                System.out.printf("%3d", x);
                x=(byte) (x+5);
            }
            System.out.println();
        }
    }
}