package lambda;
import java.util.function.Function;

public class SquareFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> square = n -> n * n;

        System.out.println(square.apply(5)); 
        
        
        Function<String, String> uc = str -> str.toUpperCase();
        
        System.out.println(uc.apply("Naveen"));
        
        
    }
}
