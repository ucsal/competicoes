import java.util.Locale;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ENGLISH);
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();

		Double m = x / y;
		
		System.out.println(String.format(String.format("%.2f", m)));

	}

}
