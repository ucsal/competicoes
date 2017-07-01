import java.util.Scanner;
public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt();
		if (A == B||A==C||B==C||A+B==C||B+C==A|A+C==B){
			System.out.println("S");
		}
		else {
			System.out.println("N");
		}
		sc.close();
	}
	}

}
