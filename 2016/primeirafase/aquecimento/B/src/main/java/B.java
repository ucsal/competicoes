import java.util.Scanner;

public class B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int l = sc.nextInt();
		int c = sc.nextInt();

		int li = 1;
		int chl = 0;

		int i = 0;
		
		while (i < n) {
			
			String aux = sc.next();
			int t = aux.length();
			
			if (chl + t > c) {
				li++;
				chl = t + 1;
			} else {
				chl += t + 1;
			}
			
			i++;
		}
		
		int res = li / l;
		if (li % l != 0) {
			res++;
		}
		
		System.out.println(res);
	}

}
