package javaProgrammingExamples;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.TreeSet;

public class SpeechComparison {
	
	private static BufferedReader input;
	private static String line = null;
		
	private static String fileName = " ";//location and filename of text file to parse goes here
	
	public static void main(String[] args) {
		
		TreeSet<String> uniqueWords = new TreeSet<>();	
		
		try{
			input = new BufferedReader(new FileReader(fileName));
			while ((line = input.readLine()) != null){
				line = line.trim();
				
				if(!line.equals(" ")){
					
					String[] words = line.split(" ");
					
					for (String word:words){
						uniqueWords.add(word.replaceAll("[^a-zA-Z\\s]", "").replaceAll("\\s+", " "));
					}
					
					
				}
			}
			input.close();
			
			
		}catch (Exception e){
			System.out.println(e.getMessage());
					
		}

		
			System.out.println(uniqueWords.size());
					

	}

}
