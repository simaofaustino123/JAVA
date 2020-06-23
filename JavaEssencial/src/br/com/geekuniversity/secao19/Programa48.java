package br.com.geekuniversity.secao19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Conjuntos

/*
Os conjuntos s�o implementados com a interface Set,
e uma das classes que implementam esta interface �
a HashSet

A maioria das cole��es possuem os mesmos m�todos j� conhecidos
e utilizados com as listas, mas o comportamento desses objetos
� um pouso diferente.

A performance tamb�m � melhor em conjuntos do que em listas.

Caracter�stcas dos conjuntos:
	- N�o aceitam valores repetidos;
	- A ordem de inser��o n�o � respeitada (Realiza uma semi-ordena��o);
	- N�o aceita ordena��o;
	- N�o possui �ndice;


 */

public class Programa48 {
	
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		Scanner teclado = new Scanner(System.in);
		boolean res;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o " + (i+1) + "� de 5 nomes: ");
			String nome = teclado.nextLine();
			res = nomes.add(nome);
			
			if (!res) {
				System.out.println("Nome n�o pode ser repetido.");
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
