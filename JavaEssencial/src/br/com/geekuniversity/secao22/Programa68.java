package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa68 {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		
		System.out.println(palavras);
		
		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("PS4");
		palavras.add("OutLast 2");
		
		palavras.forEach(consumidor); //for each = para cada
		
	}

}
