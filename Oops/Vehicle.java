// Parent class
class Vehicle {
    String brand = "Toyota";

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Child class
class Car extends Vehicle {  // Single Inheritance
    String model = "Corolla";

    public void displayModel() {
        System.out.println("Model: " + model);
    }
}

class SingleInheritance {
    public static void main(String[] args) {
        // Create object of child class
        Car myCar = new Car();

        // Access parent class method
        myCar.displayBrand();   // Inherited method

        // Access child class method
        myCar.displayModel();   // Own method

        // Access parent class field
        System.out.println("Brand field: " + myCar.brand);

        // Access child class field
        System.out.println("Model field: " + myCar.model);
    }
}


/*
Output
Brand: Toyota
Model: Corolla
Brand field: Toyota
Model field: Corolla
*/