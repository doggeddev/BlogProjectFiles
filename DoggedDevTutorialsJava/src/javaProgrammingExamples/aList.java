package javaProgrammingExamples;

import java.util.ArrayList;

public class aList {
	
	public static void main(String[] args){
		ArrayList<Integer> grades = new ArrayList<Integer>();
		grades.add(100);
		grades.add(90);
		grades.add(80);
		grades.add(70);
		grades.add(60);
		grades.add(50);
		
		int sumOfGrades = 0;
		
		/* 
		 for(int i = 0; i < grades.size(); i++){
		 
			sumOfGrades += grades.get(i);
			}
		*/
		
		for (Integer grade:grades){
			sumOfGrades += grade;
		}
		
		
		double averageOfGrades = sumOfGrades / grades.size();
		System.out.println("Number of grades in the ArrayList: " + grades.size());
		System.out.println("Average of all grades: " + averageOfGrades);
		
		//Remove an element
		grades.remove(4);
		System.out.println("Removing an element now the size is: " + grades.size() );
		
		
	}
}
