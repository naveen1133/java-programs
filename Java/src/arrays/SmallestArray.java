package arrays;

import java.util.Arrays;

public class SmallestArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {24,421,848,0,67};
		int min =  a[0];
//		for(int b: a) {
//			if(b<min) {
//				min = b;
//			}
//		}
		
		for(int i=0; i< a.length; i++) {
			if(a[i]<min) {
				min = a[i];
			}
			
		}
		System.out.println(min);
//		int smallest = sorting();
//		System.out.println("Sorted array: " +smallest);

	}
//	static int sorting() {
//		int[] a = {24,421,848,0,67};
//		 Arrays.sort(a);
//		 return a[0];
//	}
}
