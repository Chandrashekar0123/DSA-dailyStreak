class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ChandraShekar");
        for(int i = 0; i < sb.length()/2; i++) {
            int start = i;
            int end = sb.length()-1-i;

           char startchar = sb.charAt(start);
           char endchar = sb.charAt(end);
           
           sb.setCharAt(start, endchar);
           sb.setCharAt(end, startchar);
        }
          System.out.println(sb);
    }
}

//Output : rakehSardnahC