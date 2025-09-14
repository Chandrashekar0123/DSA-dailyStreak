public class TilingProblem {

    // Recursive function to count ways
    public static int countWays(int m, int n) {
        // Base cases
        if (n == 0 || n == 1) {
            return 1;
        }
        // Place one vertical tile
        int vertical = countWays(m, n - 1);

        // Place two horizontal tiles
        int horizontal = countWays(m, n - 2);

        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int m = 2;  // Height of floor (usually 2 for classic problem)
        int n = 4;  // Length of floor

        int totalWays = countWays(m, n);
        System.out.println("Number of ways to tile " + m + "x" + n + " floor: " + totalWays);
    }
}

//Output : Number of ways to tile 2x4 floor: 5
