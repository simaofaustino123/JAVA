package br.com.geekuniversity.secao20;
//Criando e trabalhando com Threads

//Simulação de geração de relatório + barra de tarefas
//COM utilização de threads


/*

*/


public class Programa52 {
	public static void main(String[] args) {
		BarraDeProgresso barra = new BarraDeProgresso();
		Thread t1 = new Thread(barra);
		t1.start();
		
		GeraRelatorio relatorio = new GeraRelatorio();
		Thread t2 = new Thread(relatorio);
		t2.start();
		
	}
}
