class CopyConstructor {
    String color;
    String type;

    // Parameterized constructor
    CopyConstructor(String c, String t) {
        color = c;
        type = t;
    }

    // Copy constructor
    CopyConstructor(CopyConstructor p) {
        this.color = p.color;
        this.type = p.type;
    }
}

class Main{
    public static void main(String[] args) {
        CopyConstructor p1 = new CopyConstructor("Black", "Gel");
        CopyConstructor p2 = new CopyConstructor(p1); // copying p1 into p2

        System.out.println(p2.color); // Black
    }
}


//Output : Black