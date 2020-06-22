package br.com.geekuniversity.secao18;
//TRABALHANDO COM STRINGS

/*
- Em JAVA, Strings são imutáveis: não mudam.
 
 */
public class Programa41 {

	public static void main(String[] args) {
		String curso = "Programação em JAVA: ESSENCIAL";
		
		//Altera, caso encontre, a 1ª pela 2ª palavra
		//String nova = curso.replace("a", "o");
		//curso = nova;
		
		//curso = curso.toLowerCase();		
		//System.out.println(curso);
		//System.out.println(nova);
		
		
		//curso = curso.toUpperCase();		
		//System.out.println(curso);
		
		//System.out.println(curso.charAt(12));
		
//		for (int i = 0; i < curso.length(); i++) {
//			System.out.print(curso.charAt(i));
//		}
		
		for (int i = (curso.length()) - 1; i>=0; i--) {
			System.out.println(curso.charAt(i));
			
		}
		
		
		
	}	
	
}
