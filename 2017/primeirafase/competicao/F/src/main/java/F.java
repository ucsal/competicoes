import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] notas = new int[n];

		int classificados = k;
		for (int i = 0; i < n; i++) {
			notas[i] = scan.nextInt();
		}
		sort(notas, 0, notas.length - 1);
		for (int i = k - 1; i < n; i++) {
			if (i + 1 < notas.length && notas[i + 1] == notas[i]) {
				classificados++;
			} else {
				break;
			}
		}
		System.out.println(classificados);
		scan.close();
	}

	private static void sort(int[] v, int inicio, int fim) {
		int aux, menor, maior, meio;
		meio = v[inicio];
		menor = inicio;
		maior = fim;
		while (menor < maior) {
			while (v[menor] >= meio && menor < fim) {
				menor++;
			}
			while (v[maior] < meio && maior > inicio) {
				maior--;
			}
			if (menor < maior) {
				aux = v[menor];
				v[menor] = v[maior];
				v[maior] = aux;
			}
		}

		v[inicio] = v[maior];
		v[maior] = meio;

		if (inicio < maior && inicio != maior - 1)
			sort(v, inicio, maior - 1);

		if (fim > menor && maior + 1 != fim)
			sort(v, maior + 1, fim);
	}

}