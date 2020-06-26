package br.com.geekuniversity.secao21;

public class ListaLigada {

	private Celula primeira = null;
	private Celula ultima = null;
	private int total = 0;

	/**
	 * M�todo que adiciona um objeto no inicio da lista
	 * 
	 * @param elemento
	 */
	public void adicionaNoComeco(Object elemento) {

		if (this.total == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		} else {
			Celula nova = new Celula(elemento, this.primeira);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		this.total++;
	}

	/**
	 * M�todo que adiciona um objeto no fim da lista
	 * 
	 * @param elemento
	 */
	public void adiciona(Object elemento) {
		if (this.total == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			Celula nova = new Celula(elemento);
			this.ultima.setProximo(nova);
			nova.setAnterior(this.ultima);
			this.ultima = nova;
			this.total++;
		}
	}

	/**
	 * M�todo para adicionar um objeto em qlqr posi��o da lista
	 * 
	 * @param posicao
	 * @param elemento
	 */
	public void adiciona(int posicao, Object elemento) {
		if (posicao == 0) {
			this.adicionaNoComeco(elemento);
		} else if (posicao == this.total) {
			this.adiciona(elemento);
		} else {
			Celula anterior = this.pegaCelula(posicao - 1);
			Celula proxima = anterior.getProximo();
			Celula nova = new Celula(elemento, anterior.getProximo());
			anterior.setProximo(nova);
			nova.setAnterior(anterior);
			proxima.setAnterior(nova);
			this.total++;
		}

	}

	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	/**
	 * Remove um objeto de qlqr posi��o
	 * 
	 * @param posicao
	 */
	public void remove(int posicao) {
		//elemento do inicio
		if(posicao == 0) {
			this.removeDoComeco();
		//elemento fim
		}else if(posicao == this.total -1) {
			this.removeDoFim();
		//elemento do meio
		}else {
			Celula anterior = this.pegaCelula(posicao-1);
			Celula atual = anterior.getProximo();
			Celula proxima = atual.getProximo();
			
			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);
			this.total--;
		}

	}

	public void removeDoFim() {
		if (this.total == 1) {
			this.removeDoComeco();
		} else {
			Celula penultima = this.ultima.getAnterior();
			penultima.setProximo(null);
			this.ultima = penultima;
			this.total--;
		}
	}

	public void removeDoComeco() {
		if (this.total == 0) {
			throw new IllegalArgumentException("Lista Vazia");
		}
		this.primeira = this.primeira.getProximo();
		this.total--;

		if (this.total == 0) {
			this.ultima = null;
		}
	}

	public int tamanho() {
		return this.total;
	}

	public boolean contem(Object obj) {
		Celula atual = this.primeira;
		
		while(atual != null) {
			if(atual.getElemento().equals(obj)) {
				return true;
			}
			atual = atual.getProximo();
		}
		return false;
	}

	@Override
	public String toString() {
		if (total == 0) {
			return "[]";
		}
		Celula atual = primeira;
		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < total; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProximo();
		}
		builder.append("]");
		return builder.toString();
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.total;
	}

	private Celula pegaCelula(int posicao) {
		if (!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posi��o inexistente");
		}
		Celula atual = this.primeira;

		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}

}
