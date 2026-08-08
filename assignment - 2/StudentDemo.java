public class StudentDemo {

    String name;
    int rollNo;

    // Default Constructor
    StudentDemo() {
        name = "Unknown";
        rollNo = 0;
    }

    // Parameterized Constructor
    StudentDemo(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
    }

    public static void main(String[] args) {

        StudentDemo s1 = new StudentDemo();
        StudentDemo s2 = new StudentDemo("Raghav", 101);

        System.out.println("Default Constructor");
        s1.display();

        System.out.println();

        System.out.println("Parameterized Constructor");
        s2.display();
    }
}