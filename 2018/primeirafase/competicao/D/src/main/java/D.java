
import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int aux = 0, n = scan.nextInt();
		int p;
		for (int i = 0; i < n; i++) {
			p = scan.nextInt();
			if (p != 1) {
				aux++;
			}
		}
		System.out.println(aux);
		scan.close();
	}

}