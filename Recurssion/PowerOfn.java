public class PowerOfn {
    public static int Power(int n, int x) {
        if (n == 0) return 1;    // x^0 = 1
        if (n == 1) return x;

        return x * Power(n-1, x);
    }

    /*
    ==========================  ((  OR  ))  ==============================
    if(n%2 == 0) {
             return Power(n/2, x) * Power(n/2, x);
          }
    else {
             return Power(n/2, x) * Power(n/2, x) * x;
          }
     */

    public static void main(String[] args) {
        int n = 10, x = 2;
        System.out.println("X^n is : " +Power(n,x));
    }
}



//Output : X^n is : 1024
