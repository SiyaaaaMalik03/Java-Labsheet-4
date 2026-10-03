class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}

class Doctor extends Employee {
    void treatPatient() {
        System.out.println("Doctor treats patients.");
    }
}

class Pharmacist extends Employee {
    void provideMedicine() {
        System.out.println("Pharmacist provides medicine.");
    }
}

public class Q10 {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Pharmacist p = new Pharmacist();

        d.work();
        d.treatPatient();

        p.work();
        p.provideMedicine();
    }
}