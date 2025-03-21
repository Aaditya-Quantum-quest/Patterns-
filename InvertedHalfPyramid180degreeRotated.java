/*
             x
           x x 
         x x x 
       x x x x 
     x x x x x 

 */

class InvertedHalfPyramid180degreeRotated{
    public static void main(String[] args) {
        byte i,j,k;
        for (i=1;i<=5;i++){
            for (j=i;j<5;j++){
                System.out.print("  ");
            }
            for (k=1;k<=i;k++){
                System.out.print(" x");
            }
            System.out.println();
        }
    }
}