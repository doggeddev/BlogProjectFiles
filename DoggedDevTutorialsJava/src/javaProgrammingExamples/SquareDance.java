package javaProgrammingExamples;

import java.util.PriorityQueue;
import java.io.*;

public class SquareDance {
	//Simple Square Dance Partnering Simulation
	//People are added to the PriorityQueue and paired up 
	//A standard Queue could easily be used, I just used a Priority Queue to order them
	//Lexically

	public static void main(String[] args) {

		PriorityQueue<String> men = new PriorityQueue<>();
		PriorityQueue<String> women = new PriorityQueue<>();

		String line = null;
		String file = "danceparticpants.txt"; 
		String sex = "";

		BufferedReader input;

		try {
			input = new BufferedReader(new FileReader(file));

			while ((line = input.readLine()) != null) {
				sex = line.substring(0, 1);

				if (sex.equals("M")) {
					men.add(line.substring(2));
				} else {
					women.add(line.substring(2));
				}
			}
			input.close();

		} catch (FileNotFoundException e) {
			System.out.println("File not found, check filename and directory");
			System.exit(1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (!men.isEmpty() && !women.isEmpty()) {
			System.out.println("The partners will be: ");
			System.out.println(men.poll() + " and " + women.poll());
		}

		if (men.isEmpty() && !women.isEmpty()){
			System.out.println("There are " + women.size() + " women waiting to dance");
			System.out.println(women.peek() + " is the next woman dancer");
			}
		if (women.isEmpty() && !men.isEmpty()){
			System.out.println("There are " + men.size() + " men waiting to dance");
			System.out.println(men.peek() + " is the next male dancer");
		}
	}
}

