class PrintRecursion {
    public static void recurse(int n) {
        if (n <= 5) {
            System.out.println(n); // print current number
            recurse(n + 1);        // recursive call
        }
    }
    public static void main(String[] args) {
        int n = 1;
       recurse(n);
    }
}

/*

Output :
1
2
3
4
5
 */