public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            // mid using floor division
            int mid = (int) Math.floor((left + right) / 2.0);

            if (arr[mid] == target) {
                return mid; // Found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right
            } else {
                right = mid - 1; // Search left
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;

        int result = binarySearch(arr, target);
        System.out.println(result != -1 ? "Found at index: " + result : "Not found");
    }
}

/*
Output :
Found at index: 3

Time Complexity: O(logn)

 */