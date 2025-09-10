class PalindromicPattern {
    public static void main(String[] args) {
        int n = 5;  // Number of rows

        for (int i = 1; i <= n; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print ascending numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}


/*
Output

        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

*/