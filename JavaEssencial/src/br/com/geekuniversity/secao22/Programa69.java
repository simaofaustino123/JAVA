package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classes anônimas

/*
Classes anônimas são classes sem nome.
- Utilizadas quando:
 	- Quando temos interfaces com 01 ou poucos métodos e não
 	precisamos reaproveitar o código da clase, ou seja, se não
 	iremos reaproveitar a classe em um outro lugar do sistema
  	e essa classe que eu criaria somente implementaria uma
  	interfaca com um ou poucos métodos, podemos utilizar o
  	conceito de classes anônimas.
*/
public class Programa69 {

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
		
		Consumer<String> consumidor = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);				
			}			
		};
				
		palavras.forEach(consumidor);
	}

}
