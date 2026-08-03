class Student {

    int rollNo;
    String name;
    double marks1, marks2, marks3;

    // Constructor
    Student(int r, String n, double m1, double m2, double m3) {
        rollNo = r;
        name = n;
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    // Method to calculate percentage
    double calculatePercentage() {
        return (marks1 + marks2 + marks3) / 3;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks 1 : " + marks1);
        System.out.println("Marks 2 : " + marks2);
        System.out.println("Marks 3 : " + marks3);
        System.out.println("Percentage : " + calculatePercentage());
    }

    public static void main(String[] args) {

        Student s = new Student(101, "Raghav", 85, 90, 88);

        s.displayDetails();
    }
}