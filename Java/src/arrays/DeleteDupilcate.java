package arrays;

import java.util.List;

public class DeleteDupilcate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = {21,31,4,90,31,3,4,21};
		int c=0;
		
		for (int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] == a[j]) {
					c++;
				//System.out.println(a[j]);
				
			}
		}
		 

	}
		System.out.println(c);

	}}
