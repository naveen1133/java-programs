package lambda;
@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Using Lambda Expression
        Calculator sum = (a, b) -> a + b;
        System.out.println("Sum: " + sum.add(15, 3));
    }
}
