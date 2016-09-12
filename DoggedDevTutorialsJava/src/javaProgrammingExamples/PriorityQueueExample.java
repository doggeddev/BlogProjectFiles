package javaProgrammingExamples;

import java.util.PriorityQueue;

/*Priority Queue is a FIFO structure that is also sorted. */

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<String> line = new PriorityQueue<>();
		
		line.add("David");
		line.add("Seymour");
		line.add("Clayton");
		line.add("John");
		line.add("Cynthia");
		line.add("Alexus");
		line.add("Richard");
		
		for (String name:line){
			System.out.println(name);
		}
		
		System.out.println("");
		
		System.out.println("Remove head element  which is Alexus");
		//Poll removes head element - Alexus
		line.poll();

		for (String name:line){
			System.out.println(name);
		}
		
		System.out.println("");
		
		System.out.println("Remove a specific element - in this case Cynthia");
		line.add("Alexus");
		line.remove("Cynthia");

		for (String name:line){
			System.out.println(name);
		}
		
		System.out.println("\nLook at the head of the Priority Queue using peek (without removing the element): " + line.peek());


		
		
	}

}
