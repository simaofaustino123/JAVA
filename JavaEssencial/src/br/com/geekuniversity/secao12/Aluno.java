package br.com.geekuniversity.secao12;

/*
Benef�cios da heran�a:
	- evita a repeti��o de c�digo
	- facilita a manuten��o do programa
	- .....
	
- Classe espec�fica
- Subclasse de pessoa
- ou classe filha
 */

/*Aluno � uma Pessoa
 	- Quando uma classe herda de outra clase ela ganha:
 		- Todos os atributos da classe herdada
 */

public class Aluno extends Pessoa {
	private String ra;
	
	public Aluno(String nome, int ano_nascimento, String email, String ra) {
		super(nome, ano_nascimento, email);
		
		this.ra = ra;
				
	}
	
	
	public String getRa() {
		return this.ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	public String toString() {
		return super.toString() + "R.A.: " + this.ra + "\n";
	}
	
	public String getNome() {
		return super.getNome()
	}
	
	
}
