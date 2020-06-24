package br.com.geekuniversity.secao20;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

//SYNCRRONIZED

//ESTA THREAD N�O EST� SINCRONIZADA - N�O � EST�VEL

/*
Por padr�o, as threads n�o s�o sincronizadas. Podem ocorrer
problemas de um thread acessar o valor de um objeto que ainda
n�o foi atualizado ou ainda as threads executarem depois do
valor j� estar impresso.
 */

public class Programa53 {
	public static void main(String[] args) {
		Cliente cli1 = new Cliente(37, "Angelina Jolie", "Rua 1");
		Conta c1 = new Conta(1, 200, 300, cli1);//saldo 500
		
		FazDeposito acao = new FazDeposito(c1);
		Thread t1 = new Thread(acao);
		Thread t2 = new Thread(acao);
		
		t1.start();
		t2.start();
		
		System.out.println(c1);
	}
}
