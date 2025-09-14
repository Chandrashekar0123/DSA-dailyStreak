class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,6,9,2,7,4,8,4,2,4,5,0,7};
        
        System.out.println("Given Array is : ");
        for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        } 
        System.out.println();

        for(int i = 0; i < arr.length; i ++) {
            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j] ;
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted Array using Buble Sort is : ");
        for(int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        } 
    }
}

/*
Output : 
Given Array is : 
2 6 9 2 7 4 8 4 2 4 5 0 7 
Sorted Array using Bubble Sort is : 
0 2 2 2 4 4 4 5 6 7 7 8 9 


Time Complexity : O(n^2)
 */