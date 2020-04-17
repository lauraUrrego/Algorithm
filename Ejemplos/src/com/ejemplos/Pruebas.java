package com.ejemplos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Pruebas {

	public void ComoCome(Animal a) {
		
	}

	public static void main(String[] args) throws IOException{

		// 1. Integer Stream
		System.out.println("Integer Stream");
		IntStream.range(1, 10)
			.forEach(System.out::print);

		// 2. Integer Stream with skip the 5 first elements, and print with a lambda
		// expression
		System.out.println("\n\nInteger Stream with skip and lambda expression");
		IntStream
			.range(1, 10)
			.skip(5)
			.forEach(x -> System.out.println(x));

		
		//3. Integer Stream with sum
		System.out.println("\n\nInteger Stream with sum");
		System.out.println(IntStream.range(1, 5)
				.sum());

		//4. Stream.of sorted and findFirst
		System.out.println("\n\nStream.of sorted and findFirst");
		Stream.of("Ava", "Aneri", "Alberto")
			.sorted()
			.findFirst()
			.ifPresent(System.out::println);

		//5. Stream from array,sort,filter and print
		System.out.println("\n\nStream from array,sort,filter and print");
		String[] names = { "Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Hans", "Shivika" };
		//Stream.of(names).filter(x->x.startsWith("S")).sorted().forEach(System.out::println);
		Arrays.stream(names)
			.filter(x -> x.startsWith("S"))
			.sorted()
			.forEach(System.out::println);
		
		//6. Average of squares of an int array 
		System.out.println("\n\nAverage of squares of an int array ");
		Arrays
			.stream(new int[] {2,4,6,8,10})
			.map(x->x*x)
			.average()
			.ifPresent(System.out::println);
		
		
		//7. Stream from List, filter and print
		System.out.println("\n\nStream from List, filter and print");
		List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika", "Amanda", "Hans", "Shivika");
		people
			.stream()
			.map(String::toLowerCase)
			.filter(x->x.startsWith("a"))
			.forEach(System.out::println);
		
		//8. Stream rows from text file,sort,filter and print
		Stream<String> bands = Files.lines(Paths.get("bands.txt"));
		bands
			.sorted().filter(x -> x.length() > 13)
			.forEach(System.out::println);
		bands.close();
		
	}

}
