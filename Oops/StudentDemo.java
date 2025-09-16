public class StudentDemo {
    // Private variables: cannot be accessed directly from outside
    private String name;
    private int age;
    private double gpa;

    // Constructor
    public StudentDemo(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter for GPA
    public double getGpa() {
        return gpa;
    }

    // Setter for GPA with validation
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 10.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA!");
        }
    }

    // Display student info
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }

    // Main method
    public static void main(String[] args) {
        // Create student object
        StudentDemo student = new StudentDemo("Alice", 20, 8.5);

        // Access and display data using getters
        student.displayInfo();
        System.out.println();

        // Modify data using setters
        student.setName("Bob");
        student.setAge(22);
        student.setGpa(9.2);

        // Display updated data
        student.displayInfo();

        // Try invalid data
        student.setAge(-5);
        student.setGpa(15);
    }
}

/*
OUTPUT :
Name: Alice
Age: 20
GPA: 8.5

Name: Bob
Age: 22
GPA: 9.2
Invalid age!
Invalid GPA!
*/