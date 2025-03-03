package arrays;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int a[]= {10,15,20,15,45,20};
//		 
//		List<Integer> b= new ArrayList<>();
//
//		for(int i=0;i<a.length;i++) {
//			if(!b.contains(a[i])) {
//				b.add(a[i]);
//			}
//		}
//		System.out.println(b);
//	}
	
	    public static void main(String[] args) {

	        int a[] = { 2,7,11,15 };

	        for (int i = 0; i < a.length - 1; i++) {
	            for (int j = i+1; j < a.length; j++) {
	                if (a[i] + a[j] == 26) {
	                	System.out.println("[" + i + ", " + j + "]");
	                }
	            }
	        }

	    }
	}


