package br.com.geekuniversity.secao12;

/*
Benefícios da herança:
	- evita a repetição de código
	- facilita a manutenção do programa
	- .....
	
- Classe específica
- Subclasse de pessoa
- ou classe filha
 */

/*Aluno é uma Pessoa
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
