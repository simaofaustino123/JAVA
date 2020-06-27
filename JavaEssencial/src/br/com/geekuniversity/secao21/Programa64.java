package br.com.geekuniversity.secao21;

//Conjuntos

/*
- Uma das características dos conjuntos é a 
	não aceitação de elementos repetidos.
	
	- Gera performance
	
	A = ["Angelina", "Angela", "Adriano", ...]
	B = ["Bruna", "Bruno", "Bianca", ...]
	C = ["Cássia", "Carol", "Camila", ...]
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
		conjunto.adiciona("Júlia");
		conjunto.adiciona("Fábio");
		conjunto.adiciona("Gabriela");
		conjunto.adiciona("Ana");
		
		System.out.println(conjunto);
		
		conjunto.remove("Júlia");
		System.out.println(conjunto);
		conjunto.remove("Simao");
		
	
	}
}