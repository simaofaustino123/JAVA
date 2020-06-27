package br.com.geekuniversity.secao21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

	public Conjunto() {
		for (int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}

	private int calculaIndice(String nome) {
		return nome.toLowerCase().charAt(0) % 26;
	}
	
	public void adiciona(String nome) {
		// 1 - Verifica se o nome existe na lista
		if(!contem(nome)) {
			// 2 - Calculando o indicie do nome
			int indice = calculaIndice(nome);
			// 3 - Pegando a lista de acordo com o indice
			List<String> lista = tabela.get(indice);
			// 4 - Adiciona o nome na lista correta
			lista.add(nome);
		}else {
			System.out.println("O nome " + nome.toUpperCase() + " j� est� na lista");
		}
	}
	
	private boolean contem(String nome) {
		// 1 - Calculando o indicie do nome
		int indice = calculaIndice(nome);
		// 2 - Busca o nome  na tabela espec�fica do �ndice
		return tabela.get(indice).contains(nome);
	}
	
	public void remove(String nome) {
		//1 - Verifica se o nome est� em alguma lista
		if(contem(nome)) {
			// 2 - Caso sim, calcula o �ndice do nome
			int indice = calculaIndice(nome);
			// 3 - Pegamos a lista espec�fica do nome
			List<String> lista = tabela.get(indice);
			//4 - Remove o nome da lista 
			lista.remove(nome);
		}else {
			System.out.println("Nome n�o localizado");
		}
	}
	
	@Override
	public String toString() {
		return tabela.toString();
	}

}
