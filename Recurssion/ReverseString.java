public class ReverseString {
public static void Reverse(int index, String s){
    if(index == 0) {
        System.out.println(s.charAt(index) + " ");
        return;
    }
    System.out.print(s.charAt(index) + " ");
    Reverse(index-1, s);
}

    public static void main(String[] args) {
        String str = "Chandu";
        Reverse(str.length()-1, str);
    }
}

/*

Output : u d n a h C 
Time Complexity : O(n)

 */