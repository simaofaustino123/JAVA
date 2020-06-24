package br.com.geekuniversity.secao11;

/*
Getters e Setters

  Getter
  	- método públixo, que serve para consultar dados;
  	- nomenclatura desses métodos é getNome_do_atributo();
*/

public class Conta {
	@SuppressWarnings("unused")
	private int numero;
	private float saldo;
	private float limite;
	@SuppressWarnings("unused")
	private Cliente cliente;
	
	public Conta() {};

	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}

	public void sacar(float valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
			System.out.println("Saque realizado com sucesso");
		} else if (valor <= (this.saldo + this.limite)) {
			System.out.println("Entrou no limite");
			float val_ret = (valor - this.saldo);
			System.out.println("Val ret limite: " + val_ret);
			this.limite = this.limite - val_ret;
			this.saldo = this.saldo - (valor - val_ret);
			System.out.println("Saque realizado com sucesso");
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}
	/**
	 * Método para realizar depósito
	 * 
	 * @param valor a ser depositado
	 */
	//FORMA 1
	public void depositar(float valor) {
		synchronized (this) {
			this.saldo = this.saldo + valor;
		}
	}
	
//	//FORMA 2
//	public synchronized void depositar(float valor) {
//		this.saldo = this.saldo + valor;
//	}
	
	/**
	 * Método getter do atributo Saldo;
	 * @return a soma do saldo mais limite
	 */
	public float getSaldo() {
		return this.saldo + this.limite;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "O saldo da conta é " + this.getSaldo();
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Conta)) {
			return false;
		}else {
			Conta verificar = (Conta) obj;
			return verificar.getSaldo() == this.getSaldo();
		}
	}

	public int compareTo(Cliente outro) {
		// TODO Auto-generated method stub
		return 0;
	}

}
