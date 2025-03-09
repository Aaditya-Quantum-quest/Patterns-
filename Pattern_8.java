/*
   1 1 2 1 3 1 
   1 2 2 2 3 2 
   1 3 2 3 3 3 
   1 4 2 4 3 4 
   1 5 2 5 3 5 
*/

class Pattern_8{
    public static void main (String[] args) {
        Ptrn_8 p8 = new Ptrn_8();
    }
}

class Ptrn_8{
    Ptrn_8(){
        for(byte i=1;i<=5;i++){
            for(byte k=1;k<=3;k++){System.out.printf("%2d",k);
                System.out.printf("%2d",i);
            }
            System.out.print("\n");
        }
    }
}