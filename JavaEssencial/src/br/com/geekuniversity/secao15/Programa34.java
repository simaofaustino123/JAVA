package br.com.geekuniversity.secao15;

/*
Atributos e m�todos est�ticos

- Atribustos est�ticos:
	- atributos onde os valores s�o compartilhados entre as
	inst�ncias da classe. 
	
	Para utilizar um atributo est�tio, colocamos o nome da classe
	junto ao atributo.
		Exemplo: NomeDaClasse.atributo;

 */

public class Programa34 {

	public static void main(String[] args) {
		Conta c1 = new Conta("Angelina Jolie");
		System.out.println(c1.getNumero());
		System.out.println(c1.getCliente());
		
		Conta c2 = new Conta("Felicity Jones");
		System.out.println(c2.getNumero());
		System.out.println(c2.getCliente());
		
		Conta c3 = new Conta("Xuxa Meneguel");
		System.out.println(c3.getNumero());
		System.out.println(c3.getCliente());
		
	}
}
