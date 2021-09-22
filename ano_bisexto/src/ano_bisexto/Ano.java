package ano_bisexto;

import java.util.Scanner;

public class Ano {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite um ano: ");
		int ano = teclado.nextInt();

		if (ano % 400 == 0) {
			System.out.println(ano + " é bissexto!");
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " é bissexto!");
		} else {
			System.out.print("Esse ano não é bissexto!");
		}
	}

}
