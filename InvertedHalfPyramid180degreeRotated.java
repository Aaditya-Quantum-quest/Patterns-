class InvertedHalfPyramid180degreeRotated{
    public static void main(String[] args) {
        byte i,j,k;
        for (i=1;i<=4;i++){
            for (j=i;j<4;j++){
                System.out.print(" ");
            }
            for (k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}