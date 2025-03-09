/*
     0 1 0 1 0
     1 0 1 0 1
     0 1 0 1 0
     1 0 1 0 1
     0 1 0 1 0
*/

class Pattren_16{
    public static void main(String[] args) {
        byte i,j;
        byte x=0;
        for (i=1;i<=5;i++){
            for (j=1;j<=5;j++){
                if (x==0){
                    System.out.printf("%2d",x);
                    x++;
                }
                else {
                    System.out.printf("%2d",x);
                    x--;
                }
            }
            System.out.println();
        }
    }
}