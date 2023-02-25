package com.epizy.zarembovska.mavenlab;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Application {
    public static void findCharacters(Stream<String> stringlist){
    	
    	stringlist.map(s->s.split("")) 
		        .flatMap(Arrays::stream).distinct() 
		        .collect(Collectors.toList()).forEach(System.out::println);
		
    }
}
