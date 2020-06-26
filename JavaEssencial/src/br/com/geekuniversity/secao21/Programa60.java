package br.com.geekuniversity.secao21;
//PILHAS

/*
Estruturas de dados onde o �ltimo que entrou � o primeiro a sair e vice-versa

- Os elementos, ao serem adicionados em uma pilha,
s�o adicionados sempre no topo

- S� se remove elementos do topo
- S� conseguimos visualizar o topo da pilha
 */


public class Programa60 {
	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		System.out.println(pilha);
		
		pilha.insere("Angelina");
		System.out.println(pilha);
		pilha.insere("Felicity");
		System.out.println(pilha);
		pilha.insere("Nova");
		System.out.println(pilha);
		
		String ret = pilha.pegaTopo();
		System.out.println(ret);
		
		pilha.remove();
		System.out.println(pilha);
		System.out.println(pilha.vazia());
		
		pilha.remove();
		System.out.println(pilha);
		System.out.println(pilha.vazia());
		
		
		pilha.remove();
		System.out.println(pilha);
		System.out.println(pilha.vazia());

	}
}
