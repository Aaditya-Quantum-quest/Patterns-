/*
    5  6  15  16  25
    4  7  14  17  24
    3  8  13  18  23
    2  9  12  19  22
    1 10  11  20  21

 */
class Pattern_13{
    public static void main(String[] args) {
        byte x=5;
        byte y=6;
        byte i,j;
        for(i=5;i>=1;i--){
            for(j=1;j<=5;j++){
                System.out.print(x);
                System.out.print(y);
                if (x%i==0) {
                    x = (byte)(x+10);
                    System.out.print(x);
                }
                if(y%i==1){
                    
                    
                }

            }
        }
    }
}