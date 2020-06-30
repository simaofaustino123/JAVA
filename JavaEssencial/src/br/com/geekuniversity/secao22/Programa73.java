package br.com.geekuniversity.secao22;
//Lambdas

/*
Express�es lambdas s�o fun��es an�nimas, ou seja,
fun��es sem nome.

Quando usar:
	- J� sabemos que podemos utilizar express�es lambdas
	com interfaces funcionais.
	- Deve ser compat�vel com a fun��o da interface que
	estivermos utilizando.
	
	-- Ex: A interface consumer possui um m�todo que recebe
	uma String e n�o etorna nada. Por isso foi poss�vel utilizar
	a express�o lambda que passa uma String como par�metro e
	n�o retorna nada.
	
	- A fun��o sort espera receber 02 par�metros do tipo Stirng como
	entrada e retorna um inteiro. Por isso foi poss�vel passar
	a express�o lambda informando as duas Strings, s1 e s2, e utilizando
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
