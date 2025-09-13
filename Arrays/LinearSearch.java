class LinearSearch {

    // void method to search an element
    public static void linearSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index: " + i);
                return; // stop after first match
            }
        }
        System.out.println("Element not Found");
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 7, 4, 8, 4, 9};
        int x = 4;

        // call the void method
        linearSearch(arr, x);
    }
}

//Output : Element found at index: 1