package br.com.geekuniversity.secao22;
//MÉTODO COMPARE

/*
Estams criando nosso próprio comparador de objetos (String)
para que seja possível, desta forma, ordenar a String pelo
seu tamanho ao invés de ordem alfabética

RETORNOS DO MÉTODO
1 - String1 é menor que a String2 = return -1
2 - String1 é maior que a String2 = return 1
3 - As Strings tem o mesmo tamanho = return 0

*/

import java.util.Comparator;

public class ComparadorPorTamanho implements Comparator<String> {

	@Override
	
	public int compare(String s1, String s2) {
		//1 - String1 é menor que a String2 = return -1
		if (s1.length() < s2.length()) {
			return -1;
		}
		//2 - String1 é maior que a String2 = return 1
		if (s1.length() > s2.length()) {
			return 1;
		}
		//3 - As Strings tem o mesmo tamanho = return 0
		return 0;
	}
}
