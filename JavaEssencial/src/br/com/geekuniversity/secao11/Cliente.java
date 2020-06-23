package br.com.geekuniversity.secao11;

/*
Protected
	- Faz que o elemento seja visivel somente dentro
	do mesmo pacote onde o elemento foi declarado.
	- Modificador de acesso default - Quando não é
	informado qual será usado, ele é padrão.
*/

public class Cliente extends Conta implements Comparable<Object> {
	private int idade;
	private String nome, endereco;

	public Cliente(int idade, String nome, String endereco) {
		this.idade = idade;
		this.nome = nome;
		this.endereco = endereco;
	}

	public void dizer_oi() {
		System.out.println(this.nome + " está dizendo oi!");
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + this.nome + "\nIdade: " + this.idade + "\nEndereço: " + this.endereco + "\n";
	}

	@Override
	public int compareTo(Cliente outro) {
		Cliente aux = (Cliente)outro;
		
		if (this.idade < aux.idade) {
			return -1;
		} else if(this.idade>aux.idade) {
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
