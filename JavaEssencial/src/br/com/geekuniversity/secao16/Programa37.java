package br.com.geekuniversity.secao16;

import java.util.Scanner;

public class Programa37 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero para divis�o: ");
		int num1 = teclado.nextInt();
		System.out.println("Informe o primeiro n�mero para divis�o: ");
		int num2 = teclado.nextInt();
		
		try {
			System.out.println("A divis�o de " + num1 + " por " + num2 + " � " + num1/num2 + ".");
		} catch (ArithmeticException e) {
			System.out.println("n�o � poss�vel dividir " + num1 + " por " + num2 + ".");
		}finally {
			System.out.println("Repita isso.");
		}
		
		
		teclado.close();	

	}

}
