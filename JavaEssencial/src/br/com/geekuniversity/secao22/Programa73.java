package br.com.geekuniversity.secao22;
//Lambdas

/*
Expressões lambdas são funções anônimas, ou seja,
funções sem nome.

Quando usar:
	- Já sabemos que podemos utilizar expressões lambdas
	com interfaces funcionais.
	- Deve ser compatível com a função da interface que
	estivermos utilizando.
	
	-- Ex: A interface consumer possui um método que recebe
	uma String e não etorna nada. Por isso foi possível utilizar
	a expressão lambda que passa uma String como parâmetro e
	não retorna nada.
	
	- A função sort espera receber 02 parâmetros do tipo Stirng como
	entrada e retorna um inteiro. Por isso foi possível passar
	a expressão lambda informando as duas Strings, s1 e s2, e utilizando
	a classe Integer.compare que retorna um inteiro.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings("unused")
public class Programa73 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Geek");
		palavras.add("University");
		palavras.add("Java");
		palavras.add("Angelina");
		palavras.add("PS4");
		palavras.add("OutLast 2");

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.forEach((s -> System.out.println(s)));

		// Resumo da linha 21 (acima)
		// Consumer<String> consumer = s -> System.out.println(s);
		// palavras.forEach(consumer);

	}

}
