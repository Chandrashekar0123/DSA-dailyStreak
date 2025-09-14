class SelectionSort {
    public static void main(String args[]) {
        int[] arr = {4, 2, 6, 5, 8, 5, 9, 2, 8, 1};

        System.out.println("Given Array is:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Selection Sort
        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;  // store index of minimum element
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("Sorted Array using Selection Sort:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/* 
Output :

Given Array is:
4 2 6 5 8 5 9 2 8 1 
Sorted Array using Selection Sort:
1 2 2 4 5 5 6 8 8 9 


Time Complexity : O(n^2)
 */