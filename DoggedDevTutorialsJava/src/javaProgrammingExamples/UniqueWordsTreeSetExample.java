package javaProgrammingExamples;

import java.util.TreeSet;

public class UniqueWordsTreeSetExample {

	public static void main(String[] args) {
		// The Treeset is great for separating out unique data in an ordered manner.
		// In this example, only the 1 instance of each word is added to the Treeset. 
		
		String text = "morris the martian was flying around the solar system one day when he saw a strange light " +
		"in front of him what is that he thought to himself morris was scared but he flew a little bit closer so " +
		"that he could see it better hello he called out there was no reply hello is anyone there he called but again there was no " + 
		"reply suddenly a creature appeared in front of the light boo it shouted poor morris was really scared and he flew off home " +
		"and hid under his bed";
		
		String[] wordArray = text.split(" ");
		TreeSet<String> wordlist = new TreeSet<>();
		
		for (String word: wordArray){
			wordlist.add(word);
		}
		
		for (String word: wordlist){
			System.out.println(word);
		}
		
		System.out.println("Out of " + wordArray.length + " There are " + wordlist.size() + " unique words");
		
		
	}

}
