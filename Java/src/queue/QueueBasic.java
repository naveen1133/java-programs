package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> a = new LinkedList<Integer>();

		a.add(12);
		a.add(5);
		
		System.out.println(a);
		
		int b= a.remove();
		System.out.println(b);
		
		System.out.println(a);
	}

}
