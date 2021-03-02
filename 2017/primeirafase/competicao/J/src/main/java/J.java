import java.util.Scanner;

public class J {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String texto;
		texto = scan.next();

		char vet[] = texto.toCharArray();

		int n = 0;

		for (int i = 0; i < texto.length(); i++) {
			n += (vet[i] - '0');
		}
		System.out.println(n % 3);
		scan.close();
	}
}