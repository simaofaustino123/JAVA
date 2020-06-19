package br.com.geekuniversity.secao15;

/*
 MÉTODOS ESTÁTICOS
 
 Não depende de uma instância da classe para ser utilizado
 
 Pode-se utilizar conforme:
 	- NomeDaClasse.metodo();
 */

public class Programa35 {
	public static void main(String[] args) {
		Conta c1 = new Conta("Lucas");
		System.out.println("Número da conta: " + c1.getNumero());
		System.out.println("Cliente: " + c1.getCliente());
		
		Conta c2 = new Conta("Aline");
		System.out.println("Número da conta: " + c2.getNumero());
		System.out.println("Cliente: " + c2.getCliente());
		
		
		System.out.println("Próxima conta: " + Conta.proximaConta());
	}

}
