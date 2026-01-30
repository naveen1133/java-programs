package mapInterface;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringCount {

	public static void main(String[] args) {
		 List<String> words = Arrays.asList(
	                "apple", "ant", "banana", "ball", "bat",
	                "umbrella", "orange", "owl" ,"ball"
	        );
		
	        Map<String, Long> countMap =
	                words.stream()
	                     .collect(Collectors.groupingBy(
	                         word -> word,LinkedHashMap::new, 
	                         Collectors.counting()
	                     ));

	        Map<Character, String> result =
	                words.stream()
	                     .collect(Collectors.groupingBy(
	                         w -> w.charAt(0),
	                         LinkedHashMap::new,
	                         Collectors.collectingAndThen(
	                             Collectors.toList(),
	                             list -> list.stream().findFirst().get()
	                         )
	                     ));
	        
	        System.out.println(result);
	        
		  System.out.println(countMap);

	}

}
