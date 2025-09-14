public class SubsetsBacktracking {

    public static void printSubsets(int n, int current, String subset) {
        if (current > n) {
            System.out.println(subset); 
            return;
        }

        // Choice 1: Include current number
        printSubsets(n, current + 1, subset + current + " ");

        // Choice 2: Exclude current number
        printSubsets(n, current + 1, subset);
    }

    public static void main(String[] args) {
        int n = 3; 
        System.out.println("All subsets of first " + n + " natural numbers:");
        printSubsets(n, 1, "");
    }
}


/*

Output : 
All subsets of first 3 natural numbers:
1 2 3
1 2
1 3
1
2 3
2
3


O(2ⁿ) → each number has 2 choices.

O(n) space for the recursion stack.

*/