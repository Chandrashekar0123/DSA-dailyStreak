class BasicArray {
    public static void main(String[] args) {
        int[] marks = new int[6];
        marks[0] = 95;
        marks[1] = 98;

        //marks[2] = 0;

        marks[3] = 95;
        marks[4] = 99;
        marks[5] = 100;
        

System.err.println("Marks of Subject 1 : " + marks[0]);
System.err.println("Marks of Subject 2 : " + marks[1]);
System.err.println("Marks of Subject 3 : " + marks[2]);  //If not defined java will take as 0
System.err.println("Marks of Subject 4 : " + marks[3]);
System.err.println("Marks of Subject 5 : " + marks[4]);
System.err.println("Marks of Subject 6 : " + marks[5]);
    }
}

/*

Output

Marks of Subject 1 : 95
Marks of Subject 2 : 98
Marks of Subject 3 : 0
Marks of Subject 4 : 95
Marks of Subject 5 : 99
Marks of Subject 6 : 100

*/