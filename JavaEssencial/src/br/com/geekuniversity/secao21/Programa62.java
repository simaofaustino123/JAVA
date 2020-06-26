package br.com.geekuniversity.secao21;
//Filas

/*
- Primeiro que entra é o primeiro que sai
- Todo elemento entra no fim da fila
-  
*/
public class Programa62 {
	public static void main(String[] args) {
		
		Fila fila  = new Fila();
		
		System.out.println(fila);
		
		fila.adiciona("Angelina");
		fila.adiciona("Felicity");
		fila.adiciona("Maria");
		
		System.out.println(fila);
		
		fila.remove();
		System.out.println(fila);
		
	}
}
