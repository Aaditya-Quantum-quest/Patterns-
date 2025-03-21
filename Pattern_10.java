/* 
   1  6  11  16  21 
   2  7  12  17  22 
   3  8  13  18  23
   4  9  14  19  24 
   5 10  15  20  25
*/

class Pattern_10{
    public static void main (String[] args) {
        Ptrn_10 p10 = new Ptrn_10();
    }
}

class Ptrn_10{
    Ptrn_10(){
        byte n=5;
        byte x;
        for (byte i=1;i<=n;i++) {												
            x=i;
            for (byte j=1;j<=5;j++) {
               System.out.printf("%2d ", x);
               x = (byte) (x+n);
            }
            System.out.print("\n");
        }
    }
}