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
 Os mapas são representados em Java pela interface Map
 e mapeia seus elementos utilizando o conceito de chave/valor
 
 - Mapas são conhecidos como se fossem /representassem 03 coleções:
 	1 - Coleção de chaves
 	2 - Coleção de valores
 	3 - Coleção de associações
 */
public class Programa50 {
	public static void main(String[] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(21, "Felicity Jones");
		pessoas.put(31, "Maria Antonieta");
		pessoas.put(41, "Angelina Jolie");
		
		//Coleção de chaves
		System.out.println("Chaves: " + pessoas.keySet());
		
		//Coleção de valores
		System.out.println("Valores: " + pessoas.values());
		
		//Coleção de associações
		System.out.println("Associação: " + pessoas.entrySet());

		
		
		
		//ITERAR NA COLEÇÃO DE CHAVES
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
		
		
		
		//ITERAR NA COLEÇAO DE VALORES
		
		//Forma 1
		Collection<String> valores = pessoas.values();
		for(String nome : valores) {
			System.out.println(nome);
		}
		
		//Fornma 2
		
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
		
		
		
		//ITERAR NA COLAÇÃO DE ASSOCIAÇÕES
		
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
