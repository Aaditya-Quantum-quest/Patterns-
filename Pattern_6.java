/*  1  2  3  4  5 
    6  7  8  9 10
   11 12 13 14 15 
   16 17 18 19 20
   21 22 23 24 25
*/   

class Pattern_6{
    public static void main (String[] args) {
     Ptrn_6 P6 = new Ptrn_6() ;
    }
}

class Ptrn_6{
    byte j;
    Ptrn_6() {
       for (j=1;j<=25;j++)  {
        // For Correct indentation
        if (j <= 9) {
            System.out.print(" "+j+" ");
        }else{
           System.out.print(j);
           System.out.print(" ");
        }
           if (j % 5 ==0) {
               System.out.print("\n");
           }
       }
    }
}