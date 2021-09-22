package posto_combustivel;

import java.util.Scanner;

public class Controle_Bomba {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double valorAlcool = 5.06;
		double valorComDescontoAlcool = 4.98;
		double valorDescontoAlcoolMaior = 4.80;
		double valorGasolina = 6.65;
		double valorComDescontoGasolina = 6.45;
		double valorDescontoGasolinaMaior = 6.31;
		int op = teclado.nextInt();
		double litros;

		System.out.println("Qual combustivel você deseja: \n 1 - Gasolina  \n 2 - Alcool ");

		if (op == 1) {
			System.out.println("Insira a quantidade de gasolina :");
			litros = teclado.nextDouble();
			System.out.println("O valor do abastecimento foi: " + litros * valorGasolina);
			if (litros <= 20) {
				System.out.println("O valor do combustivel com 0,02 por cento de desconto é: "
						+ litros * valorComDescontoGasolina);
			} else if (litros > 20) {
				System.out.println("O valor com 0,05 por cento de desconto é: " + litros * valorDescontoGasolinaMaior);
			}

		}
		if (op == 2) {
			System.out.println("Insira a quantidade de álcool :");
			litros = teclado.nextDouble();
			System.out.println("O valor do abastecimento foi: " + litros * valorAlcool);
			if (litros <= 20) {
				System.out.println(
						"O valor do combustivel com 0,02 por cento de desconto é: " + litros * valorComDescontoAlcool);
			} else if (litros > 20) {
				System.out.println("O valor com 0,05 por cento de desconto é: " + litros * valorDescontoAlcoolMaior);
			}

		}
	}
}
