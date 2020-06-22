package br.com.geekuniversity.secao18;

import br.com.geekuniversity.secao11.Cliente;
import br.com.geekuniversity.secao11.Conta;

//Object - A mãe de todas as classes

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
				
		System.out.println(c1);//por padrão, a instância imprime o toString()
		System.out.println(c2);//por padrão, a instância imprime o toString()
		
		if (c1.equals(cli1)) {
			System.out.println("São a mesma coisa.");
		}else {
			System.out.println("São contas diferentes.");
		}
		
		prateleira.adicionar(c1); //posição 0
		prateleira.adicionar(c2); //posição 1
		
		System.out.println(((Conta)prateleira.pegar(0)).getSaldo());//Cast
		
		prateleira.adicionar(cli1); //posição 2
		
		System.out.println(((Cliente)prateleira.pegar(2)).getNome());//Cast
		
		if (cli2 instanceof Conta) {
			System.out.println("O objeto é do tipo Conta");			
		}else{
			System.out.println("O objeto é do tipo Cliente");
		}
	}

}
