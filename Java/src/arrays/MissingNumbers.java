package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {13,12,10,8};
		
		int min = Arrays.stream(a).min().orElse(0);
		int max = Arrays.stream(a).max().orElse(0);
		
		 LinkedList<Integer> set = new LinkedList<>();
		
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
			
		}
		
		List<Integer> missing= new ArrayList<>();
		
		for(int i=min;i<=max;i++) {
			if(!set.contains(i)) {
				missing.add(i);
			}
		}
		
		System.out.println(missing);
		System.out.println(missing.get(0));
		System.out.println(missing.get(missing.size()-1));
		

	}

}
