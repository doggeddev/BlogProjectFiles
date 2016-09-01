import java.util.Arrays;

/**
 * 
 * @author Richard Drexel
 * @since 2016-09-01
 * @version 1
 * 
 * <h1>Array Tutorial for <a href="http://www.doggeddev.com/">DoggedDev</a></h1>
 * <p>Simple array creation and sorting/searching using java.utils.Arrays class</p>
 *
 */
public class ArrayTutorial {

	public static void main(String[] args) {
		
		System.out.println("Creating array of students\n");
		
		String[] studentArray = new String[10]; 
		
		System.out.println("Student array has been created but is empty. Java fills array with null values.\n");
		
		printArray(studentArray);
		
		System.out.println("Adding 10 names to the array\n");
		
		studentArray[0] = "Richard";
		studentArray[1] = "Johnny";
		studentArray[2] = "Susan";
		studentArray[3] = "Meagan";
		studentArray[4] = "Janie";
		studentArray[5] = "Alexus";
		studentArray[6] = "LJ";
		studentArray[7] = "Rocky";
		studentArray[8] = "Chuck";
		studentArray[9] = "Norris";
		
		System.out.println("Names have been added, here is the updated list: \n");
		
		printArray(studentArray);
		
		System.out.println("Using java.util.Arrays, we can sort the array in ascending order.\n");
		
		Arrays.sort(studentArray);
		
		System.out.println("Now we have an alphabetically sorted list of student names\n");
		printArray(studentArray);
		
		System.out.println("We can quickly find a name in the array and print out it's location(index) in the list using "
				+ "the built in binary search(this only works on sorted arrays).\n");
		
		int index = Arrays.binarySearch(studentArray, "Janie");
	
		System.out.println("The name \"Janie\" was found at location " + index);
		
	}
	
	private static void printArray(String[] arrayToPrint){
		
		
		for (String name : arrayToPrint) {
			System.out.print(name + ", ");
		}
		System.out.println("\n");
	}

}
