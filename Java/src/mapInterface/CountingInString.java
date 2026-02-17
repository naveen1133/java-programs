package mapInterface;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CountingInString {
    public static void main(String[] args) {
        String s = "naveena";

        Map<Character, Long> frequencyMap = s.chars()                          // IntStream of char codes
                .mapToObj(c -> (char) c)                                       // Convert to Character
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,     // Group by character
                        Collectors.counting()));                               // Count occurrences
                System.out.println(frequencyMap);
                 
                List<Integer> numbers = Arrays.asList( 1,2,45,34,43,54,45,1,3);
                Map<Object, Long> frequency = numbers.stream().collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,Collectors.counting()));
                System.out.println(frequency);
                
    }
    
}
