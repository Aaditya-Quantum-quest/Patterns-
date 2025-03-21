/*

     x 
     x x 
     x x x
     x x x x 
     x x x x x 

 */

public class HalfPyramidPattern {
    public static void main(String[] args) {
        byte i, j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}