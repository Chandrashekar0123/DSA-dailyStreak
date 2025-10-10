import java.util.HashMap;

public class HighFreq {

    public static void majorityElement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println("Majority element is: " + key);
                return;
            }
        }
        System.out.println("No majority element");
    }               
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 1, 1, 1, 4, 5, 6};
        majorityElement(arr);
    }
}

/*
OUTPUT :
Majority element is: 1
*/