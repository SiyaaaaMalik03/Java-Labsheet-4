class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}

class Pharmacist extends Employee {
    void dispenseMedicine() {
        System.out.println("Pharmacist dispenses medicine.");
    }
}

public class Q9 {
    public static void main(String[] args) {
        Pharmacist p = new Pharmacist();

        p.work();
        p.dispenseMedicine();
    }
}