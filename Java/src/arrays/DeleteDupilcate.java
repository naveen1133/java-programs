package arrays;

import java.util.ArrayList;
import java.util.List;

public class DeleteDupilcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = {21,31,4,90,31,3,4,21};

		List<Integer> b = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			if(!b.contains(a[i])) {
				b.add(a[i]);
			}
		}
		System.out.println(b);
	}}
