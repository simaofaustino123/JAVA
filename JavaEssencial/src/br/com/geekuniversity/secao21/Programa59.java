package br.com.geekuniversity.secao21;
//Listas duplamente ligadas

public class Programa59 {

	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();

		System.out.println(lista);
		
		lista.adiciona("Angelina");
		System.out.println(lista);
		
		lista.adiciona("Maria");
		System.out.println(lista);
		
		lista.removeDoFim();
		System.out.println(lista);
		lista.removeDoFim();
		System.out.println(lista);

	}

}
