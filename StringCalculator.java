

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

}