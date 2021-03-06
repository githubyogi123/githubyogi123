package com.yoga;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//IntStream.range(1, 10)
		//.forEach(System.out::println);
		
		IntStream.range(1, 5)
		.skip(3)
		.forEach(x->System.out.println(x));
		
		IntStream.range(1, 5)
		.skip(3)
		.forEach(System.out::println);
		
		IntStream.range(1, 5)
		.sum();
		System.out.println("============================");
		
		Stream.of("four","three","three")
		.distinct()
		.findFirst()
		.ifPresent(System.out::println);
		System.out.println("============================");
		String[] numbers= {"four1","ehree1","ehree1"};
		
		Arrays.stream(numbers)
		.sorted()
		.distinct()
		.filter(x->x.startsWith("e"))
		.forEach(System.out::println);
		System.out.println("============================");
		
		Stream.of(numbers)
		
		//.distinct()
		.filter(x->x.startsWith("e"))
		.sorted()
		.forEach(System.out::println);
		System.out.println("============================");
		
		int[] intArray={1,2,3,4,5,6,7,8,9};
		
		Arrays.stream(intArray )
		.map(x -> x*x)
		//.average()
		//.ifPresent(System.out::print);
		.forEach(System.out::println);
		System.out.println("============================");
		
		try {
			Stream<String> numberStream=Files.lines(Paths.get("numbers.txt"));
			/*numberStream.distinct()
			.sorted()
			.forEach(System.out::println);*/
			Map<String,String> map=new HashMap<>();
			map=numberStream
					.distinct()
			.map(x-> x.split(","))			
			//.forEach(x->System.out.println(x[0]+ "__"+x[1]));
			.collect(Collectors.toMap(
					
					x-> x[0], 
					
					x->x[1]
					
					));
			//splited.forEach(System.out::println);
			
			numberStream.close();
			
			for (String key : map.keySet()) {
				System.out.println(key+" == "+map.get(key));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
