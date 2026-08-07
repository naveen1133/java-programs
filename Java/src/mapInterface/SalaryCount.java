package mapInterface;

import java.util.HashMap;
import java.util.Map;

public class SalaryCount {

	public static void main(String[] args) {
		Map<String, Integer> employeeSalary = new HashMap<>();

		employeeSalary.put("Naveen", 75000);
		employeeSalary.put("Rahul", 95000);
		employeeSalary.put("Priya", 82000);
		employeeSalary.put("Anil", 120000);
		employeeSalary.put("Sneha", 67000);
		employeeSalary.put("Kiran", 110000);
		employeeSalary.put("Ravi", 88000);
		employeeSalary.put("Pooja", 98000);
		employeeSalary.put("Suresh", 105000);
		employeeSalary.put("Divya", 78000);
		
		
		employeeSalary.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println("----------------------");
		
		Map.Entry<String, Integer> secondHighest = employeeSalary.entrySet()
		        .stream()
		        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
		        .skip(1)
		        .findFirst()
		        .orElse(null);
		System.out.println(secondHighest);
		
		System.out.println("----------------------");
		
		employeeSalary.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	
	}

}
