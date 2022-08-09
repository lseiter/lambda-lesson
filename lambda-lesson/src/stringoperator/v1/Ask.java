package stringoperator.v1;

public class Ask implements StringOperator {
	@Override
	public String apply(String s) {
		return s + "?";
	}
}
