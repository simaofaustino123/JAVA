package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Lambdas

/*
Express�es Lambdas s�o fun��es an�nimas.

Endenta��o no Eclipse: Ctrl + Shift + F
*/

public class Programa71 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		Comparator<String> comparador = new ComparadorPorTamanho();

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("PS4");
		palavras.add("OutLast 2");

		palavras.sort(comparador);

		// Express�o lambda - forma 1
		// '->' = como se estivesse usando o m�todo accept a interface CONSUMER
//		palavras.forEach((String s) -> {
//			System.out.println(s);
//		});

		// Express�o lambda - forma 2
		// S� faz assim pq tem apenas 1 linha de execu��o.
		// Se fossem 02 ou mais, teria que usar da forma 1
		palavras.forEach(s -> System.out.println(s));

	}

}
