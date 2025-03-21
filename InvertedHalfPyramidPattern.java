/*
      x x x x x
      x x x x 
      x x x 
      x x 
      x     
 
 */
class InvertedHalfPyramidPattern{
    public static void main(String[] args) {
        byte i,j;
        for (i=5;i>=1;i--){
            for (j=i;j>=1;j--){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}