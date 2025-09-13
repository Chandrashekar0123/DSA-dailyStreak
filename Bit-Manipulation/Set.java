class SetBit {
    public static void main(String[] args) {
        int n = 5;             
        int pos = 1;           

        int bitmask = 1 << pos; 

        // Set bit using OR
        int newNumber = n | bitmask;

        System.out.println("Original number: " + n); 
        System.out.println("After setting bit at position " + pos + ": " + newNumber);
    }
}


// Output :
// Original number: 5
// After setting bit at position 1: 7