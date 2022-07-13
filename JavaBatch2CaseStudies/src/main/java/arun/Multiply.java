package arun;

public class Multiply implements Operators {
	@Override
	public Double getResult(Double... numbers) {
		Double mul = 1.0;
		for (Double num : numbers) {
			mul *= num;
		}
		return mul;
	}
}
