

public class StringCalculator {

	
	private String delimiter;
	private String numbers;

	private StringCalculator(String delimiter, String numbers) {
		this.delimiter = delimiter;
		this.numbers = numbers;
	}

	private int sum() {
		
		return getNumbers().sum();
	}
	private IntStream getNumbers() {
		if (numbers.isEmpty()) {
			return IntStream.empty();
		} else {
			return Stream.of(numbers.split(delimiter))
					.mapToInt(Integer::parseInt)
					.map(n -> n % 1000);
		}
	}

}
