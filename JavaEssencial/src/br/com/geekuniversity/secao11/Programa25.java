package br.com.geekuniversity.secao11;

//ENCAPSULAMENTO
//CAPSULA

public class Programa25 {
	
	public static void main(String[] args) {
		Cliente joao = new Cliente(19, "João da Silva", "Rua da Paz, 45");
		Cliente maria = new Cliente(23, "Maria da Silva", "Rua da Paz, 45");
		
		Conta conta_joao = new Conta(1, 100.0f, 200.0f, joao);
		Conta conta_maria = new Conta(2, 300.0f, 500.0f, maria);
		
		System.out.println("Saldo do João(Antes saque):  " + conta_joao.getSaldo());
		System.out.println("Saldo da Maria: " + conta_maria.getSaldo());
		
		conta_joao.sacar(290);
		System.out.println("Saldo do João(Depois saque):  " + conta_joao.getSaldo());
		
		
		
	}

}
