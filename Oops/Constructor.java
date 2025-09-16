class Constructor {
    String color;
    String type;

    // 1️⃣ Default Constructor (provided automatically if none defined)
    // But since we’re defining others, we’ll explicitly write a no-arg constructor too:

    // 2️⃣ Non-Parameterized Constructor (Explicit No-Arg)
    Constructor() {
        System.out.println("Non-Parameterized Constructor Called");
        color = "Blue";
        type = "Ball Pen";
    }

    // 3️⃣ Parameterized Constructor
    Constructor(String c, String t) {
        System.out.println("Parameterized Constructor Called");
        color = c;
        type = t;
    }

    public void showDetails() {
        System.out.println("Color: " + color + ", Type: " + type);
    }
}

class TestConstructor {
    public static void main(String[] args) {
        // Using Non-Parameterized Constructor
        Constructor obj1 = new Constructor();
        obj1.showDetails();

        // Using Parameterized Constructor
        Constructor obj2 = new Constructor("Red", "Gel Pen");
        obj2.showDetails();
    }
}


/*
Output :
 
 Non-Parameterized Constructor Called
Color: Blue, Type: Ball Pen
Parameterized Constructor Called
Color: Red, Type: Gel Pen

*/