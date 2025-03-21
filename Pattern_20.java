/*
               x  x  x  x  x
            x  x  x  x  x     
         x  x  x  x  x
      x  x  x  x  x 
   x  x  x  x  x 
 */

class Pattern_20{
    public static void main(String[] args) {
        byte i,j,k;
        for (i=4;i>=0;i--){
            for (j=i;j>=0;j--){
                System.out.print("   "); // 3-space
            }
            for(k=1;k<=5;k++){
                System.out.print("x  "); // 2-space
            }
            System.out.println();
        }
        
    }
}