package br.com.geekuniversity.secao17;

import java.util.Scanner;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

/*
 GERANDO EXECUT�VEIS JAR
 
	- JAR - JAVA Archive
	- Archive - Arquivo compactado java
	
	zip/rar
 */

public class Principal {

	// static para acessar dentro de qlqr m�todo
	static Cliente cliente = new Cliente("Angelina Jolie", "Rua da Paz, 45");
	static Conta conta = new Conta(1, 200, 300, cliente);
	static Scanner teclado = new Scanner(System.in);

	public static void depositar() {
		System.out.println("==========DEP�SITO==========");
		System.out.println("Informe o valor do dep�sito: ");
		float valor = teclado.nextFloat();
		if (valor > 0) {
			conta.depositar(valor);
			System.out.println("Dep�sito efetuado com sucesso.");
		} else {
			System.out.println("Valor precisa ser positivo.");
		}
	}

	public static void sacar() {
		System.out.println("==========SAQUE==========");
		System.out.println("Informe o valor do saque: ");
		float valor = teclado.nextFloat();
		if (valor > 0) {
			conta.sacar(valor);
		} else {
			System.out.println("Valor precisa ser positivo");
		}
	}
	
	public static void consultar() {
		System.out.println("Seu saldo � de R$ " + conta.getSaldo() + "");
	}

	public static void main(String[] args) {
		
		int opcao = 0;
		System.out.println("Bem vindo ao Banco Geek, " + cliente.getNome() + "!!!");
		
		do {
			System.out.println("\nSelecione o servi�o desejado: ");
			System.out.println("1 - DEPOSITAR");
			System.out.println("2 - SACAR");
			System.out.println("3 - CONSULTAR SALDO");
			System.out.println("0 - SAIR");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1:
				depositar();				
				break;
			case 2:
				sacar();
				break;
			case 3:
				consultar();
				break;
			case 0:
				break;
			
			default:
				System.out.println("Op��o inv�lida");
			}
			
		} while (opcao>0);
		teclado.close();
		
		

	}

}
