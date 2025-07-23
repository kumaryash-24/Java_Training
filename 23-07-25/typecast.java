public class typecast {
    public static void main(String[] args) {

        // Widening (Implicit): int → double
        int a = 10;
        double b = a;
        System.out.println("Widening: " + b);

        // Narrowing (Explicit): double → int
        double x = 9.7;
        int y = (int) x;
        System.out.println("Narrowing: " + y);  
    }
}
