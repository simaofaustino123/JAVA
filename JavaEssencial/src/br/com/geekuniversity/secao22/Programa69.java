package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classes an�nimas

/*
Classes an�nimas s�o classes sem nome.
- Utilizadas quando:
 	- Quando temos interfaces com 01 ou poucos m�todos e n�o
 	precisamos reaproveitar o c�digo da clase, ou seja, se n�o
 	iremos reaproveitar a classe em um outro lugar do sistema
  	e essa classe que eu criaria somente implementaria uma
  	interfaca com um ou poucos m�todos, podemos utilizar o
  	conceito de classes an�nimas.
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
