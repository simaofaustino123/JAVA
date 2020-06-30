package br.com.geekuniversity.secao22;
//Streams

import java.util.ArrayList;
import java.util.List;

/*
Streams s�o fluxos de dados/objetos, utilizados para que
possamos trabalhar com esses dados de forma mais criteriosa.

- Quando trabalhamos com streams, os m�todo aplicados a este 
stream n�o afetam a cole��o original.
*/
public class Programa76 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programa��o para leigos", 170));
		cursos.add(new Curso("Algoritmos e L�gica de Programa��o: Essencial", 280));
		cursos.add(new Curso("Programa��o em C: Essencial", 125));
		cursos.add(new Curso("Programa��o em JAVA: Essencial", 0));
		cursos.add(new Curso("Programa��o em Python: Essencial", 0));
		cursos.add(new Curso("Banco de dados: Essencial", 0));
		
		//Imprimir somente cursos com mais de 100 alunos
		//cursos.stream().filter(c->c.getAlunos()>=100).forEach(c->System.out.println(c.getNome()));
		//1 - Tranformando a cole��o de cursos em Stream
		cursos.stream()
			//2 - Aplicamos o filtro para pegar curso com 100 ou mais alunos 
			.filter(c -> c.getAlunos() >= 100)
				// 3 - Imprimimos o resultado
				.forEach(System.out::println);	//M�todo acima c/ Lambda	
		
		
	}

}
