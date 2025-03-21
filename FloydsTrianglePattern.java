/*  

    1
    2  3  
    4  5  6 
    7  8  9  10
    11 12 13 14 15
    
 */

class FloydsTrianglePattern{
    public static void main(String[] args) {
        byte i,j;
        byte x=1;
        for (i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                // for correct indentation
                if(x >= 11){
                    System.out.print(x+" ");
                    x++;
                }else{
                System.out.print(x+"  ");
                x++;
                }
            }
            System.out.println();
        }
    }
}