package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c");
		  String result = list.stream()
		          .map(x -> x.toUpperCase())
		          .collect(Collectors.joining(","));
		  System.out.println(result);
		  
		  List<Integer> numbers = Arrays.asList(34,56,99,7);
		 // List<Integer> answer = numbers.stream()
			//	  .map(x-> x*x*x && x>50)
			//	  .collect(Collectors.toList());
		//  System.out.println("Prime: "+answer);

	}

}
