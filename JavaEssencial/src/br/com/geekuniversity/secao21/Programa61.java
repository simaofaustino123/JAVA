package br.com.geekuniversity.secao21;

import java.util.Stack;

//Pilhas - Implementação do JAVA


public class Programa61 {

	public static void main(String[] args) {
		Stack<String> nomes = new Stack<String>();
		
		System.out.println(nomes);
		nomes.push("Angelina");//insere
		nomes.push("Felicity");
		System.out.println(nomes);
		
		String ret = nomes.peek();//retorna o elemento do topo
		
		nomes.pop();//remove do topo
		System.out.println(nomes);
		
		System.out.println(ret);
		
	}

}
