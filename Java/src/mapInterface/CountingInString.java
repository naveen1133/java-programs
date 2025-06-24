package mapInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class CountingInString {
    public static void main(String[] args) {
        String s = "naveena";

        Map<Character, Long> frequencyMap = s.chars()                          // IntStream of char codes
                .mapToObj(c -> (char) c)                                       // Convert to Character
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new,     // Group by character
                        Collectors.counting()));                               // Count occurrences

//        frequencyMap.forEach((ch, count) -> 
                System.out.println(frequencyMap);
    }
}
