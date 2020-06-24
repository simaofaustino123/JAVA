package br.com.geekuniversity.secao19;


import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

//Mapas - Interface Map

/*
 Os mapas s�o representados em Java pela interface Map
 e mapeia seus elementos utilizando o conceito de chave/valor
 
 - Mapas s�o conhecidos como se fossem /representassem 03 cole��es:
 	1 - Cole��o de chaves
 	2 - Cole��o de valores
 	3 - Cole��o de associa��es
 */
public class Programa50 {
	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(21, "Felicity Jones");
		pessoas.put(31, "Maria Antonieta");
		pessoas.put(41, "Angelina Jolie");
		
		//Cole��o de chaves
		System.out.println("Chaves: " + pessoas.keySet());
		
		//Cole��o de valores
		System.out.println("Valores: " + pessoas.values());
		
		//Cole��o de associa��es
		System.out.println("Associa��o: " + pessoas.entrySet());

		
		
		
		//ITERAR NA COLE��O DE CHAVES
		//Disponibilizado a partir do Java 8
		
		//Forma 1
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
		

		//Forma 2
		Set<Integer> chaves = pessoas.keySet();
		
		for(Integer idade : chaves) {
			System.out.println(pessoas.get(idade));
			//System.out.println("Nome: " + pessoas.get(idade));
			//System.out.println("Idade: " + idade + "\n");
		}
		
		
		
		//ITERAR NA COLE�AO DE VALORES
		
		//Forma 1
		Collection<String> valores = pessoas.values();
		for(String nome : valores) {
			System.out.println(nome);
		}
		
		//Fornma 2
		
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
		
		
		
		//ITERAR NA COLA��O DE ASSOCIA��ES
		
		//Forma 1
		Set<Entry<Integer, String>> associacoes = pessoas.entrySet();
		for(Entry<Integer, String> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		
		//Forma 2
		pessoas.entrySet().forEach(associacao ->{
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		});
	}
}
