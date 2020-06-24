package br.com.geekuniversity.secao21;
//ARMAZENAMENTO SEQUENCIAL

/*
int numeros[]=new int[5];

numeros[0] = 1;
numeros[1] = 3;
numeros[2] = 5;
numeros[3] = 7;
numeros[4] = 9;
 */

public class Programa55 {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Angelina");
		Aluno a2 = new Aluno("Felicity");
		
		Vetor lista = new Vetor();
		
		System.out.println("Total de alunos: " + lista.tamanho());
		
		lista.adiciona(a1);
		System.out.println("Total de alunos: " + lista.tamanho());
		
		lista.adiciona(a2);
		System.out.println("Total de alunos: " + lista.tamanho());
		
		System.out.println(lista);
		
		System.out.println(lista.contem(a1));
		
		try {
			System.out.println(lista.pega(1));
		}catch(IllegalArgumentException e) {
			System.out.println("Não existe aluno na posição informada.");
			System.out.println(e.getMessage());
		}
		
		Aluno a3 = new Aluno("Maria");
		
		try {
			lista.adiciona(1, a3);
		} catch (IllegalArgumentException e) {
			System.out.println("Posição é inválida.");
		}
		
		System.out.println(lista);
		
		lista.remove(0);
		
		System.out.println(lista);
		
		
		
		
		
		
	}
}