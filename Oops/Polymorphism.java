class Polymorphism {

    // 1️⃣ add with two int parameters
    int add(int a, int b) {
        System.out.println("Adding two integers");
        return a + b;
    }

    // 2️⃣ add with three int parameters (different number of parameters)
    int add(int a, int b, int c) {
        System.out.println("Adding three integers");
        return a + b + c;
    }

    // 3️⃣ add with double parameters (different data types)
    double add(double a, double b) {
        System.out.println("Adding two doubles");
        return a + b;
    }

    // 4️⃣ add with String parameters (different data type)
    String add(String a, String b) {
        System.out.println("Concatenating two Strings");
        return a + b;
    }

    // 5️⃣ Different return type but different parameter list allowed
    long add(long a, long b) {
        System.out.println("Adding two longs");
        return a + b;
    }
}

class TestPolymorphism {
    public static void main(String[] args) {
        Polymorphism calc = new Polymorphism();

        int sum1 = calc.add(10, 20);                // int version
        int sum2 = calc.add(10, 20, 30);            // 3 ints version
        double sum3 = calc.add(5.5, 2.2);           // double version
        String sum4 = calc.add("Hello ", "World");  // String version
        long sum5 = calc.add(100000000L, 200000000L); // long version

        System.out.println("int (2 params): " + sum1);
        System.out.println("int (3 params): " + sum2);
        System.out.println("double: " + sum3);
        System.out.println("String: " + sum4);
        System.out.println("long: " + sum5);
    }
}


/*
Output

Adding two integers
Adding three integers
Adding two doubles
Concatenating two Strings
Adding two longs
int (2 params): 30
int (3 params): 60
double: 7.7
String: Hello World
long: 300000000

*/