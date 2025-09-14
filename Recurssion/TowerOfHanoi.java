public class TowerOfHanoi {
    public static void Tower(int n, String src, String helper, String dest) {
        if(n==1){
            System.out.println("Transfer Disc " + n + " From " + src + " to " + dest);
            return;
        }
        Tower(n-1, src, dest, helper);
        System.out.println("Transfer Disc " + n + " From " + src + " to " + dest);
        Tower(n-1, helper, src, dest);

    }

    public static void main(String[] args) {
        int n = 3;
        Tower(n,"S", "H", "T");
        //System.out.println("Transfer Disc From " + "S" + "to " + "T");
    }
}

/*
Output:
Transfer Disc 1 From S to T
Transfer Disc 2 From S to H
Transfer Disc 1 From T to H
Transfer Disc 3 From S to T
Transfer Disc 1 From H to S
Transfer Disc 2 From H to T
Transfer Disc 1 From S to T

Time Complexity : O(2^n)
 */