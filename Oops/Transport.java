// Grandparent class
class Transport {
    String brand = "Toyota";

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Parent class (Child of Transport)
class Car extends Transport {
    String model = "Corolla";

    public void displayModel() {
        System.out.println("Model: " + model);
    }
}

// Child class (Child of Car)
class ElectricCar extends Car {
    int batteryCapacity = 100;

    public void displayBattery() {
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

class MultiInheritance {
    public static void main(String[] args) {
        // Create object of the most derived class
        ElectricCar myTesla = new ElectricCar();

        // Access grandparent method
        myTesla.displayBrand();

        // Access parent method
        myTesla.displayModel();

        // Access child method
        myTesla.displayBattery();

        // Access fields
        System.out.println("Brand: " + myTesla.brand);
        System.out.println("Model: " + myTesla.model);
        System.out.println("Battery: " + myTesla.batteryCapacity);
    }
}


/*
Output
Brand: Toyota
Model: Corolla
Battery Capacity: 100 kWh
Brand: Toyota
Model: Corolla
Battery: 100

*/