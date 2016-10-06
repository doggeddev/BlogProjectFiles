package javaProgrammingExamples;

public class StringClassComparison {

		
	/*Demonstrating the difference between String, StringBuilder, and StringBuffer*/
	
	
	public static void main(String[] args) {
		String str = "I enjoy Java programming";

		StringBuffer strBuff = new StringBuffer("I enjoy Java programming with String Buffer");
		
		StringBuilder strBuild = new StringBuilder("I enjoy Java programming with String Builder");

		
		System.out.println(str + "----> String hash: " + str.hashCode());
		System.out.println(strBuff + "-----> StringBuffer class hash: " + strBuff.hashCode());
		System.out.println(strBuild + "-----> String Builder class hash: " + strBuild.hashCode());
		System.out.println("");
		System.out.println("String is immutable. A new hash is generated if String changes: str += \"With String\"; ");
		System.out.println("");
		str+= " with String";
		
		System.out.println(str + "----> String hash: " + str.hashCode());
		
		System.out.println("");		
		
		System.out.println("StringBuffer is mutable . The hash remains the same even though it changes: strBuff += \"!!!!!!!!!!\";");
		strBuff.append("!!!!!!!!!!!!");
		System.out.println("");		
		System.out.println(strBuff + "-----> StringBuffer class hash: " + strBuff.hashCode());
		
		System.out.println("");		
		
		System.out.println("StringBuilder is also mutable . The hash remains the same even though it changes: strBuild.append(\"!!!!!!!!!!\");");
		strBuild.append("!!!!!!!!!!!!");
		System.out.println("");		
		System.out.println(strBuild + "-----> String Builder class hash: " + strBuild.hashCode());
	}
	

}
