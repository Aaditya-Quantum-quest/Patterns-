/*
    1 2 3 4 5 
    2 3 4 5 6
    3 4 5 6 7
    4 5 6 7 8
    5 6 7 8 9 

 */

 class Pattern_14{
    public static void main(String[] args) {
        byte i,j;
        byte n;
        for(i=1;i<=5;i++){
            n=i;
            for(j=1;j<=5;j++){
                System.out.print(n+" ");
                n = (byte) (n+1);
            }
            System.out.println();
        }
    }
 }