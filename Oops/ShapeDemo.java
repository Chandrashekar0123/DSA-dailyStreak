abstract class Shape {
    // Abstract method
    abstract void area();

    // Normal method
    public void info() {
        System.out.println("This is a 2D shape");
    }
}

class Rectangle extends Shape {
    int length, width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    // Implement abstract method
    void area() {
        System.out.println("Rectangle Area: " + (length * width));
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 3);
        r.info();
        r.area();
    }
}


/*
OUTPUT :
This is a 2D shape
Rectangle Area: 15
*/