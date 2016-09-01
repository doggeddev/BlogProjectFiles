/**
 * 
 */
package arraytutorials;
import java.util.Arrays;
/**
 * @author Richard Drexel
 * @version 1.0
 * @since 2016-9-1
 * 
 *        <h1>Array Tutorial</h1>
 *        <p>
 *        Simple example of creating arrays in Java and some of the methods
 *        inherited with the Array class.
 *        </p>
 * 
 */

public class ArrayTutorial1 {

	public static void main(String[] args) {
		// Two ways to create arrays in java: int[] anArray; or int anArray[];
		// Let's create the first array and insert some names in it. Say a list
		// of student names.

		String[] classList; // Here I am simply creating the variable.

		classList = new String[20]; // This is the actual array creation. The
									// array is empty at the moment.

		System.out.println("Print classList[] - Java implements an emply array with null values.");

		for (int index = 0; index < 20; index++) {

			System.out.print(index + ":" + classList[index] + ", ");
		}

		System.out.println("\n\n");

		// Populate array with student names
		classList[0] = "John";
		classList[1] = "Susan";
		classList[2] = "Harry";
		classList[3] = "Jose";
		classList[4] = "Sam";
		classList[5] = "Alexus";
		classList[6] = "Janie";
		classList[7] = "Rich";
		classList[8] = "LJ";
		classList[9] = "Jimmy";
		classList[10] = "Carson";
		classList[11] = "Beth";
		classList[12] = "Robin";
		classList[13] = "Nellie";
		classList[14] = "Bob";
		classList[15] = "Buddy";
		classList[16] = "Debra";
		classList[17] = "Marion";
		classList[18] = "Clark";
		classList[19] = "Misty";

		System.out.println("Print classList[] with student names entered.");

		for (int index = 0; index < 20; index++) {

			System.out.print(index + ":" + classList[index] + ", ");
		}
		
		//Using java.util.Arrays class to sort
		
		Arrays.sort(classList);
		
		
		System.out.println("\n\nPrint classList[] with student names entered and now sorted.");

		for (int index = 0; index < 20; index++) {

			System.out.print(index + ":" + classList[index] + ", ");
		}
		
		System.out.println("\n\nFound Carson at index: " + Arrays.binarySearch(classList, 0, 19, "Carson"));
	}

}
