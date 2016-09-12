package javaProgrammingExamples;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		//Use TreeSet to keep things in order (Set means no duplicate data)
		
		TreeSet<String> names = new TreeSet<>();
		
		names.add("Zeek");
		names.add("Amon");
		names.add("Ray");
		names.add("Bobby");
		names.add("Rich");
		names.add("John");
		names.add("Franco");
		names.add("Butch");
		
		for(String name: names){
			System.out.println("Name: " + name);
		}
		System.out.println("");
		
		
TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(22);
		scores.add(12);
		scores.add(322);
		scores.add(125);
		scores.add(145);
		scores.add(515);
		scores.add(123);
		scores.add(7);
		scores.add(88);
		scores.add(211);
		
		System.out.print("Scores: ");
		for(Integer score:scores){
			System.out.print(score + ", ");
		}
		System.out.println("\n\n");
		System.out.println("Lowest score: " + scores.first());
		System.out.println("Highest score: " + scores.last());
		
		//Try to add score already in the set. No change to set.
		
		scores.add(211);
		System.out.print("Scores: ");
		for(Integer score:scores){
			System.out.print(score + ", ");
		}
	}

}
