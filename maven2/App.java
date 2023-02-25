package com.epizy.zarembovska.maven2;
import java.util.Arrays;
import java.util.stream.Stream;

import com.epizy.zarembovska.mavenlab.Application;


public class App 
{
    public static void main( String[] args )
    {
    	String[] array = {"Java", "javaiscool"};
		Stream<String> streamOfArray = Arrays.stream(array); 
		Application.findCharacters(streamOfArray);
     
    }
}
