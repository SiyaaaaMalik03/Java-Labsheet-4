class Person {
    void showPerson() {
        System.out.println("This is a person.");
    }
}

class Employee extends Person {
    void showEmployee() {
        System.out.println("This is an employee.");
    }
}

class Manager extends Employee {
    void showManager() {
        System.out.println("This is a manager.");
    }
}

public class Q11 {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.showPerson();
        m.showEmployee();
        m.showManager();
    }
}