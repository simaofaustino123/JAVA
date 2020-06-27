package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.Queue;

//Fila - Implementação do JAVA
public class Programa63 {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		System.out.println(fila);
		
		fila.add("Angelina");//inserir
		fila.add("Maria");
		fila.add("Felicity");
		
		System.out.println(fila);
		
		String ret = fila.poll();//remover
		System.out.println(ret);
		System.out.println(fila);
	}
}