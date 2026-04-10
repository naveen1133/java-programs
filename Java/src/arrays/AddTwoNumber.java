package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTwoNumber {
	public static void main(String[] args) {
		int[] a = {21,31,4,90,31,3,21};
		List<Integer> b = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] + a[j] == 42) {
					b.add(a[i]);
					b.add(a[j]);
					break;
				}
			}
		}
		System.out.println(b);
	}
}
