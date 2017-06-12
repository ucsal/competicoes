import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long r = scanner.nextInt(16);
		long g = scanner.nextInt(16);
		long b = scanner.nextInt(16);
		scanner.close();
		long red = 1; //red
		long green = (int) (r / g);
		green = green * green; // green
		long blue = g / b;
		blue = blue * blue;
		blue = blue * green;
		long sum = red + green + blue;
		System.out.println(Long.toHexString(sum));
	}

}
