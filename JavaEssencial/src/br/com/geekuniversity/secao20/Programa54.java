package br.com.geekuniversity.secao20;
//SYNCHRONIZED
//ESTA THREAD EST� SINCRONIZADA - � EST�VEL 

/*
O sincronismo ocorre pois, durante a execu��o do m�todo, a thread
executa um 'lock'(bloqueio) da fun��o apra que outra thread s� possa
 execut�-la ap�s a finaliza��o da thread inicial  
 */


import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

public class Programa54 {

	public static void main(String[] args) throws InterruptedException {
		Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1);//saldo 500
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		
		// .join = Siginifica que a thread deve se juntar a 
		// um sincronizador
		
		t1.join();//Avisando que a thread 1 deve se juntar a um sincronizador
		t2.join();//Avisando que a thread 1 deve se juntar a um sincronizador
		
		// O sincronizador est� na classe conta: m�todo depositar()
		
		System.out.println(c1);

	}

}
