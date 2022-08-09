package stringoperator.v1;

public class Main {
	public static void main(String[] args) {
		StringOperator exclaim = new Exclaim();
		System.out.println(exclaim.apply("hello"));
		
		StringOperator question = new Ask();
		System.out.println(question.apply("hungry"));
		
		StringOperator capitalize = new Capitalize();
		System.out.println(capitalize.apply("fred"));
	}
}
