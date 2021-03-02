import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class M {

	private static Scanner scan;

	public static void main(String[] args) {
		int a1 = 0, a2 = 0, a3 = 0;
		List<Integer> lista = new ArrayList<Integer>();
		scan = new Scanner(System.in);

		a1 = scan.nextInt();
		a2 = scan.nextInt();
		a3 = scan.nextInt();

		lista.add((a2 * 2) + (a3 * 4));
		lista.add((a1 * 2) + (a3 * 2));
		lista.add((a1 * 4) + (a2 * 2));

		Collections.sort(lista);

		System.out.println(lista.get(0));
	}

}