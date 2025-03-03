package arrays;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {24,421,848,0,67};
		int max =  a[0];
//		for(int b: a) {
//			if(b>max) {
//				max = b;
//			}
//		}
		

		for(int i=1; i< a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
			
		}
		System.out.println(max);
		
		int largest = sorting();
		System.out.println("Sorted array: " +largest);

	}

	
	 static int sorting() {
		int[] a = {24,421,848,0,67};
		 Arrays.sort(a);
		 return a[0];
		
		
	}
}
