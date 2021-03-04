import java.util.Scanner;

public class E {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String chave, crip;
		crip = scan.next();
		chave = scan.next();

		char palavra[] = crip.toCharArray();
		char subPalavra[] = chave.toCharArray();

		int aux = 0;

		for (int i = 0; i < palavra.length - subPalavra.length + 1; i++) {
			for (int j = 0; j < subPalavra.length; j++) {
				if (palavra[j + i] == subPalavra[j]) {
					aux++;
					break;
				}
			}
		}

		System.out.println((palavra.length - subPalavra.length + 1) - aux);
		scan.close();
	}

}