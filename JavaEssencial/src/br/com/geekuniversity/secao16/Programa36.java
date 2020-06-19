package br.com.geekuniversity.secao16;
//Tratando exceções com try/catch

/*
TRY: Tenta realizar algo que pode acarretar no problema;
CATCH: Captura o erro e com isso, oferece ao usuário do ssitema uma msg adequada,
		sem que o sistema quebre.
 */
public class Programa36 {
	public static void main(String[] args) {
		int numeros[] = new int[5];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3 * 2;
		}

		for (int i = 0; i <= numeros.length; i++) {
			try {
				System.out.println(numeros[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Você está tentando acessar uma posição do array que não existe");
			} finally {
				System.out.println("Continua o processo...");
			}

		}
	}
}
