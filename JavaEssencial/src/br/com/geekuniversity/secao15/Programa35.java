package br.com.geekuniversity.secao15;

/*
 M�TODOS EST�TICOS
 
 N�o depende de uma inst�ncia da classe para ser utilizado
 
 Pode-se utilizar conforme:
 	- NomeDaClasse.metodo();
 */

public class Programa35 {
	public static void main(String[] args) {
		Conta c1 = new Conta("Lucas");
		System.out.println("N�mero da conta: " + c1.getNumero());
		System.out.println("Cliente: " + c1.getCliente());
		
		Conta c2 = new Conta("Aline");
		System.out.println("N�mero da conta: " + c2.getNumero());
		System.out.println("Cliente: " + c2.getCliente());
		
		
		System.out.println("Pr�xima conta: " + Conta.proximaConta());
	}

}
