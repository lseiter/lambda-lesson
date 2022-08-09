package stringoperator.v1;

public class Exclaim implements StringOperator {
	@Override
	public String apply(String s) {
		return s + "!";
	}
}
