package br.com.geekuniversity.secao20;
/*
Para executar métodos em paralelo, a classe deve implementar
a interface Runnable, e o método que precisa ser executado
em paralelo deve ser executado dentro do método run
 */
public class BarraDeProgresso implements Runnable {
	
	public void run() {
		//For de 0 a 10 milihoes
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + " - Barra de progresso...aguarde");
		}
	}
	
	
}
