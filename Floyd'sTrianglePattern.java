class Floyd'sTrianglePattern{
    public static void main(String[] args) {
        byte i,j;
        byte x=1;
        for (i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
    }
}