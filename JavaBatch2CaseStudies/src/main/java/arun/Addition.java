package arun;

public class Addition implements Operators {
	@Override
	public Double getResult(Double... numbers) {
		Double sum = 0.0;
		for (Double num : numbers) {
			sum += num;
		}
		return sum;
	}
}
