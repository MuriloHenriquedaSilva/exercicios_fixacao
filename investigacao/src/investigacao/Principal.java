package investigacao;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		int respostas = 0;
		System.out.println("Ultilize as seguintes op��es para responder o question�rio: \n 1 - Sim \n 2 - N�o ");
		
		System.out.print("Voc� telefonou para a v�tma? ");
		if(teclado.nextInt() == 1) {
			++respostas;
		}
		System.out.print("Esteve no local do crime? ");
		if(teclado.nextInt() == 1) {
			++respostas;
		}
		System.out.print("Mora perto da v�tima?  ");
		if(teclado.nextInt() == 1) {
			++respostas;
		}
		System.out.print("Devia para a v�tima? ");
		if(teclado.nextInt() == 1) {
			++respostas;
		}
		System.out.print("J� trabalhou com a v�tima?");
		if(teclado.nextInt() == 1) {
			++respostas;
		}
		
		if(respostas == 2) {
			System.out.print("Bah meu guri,ta na lista!");
		}else if(respostas ==3 || respostas == 4){
			System.out.print("T� no bolo ne man!");
		}else if(respostas == 4 ) {
			System.out.print("Bah, � tu!");
		}else{
			System.out.print("Bah,ta sereno pros guri!");
		}
	}

}
