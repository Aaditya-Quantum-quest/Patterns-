/*
      1 0 1 0 1
      0 0 0 0 0
      1 0 1 0 1
      0 0 0 0 0
      1 0 1 0 1
*/

class Pattren_17 {
    public static void main(String[] args) {
        byte i, j, k;
        byte x = 1;
        byte y = 0;
        byte counter = 1;
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 5; j++) {
                if (x == 0) {
                    System.out.printf("%2d", x);
                    x++;
                } else {
                    System.out.printf("%2d", x);
                    x--;
                }
            }
            if (counter <= 2) {
                counter++;
                System.out.println();
                for (k = 1; k <= 5; k++) {
                    System.out.printf("%2d", y);
                }
                System.out.println();
            }
        }
    }
}