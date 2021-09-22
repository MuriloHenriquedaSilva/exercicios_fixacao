package triangulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Triangulo objTriangulo = new Triangulo();

		boolean forInvalido;

		do {
			System.out.print("Informe as medidas dos lados\n" + "A: ");
			objTriangulo.setLadoA(leia.nextDouble());

			System.out.print("B: ");
			objTriangulo.setLadoB(leia.nextDouble());

			System.out.print("C: ");
			objTriangulo.setLadoC(leia.nextDouble());

			System.out.print("\n\nInforne as medidas dos ângulos\n" + "AB: ");
			objTriangulo.setAnguloAB(leia.nextDouble());

			System.out.print("BC: ");
			objTriangulo.setanguloBC(leia.nextDouble());

			System.out.print("CA: ");
			objTriangulo.setAnguloCA(leia.nextDouble());

			forInvalido = !objTriangulo.validarTriangulo();

			if (forInvalido) {
				System.out.println("\nTriângulo inválido\n" + "Informe as medias novamente!\n");
			}

		} while (forInvalido);

		System.out.println("\nDados do triângulo" + objTriangulo);
	}

}
