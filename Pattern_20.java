class Pattern_20{
    public static void main(String[] args) {
        byte i,j;
        byte n=1;
        for (i=5;i<=1;i--){
            for (j=i;j<=2;j--){
                System.out.print("*");
            }
            for(i=n;i<=1;i--){
                System.out.print(i);
            }
            n++;
        }
        System.out.println();
    }
}