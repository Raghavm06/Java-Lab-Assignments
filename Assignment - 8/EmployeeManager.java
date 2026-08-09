class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee Name: " + name);
    }
}

class Manager extends Employee {

    String name;

    Manager(String name) {
        super("Raghav");
        this.name = name;
    }

    void display() {
        System.out.println("Employee Name: " + super.name);
        System.out.println("Manager Name: " + name);
        super.display();
    }
}

public class EmployeeManager {

    public static void main(String[] args) {

        Manager m = new Manager("Manager");

        m.display();
    }
}