class constructordemo {

    int rollNo;
    String name;

    // Default Constructor
    constructordemo() {
        rollNo = 0;
        name = "Unknown";
    }

    // Parameterized Constructor
    constructordemo(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Copy Constructor
    constructordemo(constructordemo s) {
        rollNo = s.rollNo;
        name = s.name;
    }

    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println();
    }

    public static void main(String[] args) {

        constructordemo s1 = new constructordemo();

        constructordemo s2 = new constructordemo(101, "Raghav");

        constructordemo s3 = new constructordemo(s2);

        System.out.println("Default Constructor");
        s1.display();

        System.out.println("Parameterized Constructor");
        s2.display();

        System.out.println("Copy Constructor");
        s3.display();
    }
}