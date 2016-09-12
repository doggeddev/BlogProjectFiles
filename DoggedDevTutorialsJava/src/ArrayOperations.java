
public class ArrayOperations extends ArrayTutorial {

	static final int MAX_ITEMS = 1000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sumOfNumbers = 0;
		int[] arrayOfNumbers = new int[MAX_ITEMS];
		
		for (int i = 0; i < arrayOfNumbers.length; i++){
			arrayOfNumbers[i] = randomInt();
		}
		
		for (int i = 0; i < arrayOfNumbers.length; i++){
			sumOfNumbers += arrayOfNumbers[i];
		}
		
		System.out.println(sumOfNumbers);
		
		
		
	}	
	
	private static int randomInt(){
	
		return (int)(Math.random() * 1000) + 1;
	}
}
