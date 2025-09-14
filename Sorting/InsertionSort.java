public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2,6,4,8,3,9,3,7,5,0,2};

        System.out.println("Given Array is:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i = 1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        System.out.println("Sorted Array using Insertion Sort:");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

/*
Output :
Given Array is:
2 6 4 8 3 9 3 7 5 0 2
Sorted Array using Insertion Sort:
0 2 2 3 3 4 5 6 7 8 9

Time Complexity : O(n ^ 2)
 */