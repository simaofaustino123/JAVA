package br.com.geekuniversity.secao20;
//Criando e trabalhando com Threads

//Simula��o de gera��o de relat�rio + barra de tarefas
//COM utiliza��o de threads


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
