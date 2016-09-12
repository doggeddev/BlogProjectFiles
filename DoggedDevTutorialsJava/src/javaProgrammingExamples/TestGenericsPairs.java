package javaProgrammingExamples;

public class TestGenericsPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsPairs questionAnswer = new GenericsPairs<String, Boolean>("I am forty", false);
		GenericsPairs questionAnswer2 = new GenericsPairs<String, Integer>("I am thirty nine", 39);
		
		System.out.println(questionAnswer.first());
		System.out.println(questionAnswer.second());
		System.out.println(questionAnswer2.first());
		System.out.println(questionAnswer2.second());
	}

}
