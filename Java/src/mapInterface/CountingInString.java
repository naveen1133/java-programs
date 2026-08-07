package mapInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CountingInString {
    public static void main(String[] args) {
        String s = "bnaveenak";

        Map<Character, Long> frequencyMap = s.chars()                          // IntStream of char codes
                .mapToObj(c -> (char) c)                                       // Convert to Character
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,     // Group by character
                        Collectors.counting()));                               // Count occurrences
                System.out.println(frequencyMap);
                
                Character firstNonRepeating= s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,     // Group by character
                        Collectors.counting())).entrySet().stream().filter(e -> e.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
                
                System.out.println(firstNonRepeating);
    }
}
