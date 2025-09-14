class TotalPath  {
    public static int count(int i, int j, int n, int m) {
        if(i == n || j == m) return 0;

        if(i == n-1 && j == m-1) return 1;

        //left 
        return count(i+1, j, n, m) + count(i, j+1, n, m);
        
        //right count(i, j+1, n, m)
    }
    public static void main(String[] args) {

        System.err.println("Total Path to reach Destination is : " + count(0, 0, 3, 3));
        
    }
}
 

/*
Output :
Total Path to reach Destination is : 6

*/