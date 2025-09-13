class ClearBit {
    public static void main(String[] args) {
        int n = 5;             
        int pos = 2;            

        int bitmask = 1 << pos; 
        int newNumber = n & ~bitmask; 
        
        System.out.println("Original number: " + n);
        System.out.println("After clearing bit at position " + pos + ": " + newNumber);
    }
}


/* Output :
Original number: 5
After clearing bit at position 2: 1

*/