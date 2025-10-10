import java.util.HashSet;

public class UnionHash {
    public static int Union(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println("The union is: " + set);
        System.out.println("The size of the union is: " + set.size());
        return set.size();
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {3, 4, 5, 6, 7};
        System.out.println(Union(arr1, arr2));
    }
}

/*OUTPUT :
The union is: [1, 2, 3, 4, 5, 6, 7]
The size of the union is: 7
7
*/