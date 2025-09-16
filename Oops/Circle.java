// Parent class
class Circle {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }
}

// Child class 1: Calculates Area
class AreaCircle extends Circle {
    AreaCircle(double r) {
        super(r);
    }

    public void displayArea() {
        double area = 3.1416 * radius * radius;
        System.out.println("Area: " + area);
    }
}

// Child class 2: Calculates Circumference
class PerimeterCircle extends Circle {
    PerimeterCircle(double r) {
        super(r);
    }

    public void displayPerimeter() {
        double perimeter = 2 * 3.1416 * radius;
        System.out.println("Perimeter: " + perimeter);
    }
}

// Main class
class SimpleHierarchicalInheritance {
    public static void main(String[] args) {
        // AreaCircle object
        AreaCircle aCircle = new AreaCircle(5);
        aCircle.displayRadius();  // inherited from Circle
        aCircle.displayArea();    // own method

        System.out.println();

        // PerimeterCircle object
        PerimeterCircle pCircle = new PerimeterCircle(5);
        pCircle.displayRadius();      // inherited from Circle
        pCircle.displayPerimeter();   // own method
    }
}


/*
Output
Radius: 5.0
Area: 78.54

Radius: 5.0
Perimeter: 31.416

*/