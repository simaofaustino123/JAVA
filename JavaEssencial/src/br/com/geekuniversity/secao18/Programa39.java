package br.com.geekuniversity.secao18;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

//Object - A m�e de todas as classes

/*
A classe object faz parte do pacote java.lang
 */
public class Programa39 {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente("Angelina Jolie", "Rua 1, 234");
		Cliente cli2 = new Cliente("Felicity Jones", "Rua 2, 345");			
				
		Conta c1 = new Conta(1, 200, 300, cli1);
		Conta c2 = new Conta(2, 200, 300, cli2);
		
		Caixa prateleira = new Caixa();
				
		System.out.println(c1);//por padr�o, a inst�ncia imprime o toString()
		System.out.println(c2);//por padr�o, a inst�ncia imprime o toString()
		
		if (c1.equals(cli1)) {
			System.out.println("S�o a mesma coisa.");
		}else {
			System.out.println("S�o contas diferentes.");
		}
		
		prateleira.adicionar(c1); //posi��o 0
		prateleira.adicionar(c2); //posi��o 1
		
		System.out.println(((Conta)prateleira.pegar(0)).getSaldo());//Cast
		
		prateleira.adicionar(cli1); //posi��o 2
		
		System.out.println(((Cliente)prateleira.pegar(2)).getNome());//Cast
		
		if (cli2 instanceof Conta) {
			System.out.println("O objeto � do tipo Conta");			
		}else{
			System.out.println("O objeto � do tipo Cliente");
		}
	}

}
