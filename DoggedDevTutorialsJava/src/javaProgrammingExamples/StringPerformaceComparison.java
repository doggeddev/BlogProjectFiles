package javaProgrammingExamples;


/*Comparing performance of String, StringBuffer, and StringBuilder
 * Concatenating String and append method for StringBuffer and StringBuilder.
 * 
 * A new String object has to be instantiated every time a concatenation occurs. 
 */

public class StringPerformaceComparison {

	public static void main(String[] args) {

		String str = "I enjoy Java programming";

		StringBuffer strBuff = new StringBuffer("I enjoy Java programming with String Buffer");
		
		StringBuilder strBuild = new StringBuilder("I enjoy Java programming with String Builder");
		
		System.out.println("Time measured for concatenating 10,000 items");
		
		long time = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++)
			str += "!";
		
		System.out.println("String time: "+ (System.currentTimeMillis() - time));
		
				
		time = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++)
			strBuff.append("!");
		
		System.out.println("StringBuffer time: "+ (System.currentTimeMillis() - time));
		
		time = System.currentTimeMillis();
		for(int i = 0; i < 10000; i++)
			strBuild.append("!");
		
		System.out.println("StringBuilder time: "+ (System.currentTimeMillis() - time));
		
	}

}
