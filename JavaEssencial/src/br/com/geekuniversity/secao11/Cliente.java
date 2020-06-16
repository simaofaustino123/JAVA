package br.com.geekuniversity.secao11;

/*
Protected
	- Faz que o elemento seja visivel somente dentro
	do mesmo pacote onde o elemento foi declarado.
	- Modificador de acesso default - Quando n�o �
	informado qual ser� usado, ele � padr�o.
*/

public class Cliente {
	
	private String nome, endereco;
	
	public Cliente (String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public void dizer_oi(){
		System.out.println(this.nome + " est� dizendo oi!");
	}
		
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
}
