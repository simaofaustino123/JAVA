package br.com.geekuniversity.secao12;

/*
 Classe base ou:
 	- Classe mãe
 	- Classe mãe
 	- Super classe
 	- Classe genérica
 */

public class Pessoa {
	
	private String nome;
	private int ano_nascimento;
	private String email;
	
	
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

	
	
	 
		
	
}
