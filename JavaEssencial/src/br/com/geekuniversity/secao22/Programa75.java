package br.com.geekuniversity.secao22;
//Revis�o

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
- Classes an�nimas;
- Lambdas;
- Mathod references
*/
public class Programa75 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Programa��o para leigos", 170));
		cursos.add(new Curso("Algoritmos e L�gica de Programa��o: Essencial", 280));
		cursos.add(new Curso("Programa��o em C: Essencial", 125));
		cursos.add(new Curso("Programa��o em JAVA: Essencial", 0));
		cursos.add(new Curso("Programa��o em Python: Essencial", 0));
		cursos.add(new Curso("Banco de dados: Essencial", 0));

		//cursos.sort(Comparator.comparing(c -> c.getAlunos())); // Lambda
		cursos.sort(Comparator.comparing(Curso::getAlunos));//Method references

		//System.out.println(cursos);
		
		//cursos.forEach(c -> System.out.println(c.getNome()));//Lambda
		cursos.forEach(System.out::println);//Method references

	}

}
