class QuickSort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // pivot index
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) { // base case
            int pividx = partition(arr, low, high);
            quickSort(arr, low, pividx - 1);   // left part
            quickSort(arr, pividx + 1, high);  // right part
        }
    }

    public static void main(String[] args) {
        int arr[] = {8, 4, 6, 2, 0, 4, 3, 8, 4, 9};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


//Output : 0 2 3 4 4 4 6 8 8 9