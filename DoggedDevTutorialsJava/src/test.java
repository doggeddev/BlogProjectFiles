import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class test {

	public static void insertIntoSorted(int[] ar) {
		// Fill up this function
		int temp = 0;

		if (ar[ar.length - 1] > ar[ar.length - 2]) {
			printArray(ar);
			System.exit(0);

		}

		for (int i = ar.length - 1; i > 0; i--) {

			if (ar[i] < ar[i - 1]) {
				temp = ar[i];
				printArray(ar);

			}

			if (temp != 0){
				ar[i] = ar[i - 1];
				printArray(ar);
			}
			if (ar[i] < temp) {
				ar[i] = temp;
				printArray(ar);
				break;

			}

		 }
		ar[0] = temp;
		printArray(ar);

	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
		in.close();
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
