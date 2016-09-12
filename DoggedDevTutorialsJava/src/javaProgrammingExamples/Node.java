package javaProgrammingExamples;

public class Node<T> {
	private T data;
	public Node<T> next;
	
	public Node(T data){
		this.data = data;
		next = null;
	}

	public T getData(){
		return data;
	}
}
