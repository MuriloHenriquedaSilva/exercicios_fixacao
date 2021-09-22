package investigacao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int respostas = 0;
		System.out.println("Ultilize as seguintes opções para responder o questionário: \n 1 - Sim \n 2 - Não ");
		
		System.out.print("Você telefonou para a vítma? ");
		if(teclado.nextInt() == 1) {
			++respostas;
		}
		System.out.print("Esteve no local do crime? ");
		if(teclado.nextInt() == 1) {
			++respostas;
		}
		System.out.print("Mora perto da vítima?  ");
		if(teclado.nextInt() == 1) {
			++respostas;
		}
		System.out.print("Devia para a vítima? ");
		if(teclado.nextInt() == 1) {
			++respostas;
		}
		System.out.print("Já trabalhou com a vítima?");
		if(teclado.nextInt() == 1) {
			++respostas;
		}
		
		if(respostas == 2) {
			System.out.print("Bah meu guri,ta na lista!");
		}else if(respostas ==3 || respostas == 4){
			System.out.print("Tá no bolo ne man!");
		}else if(respostas == 4 ) {
			System.out.print("Bah, é tu!");
		}else{
			System.out.print("Bah,ta sereno pros guri!");
		}
	}

}
