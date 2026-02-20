package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ZeroToFirst {

	public static void main(String[] args) {
		
		List<Integer> a = Arrays.asList (21,0,31,40,0,90,31,0,3,0,4,21);
		List<Integer> b= Stream.concat(a.stream().filter(n -> n ==0), a.stream().filter(n -> n!=0)).collect(Collectors.toList());
		// TODO Auto-generated method stub
		System.out.println(b);
		
	}

}
