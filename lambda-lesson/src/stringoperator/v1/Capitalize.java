package stringoperator.v1;

public class Capitalize implements StringOperator {
	@Override
	public String apply(String s) {
		if (s == null || s.isEmpty()) 
			return s ;
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}
	
}
