package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNumberDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(21, 31, 4, 90, 31, 3, 4, 21);

        List<Integer> unique = numbers.stream()
                                      .distinct()
                                      .collect(Collectors.toList());

        System.out.println("List without duplicates: " + unique);
    }
}
