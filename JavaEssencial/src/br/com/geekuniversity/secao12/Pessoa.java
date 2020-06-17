package br.com.geekuniversity.secao12;

/*
 Classe base ou:
 	- Classe mãe
 	- Classe mãe
 	- Super classe
 	- Classe genérica
 */

//Agora é classe abstrata
/*
 Desta forma, impossibilitamos a criação de objetos PESSOA
 
 Uma classe abstrata pode ter:
 	- Atributos;
 	- Métodos;
 	
 		- Métodos abstratos:
 				- São métodos que não possuem implementação. 
 				Possuem apenas declaração, e, obrigatoriamente,
 				as classes que herdarem desta classe com métodos
 				abstratos, precisam implementar tais métodos.
 */
public abstract class Pessoa {

	private String nome;
	private int ano_nascimento;
	private String email;

	public Pessoa() {
	}

	public Pessoa(String nome, int ano_nascimento, String email) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno_nascimento() {
		return this.ano_nascimento;
	}

	public void setAno_nascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + this.nome + "\nAno nascimento: " + this.ano_nascimento + "\n";
	}

	public void mensagem() {
		System.out.println("Esta é a minha msg...");
	}
	
	public void mensagem(String msg) {
		System.out.println(msg);
	}
	
	public void mensagem(String msg, int num) {
		System.out.println(msg + " - " + num);
	}
	
	public abstract void outra_msg(String texto);

}
