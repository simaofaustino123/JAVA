package br.com.geekuniversity.secao16;
//Tratando exce��es com try/catch

/*
TRY: Tenta realizar algo que pode acarretar no problema;
CATCH: Captura o erro e com isso, oferece ao usu�rio do ssitema uma msg adequada,
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
				System.out.println("Voc� est� tentando acessar uma posi��o do array que n�o existe");
			} finally {
				System.out.println("Continua o processo...");
			}

		}
	}
}
