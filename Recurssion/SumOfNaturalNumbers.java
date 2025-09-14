public class SumOfNaturalNumbers {

    public static void Natural(int i, int n, int sum){
        if(n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n;
        Natural(i,n-1,sum);

    }

    public static void main(String[] args) {
        int i = 1, n = 5, sum = 0;
        Natural(i,n,sum);
    }
}

/*
Output : 15
 */