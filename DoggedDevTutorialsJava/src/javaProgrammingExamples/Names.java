package javaProgrammingExamples;

import java.util.HashSet;

public class Names {

	public static void main(String[] args) {
		
		HashSet<String> names = new HashSet<String>();
		
		names.add("Richard");
		names.add("DoggedDev");
		names.add("Janie");
		names.add("Tunafish");
		names.add("Spelunker");
		names.add("PB and J");
	
		System.out.println("Number of names in HashSet is " + names.size());
		
		printNames(names);
		
		System.out.println("Removing Spelunker");
		names.remove("Spelunker");
		
		System.out.println("Updated HashSet");
		printNames(names);
		
		System.out.println("Adding the name Alexus\n");
		names.add("Alexus");
		System.out.println("Updated HashSet");
		printNames(names);
		
			
	}
	
	private static void printNames(HashSet<String> names){
		for (String name: names){
			System.out.println("Name is: " + name);
		}
		System.out.println("\n");
	}
	
}