package br.com.geekuniversity.secao21;

//Conjuntos

/*
- Uma das caracter�sticas dos conjuntos � a 
	n�o aceita��o de elementos repetidos.
	
	- Gera performance
	
	A = ["Angelina", "Angela", "Adriano", ...]
	B = ["Bruna", "Bruno", "Bianca", ...]
	C = ["C�ssia", "Carol", "Camila", ...]
	D = ["Daniela", "Daniel", "Danilo", ...]
	.
	.
	.
	Z

*/

public class Programa64 {
	public static void main(String[] args) {
		
		Conjunto conjunto = new Conjunto();
		
		System.out.println(conjunto);
		
		conjunto.adiciona("Angelina");
		conjunto.adiciona("Felicity");
		conjunto.adiciona("Ana");
		conjunto.adiciona("J�lia");
		conjunto.adiciona("F�bio");
		conjunto.adiciona("Gabriela");
		conjunto.adiciona("Ana");
		
		System.out.println(conjunto);
		
		conjunto.remove("J�lia");
		System.out.println(conjunto);
		conjunto.remove("Simao");
		
	
	}
}