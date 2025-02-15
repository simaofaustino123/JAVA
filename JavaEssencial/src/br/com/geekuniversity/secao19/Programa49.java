package br.com.geekuniversity.secao19;

import java.util.HashMap;
import java.util.Map;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

//HashMap

//�o aceita chaves duplicados, por�m, valores sim

/*
 A classe HashMap implementa a interface Map e trabalha com chave/valor
 */

public class Programa49 {
	public static void main(String[] args) {
		Map<String, Conta> contas = new HashMap<String, Conta>();
		
		Cliente cli1 = new Cliente(19, "Angelina Jolie", "Rua 1");
		Cliente cli2 = new Cliente(34, "Felicity Jones", "Rua 1");
		
		Conta c1 = new Conta(1, 200, 300, cli1);
		Conta c2 = new Conta(2, 400, 700, cli2);

		contas.put("Pessoa F�sica", c1);
		contas.put("Pessoa Jur�dica", c2);
		
		System.out.println(contas.size());
		System.out.println(contas.get("Pessoa F�sica"));
		
	}
}
