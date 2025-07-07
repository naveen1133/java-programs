package streamAPI;

import java.util.stream.Collectors;

import java.util.*;


public class CountNumbers {
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(11, 12, 11, 34, 12, 3, 5);

        Map<Object, Long> s = a.stream()
            .collect(Collectors.groupingBy(n -> n, LinkedHashMap::new, Collectors.counting()));
List<Integer> l = a.stream().distinct().collect(Collectors.toList());
System.out.println(l);
        System.out.println(s);
    }
}

