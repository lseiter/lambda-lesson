package stringoperator.v2;

public class Main {
	public static void main(String[] args) {
		StringOperator exclaim = new StringOperator(){
			@Override
			public String apply(String s) {
				return s + "!";
			}
		};
		
		System.out.println(exclaim.apply("hello"));
		
		StringOperator question = new StringOperator() {
			@Override
			public String apply(String s) {
				return s + "?";
			}
		};
		
		System.out.println(question.apply("hungry"));
		
		StringOperator capitalize = new StringOperator () {
			@Override
			public String apply(String s) {
				if (s == null || s.isEmpty()) 
					return s ;
				return s.substring(0, 1).toUpperCase() + s.substring(1);
			}	
		};
		
		System.out.println(capitalize.apply("fred"));
	}
}
