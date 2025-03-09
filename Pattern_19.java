/* 
   0 0 0 0 0
   1 1 1 1 1
   0 0 0 0 0 
   1 1 1 1 1 
   0 0 0 0 0 
*/

class Pattern_19{
    public static void main (String[] args) {
        byte i, j;
        byte x=0;
        for(i=1;i<=5;i++){
            if(x==0){
                for(j=1;j<=5;j++){
                    System.out.printf("%2d",x);
                }
                x++;
                System.out.println();
            }
            else{
                for(j=1;j<=5;j++){
                    System.out.printf("%2d",x);
                }
                x--;
                System.out.println();
            }
        }
    }
}