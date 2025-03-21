/*
    1   3   5   7   9 
    3   5   7   9  11
    5   7   9  11  13
    7   9  11  13  15
    9  11  13  15  17 

 */

 class Pattern_15{
    public static void main(String[] args) {
        byte i,j;
        byte x;
        for(i=1;i<=9;i=(byte)(i+2)){
            x=i;
            for(j=1;j<=5;j++){
                // For Correct Indentation
                if (x>=11) {
                    System.out.print(x+"  ");  // 2-Space
                    x = (byte) (x+2);
                }else{
                System.out.print(x+"   "); // 3-Space
                x = (byte) (x+2);
                }
            }
            System.out.println();
        }
    }
 }