package br.com.geekuniversity.secao20;

//Criando e trabalhando com Threads

//Simulação de geração de relatório + barra de tarefas
//sem utilização de threads


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
