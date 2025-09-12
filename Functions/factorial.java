class factorial {
    public static void main(String[] args) {
        int n = 5;
       fact(n);
    }
    public static void fact(int n) {
        if(n<=0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;
        while(n>0) {
            factorial *= n;
            n--;
        }
        System.out.println(factorial);
    }
}

//Output : 120