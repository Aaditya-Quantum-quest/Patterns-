/*
      ****
      ***
      **
      * 
 
 */
class InvertedHalfPyramidPattern{
    public static void main(String[] args) {
        byte i,j;
        for (i=4;i>=1;i--){
            for (j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}