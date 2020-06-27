package br.com.geekuniversity.secao22;
//M�TODO COMPARE

/*
Estams criando nosso pr�prio comparador de objetos (String)
para que seja poss�vel, desta forma, ordenar a String pelo
seu tamanho ao inv�s de ordem alfab�tica

RETORNOS DO M�TODO
1 - String1 � menor que a String2 = return -1
2 - String1 � maior que a String2 = return 1
3 - As Strings tem o mesmo tamanho = return 0

*/

import java.util.Comparator;

public class ComparadorPorTamanho implements Comparator<String> {

	@Override
	
	public int compare(String s1, String s2) {
		//1 - String1 � menor que a String2 = return -1
		if (s1.length() < s2.length()) {
			return -1;
		}
		//2 - String1 � maior que a String2 = return 1
		if (s1.length() > s2.length()) {
			return 1;
		}
		//3 - As Strings tem o mesmo tamanho = return 0
		return 0;
	}
}
