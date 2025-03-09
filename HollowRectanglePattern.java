class HollowRectanglePattern{
    public static void main(String[] args) {
        byte n=5;
        byte m=4;
        byte i,j;
        for (i=1;i<=m;i++){
            for (j=1;j<=n;j++){
                if (i==1 || j==1 || i==m || j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}