package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SuppressWarnings("unused")
public class Programa72 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("PS4");
		palavras.add("OutLast 2");

		// Forma 1 - professor
//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length()) {
//				return -1;
//			}
//			if (s1.length() > s2.length()) {
//				return 1;
//			}
//			return 0;
//		});

		// FORMA 2
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// Forma 3 - fiz sozinho
//		palavras.sort(new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				if (s1.length() < s2.length()) {
//					return -1;
//				}
//				if (s1.length() > s2.length()) {
//					return 1;
//				}
//				return 0;
//			}
//		});

		palavras.forEach(s -> System.out.println(s));

	}

}
