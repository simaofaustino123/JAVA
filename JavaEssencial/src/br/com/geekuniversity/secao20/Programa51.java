package br.com.geekuniversity.secao20;

//Criando e trabalhando com Threads

//Simula��o de gera��o de relat�rio + barra de tarefas
//sem utiliza��o de threads


/*

 */

public class Programa51 {
	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		barra.run();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		relatorio.run();
		
	}

}
