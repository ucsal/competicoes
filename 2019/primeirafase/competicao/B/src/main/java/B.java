import java.util.Scanner;

public class B {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int n = scan.nextInt();

		int vet[] = new int[n];
		int aux = 0;
		boolean v = true;
		for (int i = 0; i < n; i++) {
			vet[i] = scan.nextInt();
		}
		aux = vet[0];

		for (int i = 0; i < n; i++) {
			if (aux < vet[i]) {
				v = false;
			}
		}
		if (v) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
		scan.close();
	}

}