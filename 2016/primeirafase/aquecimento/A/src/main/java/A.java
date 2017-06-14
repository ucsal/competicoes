//import do java.util.Scanner
import java.util.Scanner;



/**
 * A) Sobre os nomes dos programas
 * 1) Sua solução deve ser chamada <i>codigo_de_problema.c</i>, 
 * <i>codigo_de_problema.cpp</i>, <i>codigo de problema.pas</i>,
 * <i> codigo_de_problema.java</i> ou <i>codigo de problema.py</i>,
 * onde codigo de problema é a letra maiúscula que identifica o problema.
 * 
 * Lembre que em Java o nome da classe principal deve ser igual ao nome do arquivo.
 * 
 * Exemplo:
 * O Codigo do problema Etiquetas Coloridas do Aquecimento 2016 foi A.
 * Então o Arquivo vai se chamar A.java e a classe A.
 * 
 * public class A {
 *    ...
 * }
 *  
 * 
 * @author mariojp
 *
 */
public class A {

	public static void main(String[] args) {
		//Scanner:  Objeto para ler do terminal
		//lembrar do import java.util.Scanner;
		Scanner scanner = new Scanner(System.in);
		//Obtendo o valor em hexa (base 16) e já convertendo para decimal (base 10)
		//scanner.nextInt(16);
		//Lado do post-it Vermelho
		long r = scanner.nextInt(16);
		//Lado do post-it Verde
		long g = scanner.nextInt(16);
		//Lado do post-it Azul
		long b = scanner.nextInt(16);
		//fechando o scanner (opcional)
		scanner.close();
		// numero de post-its vermelhos = 1
		long red = 1; //red
		// numero de post-its verdes: 
		// (red/green)^2
		// dividir o lado do post-it vermelho pelo lado do post-it verde
		long green = (int) (r / g);
		// o resultado multiplicar por ele mesmo
		green = green * green; // green
		
		// numero de post-its azuis: 
		// (green/blue)^2 * green
		// dividir o lado do post-it verde pelo lado do post-it azul
		long blue = g / b;
		// o resultado multiplicar por ele mesmo
		// (descobrimos a quantidade de post-its azuis que cabem em 1 verde)
		blue = blue * blue;
		// o resultado multiplicar pela quantidade de post-its verdes
		blue = blue * green; //blue
		//somamos então a quantidade de post-its vermelhos, verdes e azuis
		long sum = red + green + blue;
		//convertemos novamente de decimal (base 10) para hexadecimal (base 16)
		System.out.println(Long.toHexString(sum));
		
		//Obs.: o uso de long no lugar de int foi necessario pois os casos de testes
		//apresentaram resultados que não cabiam no tipo int.
	}

}
