package br.com.geekuniversity.secao19;
/*
 Arrays (Vetores/matrizes)
 
 - Array tem tamanho fixo: Se criarmos um array com 05
 elementos, ele terá sempre no máximo 05 elementos.
 
 - Um array tem tipo de dado fixo: se criar um array
 de inteiros, poderá só ter inteiros
 
 - É difícil encontrar um elemento em um array: Para isso,
 é necessários varrer o array através do índice, caso não
 façamos busca pelo índice.
 
 */

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

/*
 Collections (coleções)
 - Java possui diversas classes e interclasses que facilitam o 
 trabalho quando se trata de coleções de dados. Essas classes/interfaces
 são chamadas de collections (coleções). 
 */

/*
 Listas
 - Aceitam repetição de valores
 - Tamanho infinito
 - Podemos adicionar valores de qualquer tipo, desde que
 	não especifiquemos na declaração;
 	
 */

public class Programa45 {

	public static void main(String[] args) {
		
		//Sem definir
		ArrayList<String> nomes = new ArrayList<String>();
		
		//Definindo tipo
		//ArrayList nomes = new ArrayList<>();
		
		nomes.add("Maria");
		nomes.add("Felicity");
		nomes.add("Angelina");
		nomes.add("Geek");
		nomes.add("Maria");
		nomes.add("Angelina");
		
				
		//valores qlqr tipo
//		nomes.add(44);
//		nomes.add(true);
//		nomes.add(12.4);
//		nomes.add('e');
		
//		System.out.println(nomes.get(0));
//		System.out.println(nomes.get(3));
		
//		System.out.println(nomes.size());
//		
//		for (int i = 0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));		
//		}
		
		Collections.sort(nomes);
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}

}
