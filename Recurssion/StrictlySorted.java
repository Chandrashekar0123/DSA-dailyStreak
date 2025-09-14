public class StrictlySorted {
    public static boolean isStrictlySorted(int[] arr, int idx) {
        if (idx == arr.length - 1) return true; // reached end

        if (arr[idx] >= arr[idx + 1]) return false; // must be strictly increasing

        return isStrictlySorted(arr, idx + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isStrictlySorted(arr, 0)); // true
    }
}

/*

Output : true

Time Complexity:

O(n) (n = length of array)

Space Complexity: O(n) (recursion stack depth)
 */