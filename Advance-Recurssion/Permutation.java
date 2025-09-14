class PrintRecursion {

    public static void printPerm(String str, String Perm) {

          if(str.length() == 0) {
            System.out.println(Perm);
            return;
          }

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String newPerm = str.substring(0,i) + str.substring(i+1);

            printPerm(newPerm, Perm + ch);
        }
    }
    public static void main(String[] args) {
        String str = "abcef";
        printPerm(str, "");
        
    }
}

/*

OutPut :
abc
acb
bac
bca
cab
cba

Time Complexity : O(n!)

*/