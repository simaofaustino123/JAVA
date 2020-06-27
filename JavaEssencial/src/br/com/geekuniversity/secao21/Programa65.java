package br.com.geekuniversity.secao21;

import java.util.HashSet;
import java.util.Set;

//IMPLEMENTANDO CONJUNTOS NO JAVA
public class Programa65 {
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		
		System.out.println(nomes);
		nomes.add("Angelina");
		nomes.add("Ana");
		nomes.add("Gabriela");
		nomes.add("Júlia");
		nomes.add("Maria");
		nomes.add("Marta");
		
		System.out.println(nomes);
		
		String nome1 = "Angelina";
		String nome2 = "Ana";
		String nome3 = "Gabriela";
		
		System.out.println(nome1.hashCode());//mostra o índice do nome no conjunto
		System.out.println(nome2.hashCode());
		System.out.println(nome3.hashCode());
		System.out.println("");
	}
}
