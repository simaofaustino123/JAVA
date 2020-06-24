package br.com.geekuniversity.secao20;
/*
Para executar m�todos em paralelo, a classe deve implementar
a interface Runnable, e o m�todo que precisa ser executado
em paralelo deve ser executado dentro do m�todo run
 */

public class GeraRelatorio implements Runnable{
	
	public void run() {
		//for de 0 a 10 milhoes
		for (int i = 0; i < 1000; i++) {
			System.out.println(i + " - Gerando relat�rio...aguarde");
			
		}
	}

}
