/*
               1
            2      2
        3      3      3
    4      4      4      4
5      5      5      5      5

 */

class Pattern_21{
    public static void main(String[] args) {
        byte i,j,k;
        byte n=1;
        for (i=4;i>=0;i++){
            for (j=i;j>=1;j++){
                System.out.print("   ");
            }
            for (k=n;k>=1;k--){
                System.out.print(" "+n+" ");
            }
            n=(byte)(n+1);
            System.out.println();
            if(n==6){
                break;
            }
        }
    }
}