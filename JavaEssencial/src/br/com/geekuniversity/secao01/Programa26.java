package br.com.geekuniversity.secao01;

// Public

/*
 Público - pode ser utilizado em todo projeto
*/

import br.com.geekuniversity.secao11.Cliente;

public class Programa26 {
	public static void main(String[] args) {
		Cliente cli = new Cliente(19, "Angelina Jolie", "Rua da Barra, 256");
		
		System.out.println("Nome: " + cli.getNome());
		System.out.println("Endereço: " + cli.getEndereco());
		
		cli.dizer_oi();
	}

}
