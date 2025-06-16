package arrays;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] a = {21, 31, 4, 90, 31, 3, 4, 21};

        Set<Integer> uniqueValues = new HashSet<>();
        Set<Integer> duplicates = new LinkedHashSet<>();

        // Using standard for loop
//        for (int i = 0; i < a.length; i++) {
//            uniqueValues.add(a[i]);
//        }
////        
        for (int i = 0; i < a.length; i++) {
            if (!uniqueValues.add(a[i])) {
                // If already present in 'seen', it's a duplicate
                duplicates.add(a[i]);
            }
        }

        System.out.println("Duplicate values: " + duplicates);

        System.out.println("Array without duplicates: " + uniqueValues);
    }
}
