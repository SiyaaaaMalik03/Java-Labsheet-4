class Pharmacy {
    static String pharmacyName = "City Pharmacy";
    static String location = "Roorkee";

    void display() {
        System.out.println("Pharmacy Name: " + pharmacyName);
        System.out.println("Location: " + location);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Pharmacy p1 = new Pharmacy();
        Pharmacy p2 = new Pharmacy();

        p1.display();
        p2.display();
    }
}