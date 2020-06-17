package br.com.geekuniversity.secao12;

public class Professor extends Pessoa {
	private String matricula;

	public Professor(String nome, int ano_nascimento, String email, String matricula) {
		super(nome, ano_nascimento,email);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Matricula: " + this.matricula + "\n";
	}
		
	public String getNome() {
		return "Professor: \n" + super.getNome();
	}

	@Override
	public void outra_msg(String texto) {
		// TODO Auto-generated method stub
		System.out.println(texto);
		
	}
	

}
