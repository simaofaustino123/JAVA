


public class Pessoa {
	
	String nome, email;
	int ano_nascimento;
	
	//construtor padrão
	public Pessoa() {}
	
	//Construtor com parâmetros
	public Pessoa(String nome, String email, int ano_nascimento) {
		this.nome=nome;
		this.email=email;
		this.ano_nascimento=ano_nascimento;
	}
	
	void imprime_informacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("Ano nascimento: " + this.ano_nascimento);
	}
	
}
