//Every Class must be inside a package.
package Hello.src;


public class Hello {

	public static void main(String[] args) {

		for (int number = 1; number <= 10; number++) {
			System.out.println(String.format("\nmultiplication table of %d", number));
			for (int multiplier = 1; multiplier <= 10; multiplier++) {
				System.out.println(String.format("%d x %d = %d", number, multiplier, number * multiplier));
			}
		}

		}
	}







