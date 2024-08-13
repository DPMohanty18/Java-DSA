class pattern{
    public static void main(String[] args) {
        patt2(5);
    }

    static void patt(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patt2(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row: row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patt1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = n; col >= row ; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}