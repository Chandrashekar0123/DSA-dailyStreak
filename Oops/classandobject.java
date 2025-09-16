class Pen {
    String Color;
    String type;

    public void write() {
        System.out.println("Writes Something...");
    }

    public void PrintColor() {
        System.out.println(this.Color);
    }
}

class Student {
    String name;
    int id;
    int age;

    public void printInfo() {
        System.out.println(" Student Name is " + this.name + " of id " + this.id + ". of age " + this.age + " years.");
    }
    

}
class OOPS {
    public static void main(String argssss[]) {
         Pen p1 = new Pen();
         p1.Color = "blue";
         p1.type = "ball pen";
         p1.write();
         p1.PrintColor();

         Pen p2 = new Pen();
         p2.Color = "Red";
         p2.type = "Gel";
         p2.PrintColor();

        Student s1 = new Student();
        s1.age = 20;
        s1.id = 3524;
        s1.name = "Chandu";
        s1.printInfo();
    }
}

 /*

 Output : 
 
Writes Something...
blue
Red
 Student Name is Chandu of id 3524. of age 20 years.

 */