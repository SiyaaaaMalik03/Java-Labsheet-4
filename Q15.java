class HospitalSystem {

    private String HospitalName = "City Hospital";

    void displaySystem() {
        System.out.println("Hospital: " + HospitalName);

        Employee e = new Employee();
        Doctor d = new Doctor();
        Pharmacist p = new Pharmacist();

        e.work();
        d.treatPatient();
        p.provideMedicine();
    }

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
}

public class Q15 {
    public static void main(String[] args) {
        HospitalSystem system = new HospitalSystem();
        system.displaySystem();
    }
}