package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		//printNumbers(List.of(10, 11, 12, 11, 13, 14, 15, 18, 12, 16));
		//printCourseInd(List.of("Java","Spring","Oracle","Kafka","Spring Boot","SqlDB"));
		
	}

	private static void printCourseInd(List<String> of) {
		of.stream()
		.map(str -> str+" " +str.length())
		.forEach(System.out::println);
		
	}

	private static void printNumbers(List<Integer> of) {
		of.stream()
		.filter(num -> num%2!=0)
		.map(num -> num * num * num)
		.forEach(System.out::println);
	}
	
	private static void removeElements(List<Integer> of) {
		List<Integer> intList = new ArrayList<>();
		int target = 11;
		int[] intArray = new int[]{11,23,45};
		
	}
	

}
