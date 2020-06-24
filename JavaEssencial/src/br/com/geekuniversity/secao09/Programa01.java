package br.com.geekuniversity.secao09;
/* 
 * Construtor sempre tem o nome da sua classe.
 * 
*/

public class Programa01 {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Felicity Jones";
		pessoa1.email = "felicity@gmail.com";
		pessoa1.ano_nascimento = 1986;
				
		Pessoa pessoa2 = new Pessoa("Angelina Jolie", "angelina@gmail.com", 1976);
				
		pessoa1.imprime_informacoes();
		pessoa2.imprime_informacoes();

	}

}