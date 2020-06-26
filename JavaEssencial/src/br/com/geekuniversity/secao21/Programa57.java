package br.com.geekuniversity.secao21;

//LISTAS LIGADAS - LINKED LIST

/*
Em um vetor, os elementos estão um ao lado do outro, 
enquanto em uma lista ligada, eles estão/podem estar
em lugares diferentes, porém, um aponta para o outro,
 indicando o próximo elemento.
 
 Ex.:
 [0][3][1][2][5][4][null]
 Cada elemento é uma célula
*/

public class Programa57 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

//		System.out.println(lista);
//		
		lista.adiciona("Angelina");
		System.out.println(lista);
//		
		lista.adiciona("Simão");
//		System.out.println(lista);
//		
		lista.adicionaNoComeco("Felicity");
		System.out.println(lista);
//		
//		lista.adiciona(1, "Xuxa");
//		System.out.println(lista);
//		
//		Object ret = lista.pega(1);
//		System.out.println(ret);
//		
//		System.out.println(lista.tamanho());
		
	
		
		lista.remove(2);
		System.out.println(lista);
		
		System.out.println(lista.contem("Simão"));

	}

}
