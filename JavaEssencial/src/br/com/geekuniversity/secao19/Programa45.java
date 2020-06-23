package br.com.geekuniversity.secao19;
/*
 Arrays (Vetores/matrizes)
 
 - Array tem tamanho fixo: Se criarmos um array com 05
 elementos, ele ter� sempre no m�ximo 05 elementos.
 
 - Um array tem tipo de dado fixo: se criar um array
 de inteiros, poder� s� ter inteiros
 
 - � dif�cil encontrar um elemento em um array: Para isso,
 � necess�rios varrer o array atrav�s do �ndice, caso n�o
 fa�amos busca pelo �ndice.
 
 */

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

/*
 Collections (cole��es)
 - Java possui diversas classes e interclasses que facilitam o 
 trabalho quando se trata de cole��es de dados. Essas classes/interfaces
 s�o chamadas de collections (cole��es). 
 */

/*
 Listas
 - Aceitam repeti��o de valores
 - Tamanho infinito
 - Podemos adicionar valores de qualquer tipo, desde que
 	n�o especifiquemos na declara��o;
 	
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
