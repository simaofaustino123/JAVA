package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.List;

//LinkedList
public class Programa58 {

	public static void main(String[] args) {
		List<String> lista = new LinkedList<String>();
		
		lista.add("Felicity");
		lista.add(0, "Maria");
		System.out.println(lista.size());
		System.out.println(lista);
		
		lista.clear();
		
		System.out.println(lista);
	}

}
