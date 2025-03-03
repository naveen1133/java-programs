package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerSquare {
    public static void main(String[] args) {
        Consumer<Integer> printSquare = n -> System.out.println("Square: " + (n * n));

        printSquare.accept(4); 
        
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Consumer to print each name
        Consumer<String> printName = name -> System.out.println(name);

        names.forEach(printName);
    }
}
