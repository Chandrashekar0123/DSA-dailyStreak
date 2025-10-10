import java.util.HashSet;
public class IntersectionHash {
    public static int Intersection(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        int count = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                count++;
                set.remove(arr2[i]); //to avoid counting duplicates
            }
        }
        System.out.println("The intersection count is: " + count);
        return count;
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};
        Intersection(arr1, arr2);
    }
}
/*OUTPUT :
The intersection count is: 3
*/
