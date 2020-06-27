package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//DEFAULT METHODS

/*
- Novidade implementada a partir da versão 8 do Java

- São métodos concretos, implementados em interfaces.
Por serem concretos, ou seja, já possuem implementação,
não precisam ser implementados nas classes que 
implementarem esta interface.



*/
public class Programa66 {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("PS4");
		palavras.add("OutLast 2");
		
		//Collections.sort(palavras, comparador);
		
		palavras.sort(comparador);
		
		
		System.out.println(palavras);
	}
}
