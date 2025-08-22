package methods;

public class BasicMethod {

    // Define the method outside main
    public static void add(int a, int b) {
        int c = a + b;
        System.out.println("Sum = " + c);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Call the method
        add(a, b);
    }
}
