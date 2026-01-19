package linkedhashset;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {4,5,4,2,3,4,2,6,8,8};
		Set<Integer> s = new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			s.add(a[i]);
		}
		System.out.println(s);

	}

}
