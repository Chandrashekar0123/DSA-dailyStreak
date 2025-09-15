class MergeSort {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        // Merge the two sorted halves
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        // Copy remaining elements
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy back to original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) { // base case
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);        // left part
        divide(arr, mid + 1, ei);    // right part
        conquer(arr, si, mid, ei);   // merge
    }

    public static void main(String[] args) {
        int arr[] = {2, 6, 3, 8, 4, 0, 6, 3, 8, 2, 4, 8, 9, 1};
        int n = arr.length;
        divide(arr, 0, n - 1);

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

//Output : 0 1 2 2 3 3 4 4 6 6 8 8 8 9