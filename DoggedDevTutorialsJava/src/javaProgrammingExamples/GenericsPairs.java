package javaProgrammingExamples;

public class GenericsPairs <T1, T2> {
	private T1 firstItem;
	private T2 secondItem;
	
	public GenericsPairs(T1 first, T2 second){
		this.firstItem = first;
		this.secondItem = second;
	}
	
	public T1 first(){
			return firstItem;
	}
	
	public T2 second(){
		return secondItem;
	}
	
}
