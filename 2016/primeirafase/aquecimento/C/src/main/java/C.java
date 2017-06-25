import java.util.Locale;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double h = scanner.nextInt();
		double p = scanner.nextInt();	
		scanner.close();
		double medio = (h / p);
		java.util.Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n",medio);
	}

}
