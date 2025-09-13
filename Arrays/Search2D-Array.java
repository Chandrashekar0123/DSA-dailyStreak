class Search2DArray {

    public static void linearSearch(int[][] arr, int x) {

         for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {

            if (arr[i][j] == x) {
                System.out.println("Element found at row " + (i+1) + ", column " + (j+1));
                return; // stop after first match
            }
            }
        }
        System.out.println("Element not Found");
    }

    public static void main(String[] args) {
          int[][] arr = {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                        };
        int x = 6;

        // call the void method
        linearSearch(arr, x);
    }
}

//Output : Element found at row 2, column 3