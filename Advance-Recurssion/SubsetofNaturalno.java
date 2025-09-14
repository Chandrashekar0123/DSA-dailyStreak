import java.util.*;

public class SubsetofNaturalno {

    // Recursive function to generate subsets
    public static void findSubsets(int n, int current, List<Integer> subset, List<List<Integer>> result) {
        // Base case: processed all numbers
        if (current > n) {
            result.add(new ArrayList<>(subset));
            return;
        }

        // Choice 1: Include current number
        subset.add(current);
        findSubsets(n, current + 1, subset, result);

        // Backtrack and Choice 2: Exclude current number
        subset.remove(subset.size() - 1);
        findSubsets(n, current + 1, subset, result);
    }

    public static void main(String[] args) {
        int n = 3;  // First n natural numbers
        List<List<Integer>> result = new ArrayList<>();
        findSubsets(n, 1, new ArrayList<>(), result);

        // Print all subsets
        System.out.println("All subsets of first " + n + " natural numbers:");
        for (List<Integer> s : result) {
            System.out.println(s);
        }
    }
}

/*
Output :
All subsets of first 3 natural numbers:
[1, 2, 3]
[1, 2]
[1, 3]
[1]
[2, 3]
[2]
[3]
[]

*/