class Zero-OneTriangle{
    public static void main(String[] args) {
        byte i,j;
        byte x=1;
        for (i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                if (x==0){
                    System.out.print(x);
                    x++;
                } else {
                    System.out.print(x);
                    x--;
                }
            }
            System.out.println();
        }
    }
}