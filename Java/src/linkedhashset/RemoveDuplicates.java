package linkedhashset;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {4,5,4,2,3};
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			s.add(a[i]);
		}
		System.out.println(s);

	}

}
