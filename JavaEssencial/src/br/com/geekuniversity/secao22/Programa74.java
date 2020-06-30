package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

//Method References

/*
Podem ser consideradas simplificações das expressões lambdas
*/
@SuppressWarnings("unused")
public class Programa74 {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("PS4");
		palavras.add("OutLast 2");
		
		//LAMBDA SEM METHOD REFERENCES
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		//UTILIZANDO METHOD REFERENCES - FORMA 1
		//palavras.sort(Comparator.comparing(String::length));
		
		//UTILIZANDO METHOD REFERENCES - FORMA 2
		
		//Function<String, Integer> tamanho = String::length; // Usando method references
		Function<String, Integer> tamanho = s -> s.length(); //usando lambdas
		Comparator<String> comparador = Comparator.comparing(tamanho);
		palavras.sort(comparador);
		
		System.out.println(palavras);
		
		//palavras.forEach((s -> System.out.println(s)));
		//A linha acima ficaria assim em method references
		palavras.forEach(System.out::println);
	}
}
