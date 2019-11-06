package com.training;

import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {

		List<String> nameList=Arrays.asList("Ramesh","Suresh","Magesh");
		
		nameList.forEach(System.out::println);
		
		Book book1 = new Book("The Adventures of Tom Sawyer","Mark Twain" );
		System.out.println(book1.getAuthor());
				
	}

}
