package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	private List<String> nomes = new LinkedList<String>();

	/**
	 * Em uma pilha, inserimos elementos semrpre no topo Na implementação do java
	 * para pilhas (Stack) este método se chama push
	 */
	public void insere(String nome) {
		this.nomes.add(nome);
	}

	/**
	 * Em uma pilham, sempre removemos o elemento do topo * @return Na implementação
	 * do Java para pilhas (Stack) este método se chama POP
	 */
	public String remove() {
		// TODO
		return nomes.remove(nomes.size() - 1);
	}

	public String pegaTopo() {
		return nomes.get(nomes.size() - 1);
	}

	public boolean vazia() {
		return nomes.size() == 0;
	}

	@Override
	public String toString() {
		return this.nomes.toString();
	}

}
