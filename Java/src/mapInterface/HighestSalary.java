package mapInterface;

import java.util.HashMap;

import java.util.*;

public class HighestSalary {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("Naveen", 50000);
        map.put("Sai", 300000);
        map.put("kohli", 10000);
        map.put("viart", 1000000);

        Map.Entry<String, Integer> secondHighest = map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondHighest.getKey() + " - " + secondHighest.getValue());
    }
}
