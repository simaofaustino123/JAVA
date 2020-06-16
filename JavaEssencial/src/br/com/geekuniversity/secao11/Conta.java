package br.com.geekuniversity.secao11;

/*
Getters e Setters

  Getter
  	- método públixo, que serve para consultar dados;
  	- nomenclatura desses métodos é getNome_do_atributo();
*/

public class Conta {
	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente;

	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}

	public void sacar(float valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		} else if (valor <= (this.saldo + this.limite)) {
			System.out.println("Entrou no limite");
			float val_ret = (valor - this.saldo);
			System.out.println("Val ret limite: " + val_ret);
			this.limite = this.limite - val_ret;
			this.saldo = this.saldo - (valor - val_ret);
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}

	// Método getter do atributo Saldo;
	public float getSaldo() {
		return this.saldo + this.limite;
	}

}
