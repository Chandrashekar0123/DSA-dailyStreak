public class Fibonacci {
    public static void fibo(int f1,int f2, int n) {
        if(n == 0){
            return;
        }
        int fib = f1 + f2;
        System.out.print(fib+ " ");
        fibo(f2,fib,n-1);
    }
    public static void main(String[] args) {
        int a = 0, b = 1, n = 10;
        System.out.print(a + " " + b + " ");
        fibo(a,b,n-2);
    }
}

//Output : 0 1 1 2 3 5 8 13 21 34 