package br.com.geekuniversity.secao19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Conjuntos

/*
Os conjuntos são implementados com a interface Set,
e uma das classes que implementam esta interface é
a HashSet

A maioria das coleções possuem os mesmos métodos já conhecidos
e utilizados com as listas, mas o comportamento desses objetos
é um pouso diferente.

A performance também é melhor em conjuntos do que em listas.

Característcas dos conjuntos:
	- Não aceitam valores repetidos;
	- A ordem de inserção não é respeitada (Realiza uma semi-ordenação);
	- Não aceita ordenação;
	- Não possui índice;


 */

public class Programa48 {
	
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		Scanner teclado = new Scanner(System.in);
		boolean res;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o " + (i+1) + "º de 5 nomes: ");
			String nome = teclado.nextLine();
			res = nomes.add(nome);
			
			if (!res) {
				System.out.println("Nome não pode ser repetido.");
				i--;
			}
		}
		
		System.out.println("No conjunto nomes temos " + nomes.size() + " elementos");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		teclado.close();
	}

}
