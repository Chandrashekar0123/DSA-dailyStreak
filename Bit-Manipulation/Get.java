class get {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;

        if((bitMask & n) == 0) {
          System.out.println("GET Bit at pos " + pos + " : 0");
        } else {
            System.out.println("GET Bit at pos " + pos + " : 1");
        }
    }
}


//Output : GET Bit at pos 2 : 1