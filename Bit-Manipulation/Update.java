class UpdateBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int newBit = 0;

        int bitmask = 1 << pos;
        int newNumber;

        if (newBit == 0) {
            newNumber = n & ~bitmask;
        } else {
            newNumber = n | bitmask;
        }

        System.out.println("Original number: " + n);
        System.out.println("After updating bit at position " + pos + " to " + newBit + ": " + newNumber);
    }
}



/* 
Output : 
Original number: 5
After updating bit at position 1 to 0: 5

*/