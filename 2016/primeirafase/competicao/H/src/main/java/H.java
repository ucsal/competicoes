import java.util.Scanner;

public class H {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String palavra = scan.next().toLowerCase();
		int j = 0, f = 1;
		char [] c = palavra.toCharArray();
		char [] b = new char[50];
		for (int i = 0; i < c.length; i++) {
			if(c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				b[j] = c[i];
				j++;
			}
		}
		
		for (int i = 0; i < j; i++) {
			if(b[i] != b[j-1-i]) {
				f = 0;
				break;
			}
		}
		
		if(f == 0) {
			System.out.println("N");
		}else if(f == 1) {
			System.out.println("S");
		}
		scan.close();
	}

}
