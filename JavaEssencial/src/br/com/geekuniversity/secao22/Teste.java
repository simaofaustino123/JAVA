package br.com.geekuniversity.secao22;

public interface Teste {
	
	int VALOR = 9;
	
	public String mensagem();
	
	default void meu_metodo() {
		System.out.println("My default method");
	}
}