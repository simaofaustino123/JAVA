package br.com.geekuniversity.secao11;
//Private

/*
Privado � pr�pria classe - "S� DENTRO DA CLASSE"
*/

public class Programa27 {
	public static void main(String[] args) {
		Cliente cli1 = new Cliente(18, "Felicity", "Rua Qualquer");
		cli1.dizer_oi();
		System.out.println("Nome: " + cli1.getNome());
		System.out.println("Endere�o: " + cli1.getEndereco());

		System.out.println(" ");

		Cliente cli2 = new Cliente(19, "Angelina", "Rua Outra");
		cli2.dizer_oi();
		System.out.println("Nome: " + cli2.getNome());
		System.out.println("Endere�o: " + cli2.getEndereco());
	}
}