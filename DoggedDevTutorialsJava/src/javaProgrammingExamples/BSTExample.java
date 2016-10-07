package javaProgrammingExamples;

public class BSTExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insert(50);
		bst.insert(10);
		bst.insert(30);
		bst.insert(80);
		bst.insert(40);
		bst.insert(56);
		
		bst.printInorder();
		bst.printPreorder();
		bst.printPostorder();
		
		System.out.println(bst.findMaximum());
		System.out.println(bst.findMinimum());
		
		
	}


}