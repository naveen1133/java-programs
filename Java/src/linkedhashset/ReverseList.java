package linkedhashset;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {4,6,2,4,1};
		LinkedList<Integer> s= new LinkedList<>();
		for(int num: a) {
			s.add(num);
		}
		Collections.reverse(s);
		System.out.println(s);
		
	}

}
